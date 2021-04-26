package org.tyaa.demo.java.interfaces.three;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Injector {
    public static void inject (Object object) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                field.setAccessible(true);
                Object action = null;
                if (field.getDeclaredAnnotation(Inject.class).type().equals("cat")) {
                    action = new IAction () {
                        public void doAction () {
                            System.out.println("Cat:");
                            System.out.println("Breathe lungs");}
                    };
                } else if (field.getDeclaredAnnotation(Inject.class).type().equals("fish")) {
                    action = new IAction () {
                        public void doAction () {
                            System.out.println("Fish:");
                            System.out.println("Breathe gill");
                        }
                    };
                }
                // field.set(object, fieldType.getConstructor(null).newInstance(null));
                field.set(object, fieldType.cast(action));
            }
        }
    }
}
