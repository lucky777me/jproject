package edu.jcourse.lesson3.Type;

public class ArrayTask2 {
    public static void main(String[] args) {
        int arraySize = 11;
        int sum = 0;
        int average = 0;
        int a[] = new int[arraySize];
        for (int i = 1; i < a.length; i++) {
            a[i] = i * 7;
            sum += a[i];
            average = sum / arraySize;

        }
        System.out.println("Sum:" + sum );
        System.out.println("Average:"+ average);
        for (int v : a) {


            System.out.println("Count:" + v);

        }

    }
}




