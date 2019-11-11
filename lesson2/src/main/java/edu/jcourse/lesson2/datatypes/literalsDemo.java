package edu.jcourse.lesson2.datatypes;




public class literalsDemo {
    public static void main(String[] args) {
        long var1 = 12_345L;
                float f = var1 * 2.54F;
                int hex = 0xFF;
        System.out.println(hex);
        // Single quotes \'
        System.out.println("It\'s my computer");
        // Double quotes
        System.out.println("\"Java\" is a programing language");

        System.out.println("My path is : C:\\devtools");
        //New line \n
        System.out.println("First line. \nSecond line.");
        //Back to one position \b
        System.out.println("Text\b\b\b");
        //Hex \\uxxxx
        System.out.println("\u2764");
        //tab \t
        System.out.println("Nr\tItem\tComment\t");
        System.out.println("1\tone\t\tMy Comment\t");
    }


}
