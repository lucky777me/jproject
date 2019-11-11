package edu.jcourse.lesson3.Type;

public class ArrayTask1 {


    public static void main(String[] args) {
        int arraySize = 11;
        int a[] = new int[arraySize];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        for (int v : a) {


            System.out.println(v);

        }
        for (int b = 9; b < a.length; b--) {
            a[b] = b + 1;
            System.out.println(b);

        }
    }
}










