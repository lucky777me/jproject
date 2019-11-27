package edu.jcourse.lesson9;

import java.util.Random;
import java.util.Scanner;

public class GenRandom {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        // milliseconds from 1970- 01 - 01 00 00
        Random random = new Random();

        int randomInt = random.nextInt(100) + 1;
        System.out.println(randomInt);

    }

}
