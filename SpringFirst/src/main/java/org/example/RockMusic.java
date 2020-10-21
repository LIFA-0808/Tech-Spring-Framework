package org.example;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private static final List<String> rockList = Arrays.asList("Wind cries Mary", "Seven Nation Army", "Creep");

    @Override
    public String getSong() {
        Random random = new Random();
        int randomIndex = random.nextInt(rockList.size());

        return rockList.get(randomIndex);
    }
}
