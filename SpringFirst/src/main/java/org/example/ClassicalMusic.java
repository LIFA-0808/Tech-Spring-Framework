package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic () {}

    public static ClassicalMusic getClassicalMusic () {
        return new ClassicalMusic();
    }

    public void doMyInit () {
        System.out.println("Doing my Initialization");
    }

    public void doMyDestroy () {
        System.out.println("Doing my Destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
