package edu.jcourse.lesson2.datatypes;



public class InchesToCm {
    public static void main(String[] args) {
        double Inches = Double.parseDouble(args[0]);
        double Cm = Inches * 2.54F;

                 System.out.println("Result:" + Cm);

    }
}
