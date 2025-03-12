package org.example.command;

import org.example.interfaces.ExerciseCommand;
import org.example.observer.Trainee;

public class LieDownCommand implements ExerciseCommand {
    private final Trainee trainee;

    public LieDownCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        trainee.changePosition("lying down");
    }
}
