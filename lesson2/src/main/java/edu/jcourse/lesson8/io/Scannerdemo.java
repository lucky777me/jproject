
package edu.jcourse.lesson8.io;

import edu.jcourse.lesson8.outdemo.SystemOut;

import java.util.Scanner;

public class Scannerdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(
               "First string, \n" +
                       "Second string , \n" +
                       "Third string");


        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine()); // vazhnij metod
        }
       System.out.println("Application started");
        Scanner stringScanner = new Scanner(System.in);
        System.out.println(("A" + stringScanner.next()));
        System.out.println("B" + stringScanner.next());
         int intput1 = stringScanner.nextInt();
         int intput2 = stringScanner.nextInt();


    String s = scanner.nextLine();       // vtoroj metod
        System.out.println(s);
        String s1 = scanner.nextLine();
        System.out.println(s1);

    }
}