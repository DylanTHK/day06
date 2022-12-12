package day06;

import java.util.Random;
import java.security.SecureRandom;

public class Day06Thread {
    public static void main(String[] args) {
        Random rand = new SecureRandom();
        for (Integer i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(100));
        }
        System.out.println("All done");
        
    }
}
