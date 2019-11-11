package edu.jcourse.lesson5;

public class Circle {

    public float radius;
    private final  float PI = 3.14F;
    public final int MY_CONSTANT = 10;

    public float area() {
        return PI * (radius* radius);
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
