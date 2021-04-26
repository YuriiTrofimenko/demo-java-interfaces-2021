package org.tyaa.demo.java.interfaces.two;

public class Animal implements IAnimal {

    private IAction action;

    public Animal(IAction action) {
        this.action = action;
    }

    public void breathe () {
        if (action != null) {
            action.doAction();
        }
    }

    public void breathe (IAction action) {
        action.doAction();
    }

    public void setAction(IAction action) {
        this.action = action;
    }
}
