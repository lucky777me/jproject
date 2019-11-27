package edu.jcourse.apps.guessnum;

import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();

        while (true) {

            int randomInt = random.nextInt(100) + 1;

            boolean isLooser = true;


            for (int i = 0; i < 10; i++) {
                System.out.println(" try:" + (i + 1));

                int usernum = askNum();


                if (randomInt > usernum) {
                    System.out.println("My number is more");

                }
                if (randomInt < usernum) {
                    System.out.println("My number is less");
                }

                if (randomInt == usernum) {
                    isLooser = false;
                    System.out.println("You won!");
                    break;  // prekratit` posle 10

                }
            }
            if (isLooser== true) {
                System.out.println("You lost, my friend ,the number was" +  randomInt);
            }
            System.out.println("Do you want to play new game? (y/n)");
            String answer = scanner.next();   //otvet igroka
            if (answer.equals("n")) {
                break;
            }
            System.out.println("Good bye!");
        }
        // if (usernumInt < 0 || usernumInt > 100) {

      //  System.out.println("The Bound is from 0 to 100");
        // }
        // if (usernumInt > 100) {
        //  System.out.println("The Bound if from 0 to 100");


    }


    //}

    static int askNum() {      // esli cdelana oshibka i vmesto chisla push bukva.
        while (true) {          // ubrat return i dobavit` vse v zikl while ili //for(; ; )
            try {
                System.out.println(" choose the number");


                int usernum = scanner.nextInt();



                if (usernum < 0 || usernum > 100) {
                    System.out.println("You have to enter number from 1 to 100");
                } else {

                    return usernum;
                }

            } catch (InputMismatchException e) {
                System.out.println("Oh! It isnt a number");
                scanner.next(); //prosto prochitaj stroku
                                      //return -1;  // nuzhno vernut, znachenie
            }

        }
    }

}





