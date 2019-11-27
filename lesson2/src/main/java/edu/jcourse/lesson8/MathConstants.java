package edu.jcourse.lesson8;

public class MathConstants {
    //static block
    static {
        System.out.println("Message");
    }
    //Static Variable stanovitsja constantoj
    public static final  float PI = 3.14F;
    //Static Method
    public static float sum(float a, float b) {
        return a + b;
    }

}
