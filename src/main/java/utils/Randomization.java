package utils;

import enums.ProjectType;
import java.util.Random;

public class Randomization {

    public static String getRandomString(int length) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'

        Random random = new Random();
        StringBuilder buffer = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }

    public static int getRandomInt(int rightBound) {
        Random rnd = new Random();
        return rnd.nextInt(rightBound);
    }

    public static ProjectType getRandomType () {
        Random rnd = new Random();

        return ProjectType.values()[rnd.nextInt(ProjectType.values().length)];
    }
}
