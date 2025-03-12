package org.example;

import org.example.command.LieDownCommand;
import org.example.command.StandUpCommand;
import org.example.interfaces.ExerciseCommand;
import org.example.observer.OnlineViewer;
import org.example.observer.FitnessTrainer;
import org.example.observer.Trainee;

public class Main {
    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        FitnessTrainer trainer = new FitnessTrainer();

        // Create some observers
        OnlineViewer viewer1 = new OnlineViewer("Viewer 1");
        OnlineViewer viewer2 = new OnlineViewer("Viewer 2");
        OnlineViewer viewer3 = new OnlineViewer("Viewer 3");

        // Attach these observers
        trainee.attach(viewer1);
        trainee.attach(viewer2);
        trainee.attach(viewer3);

        // Create some commands
        ExerciseCommand lieDown = new LieDownCommand(trainee);
        ExerciseCommand standUp = new StandUpCommand(trainee);

        // Execute the commands
        trainer.giveCommand(lieDown);
        trainer.giveCommand(standUp);
    }
}