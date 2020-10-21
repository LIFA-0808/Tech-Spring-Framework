package org.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class PopMusic implements Music {
    private static final List<String> popList = Arrays.asList("New York", "IDOL", "Ice Cream");

    @Override
    public String getSong() {
        Random random = new Random();
        int randomIndex = random.nextInt(popList.size());

        return popList.get(randomIndex);
    }
}
