package org.tyaa.demo.java.interfaces.three;

public class Animal implements IAnimal {

    @Inject(type = "fish")
    private IAction action;

    public void breathe () {
        if (action != null) {
            action.doAction();
        }
    }
}
