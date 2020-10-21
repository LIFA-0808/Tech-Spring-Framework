package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
@Scope
public class ClassicalMusic implements Music{
    private static final List<String> classicalList = Arrays.asList("Hungarian Rhapsody",
            "Handel in the Strand", "Walking in the Air");

    @PostConstruct
    public void doMyInit () {
        System.out.println("Doing my Initialization");
    }
    @PreDestroy
    public void doMyDestroy () {
        System.out.println("Doing my Destruction");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        int randomIndex = random.nextInt(classicalList.size());

        return classicalList.get(randomIndex);
    }
}
