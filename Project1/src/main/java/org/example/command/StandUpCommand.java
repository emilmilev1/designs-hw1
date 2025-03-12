package org.example.command;

import org.example.interfaces.ExerciseCommand;
import org.example.observer.Trainee;

public class StandUpCommand implements ExerciseCommand {
    private final Trainee trainee;

    public StandUpCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        trainee.changePosition("standing up");
    }
}
