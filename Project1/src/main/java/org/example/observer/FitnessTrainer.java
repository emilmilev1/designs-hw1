package org.example.observer;

import org.example.interfaces.ExerciseCommand;

public class FitnessTrainer {
    public void giveCommand(ExerciseCommand command) {
        command.execute();
    }
}
