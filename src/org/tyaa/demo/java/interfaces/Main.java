package org.tyaa.demo.java.interfaces;

/* import org.tyaa.demo.java.interfaces.one.Cat;
import org.tyaa.demo.java.interfaces.one.Fish;
import org.tyaa.demo.java.interfaces.two.Animal;
import org.tyaa.demo.java.interfaces.two.IAnimal; */

import org.tyaa.demo.java.interfaces.three.Animal;
import org.tyaa.demo.java.interfaces.three.IAnimal;
import org.tyaa.demo.java.interfaces.three.Injector;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        /* One */
        // List<IAnimal> animals = List.of(new Cat(), new Fish());
        // animals.forEach(animal -> animal.breathe());
        /* Two */
        /* List<IAnimal> animals = List.of(
            new Animal(() -> {
                System.out.println("Cat:");
                System.out.println("Breathe lungs");
            }),
            new Animal(() -> {
                System.out.println("Fish:");
                System.out.println("Breathe gill");
            })
        );
        animals.forEach(animal -> animal.breathe()); */
        /* Three */
        IAnimal cat = new Animal();
        Injector.inject(cat);
        cat.breathe();
    }
}
