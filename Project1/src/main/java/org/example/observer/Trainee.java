package org.example.observer;

import org.example.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Trainee {
    private final List<Observer> observers = new ArrayList<>();
    private String position;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(position);
        }
    }

    public void changePosition(String newPosition) {
        position = newPosition;
        System.out.println("Trainee is now " + position);
        notifyObservers();
    }
}
