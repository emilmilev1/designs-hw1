package org.example.observer;

import org.example.interfaces.Observer;

public class OnlineViewer implements Observer {
    private final String name;

    public OnlineViewer(String name) {
        this.name = name;
    }

    @Override
    public void update(String position) {
        System.out.println(name + " is now " + position);
    }
}
