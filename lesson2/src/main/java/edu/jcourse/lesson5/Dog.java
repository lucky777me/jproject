package edu.jcourse.lesson5;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void sayHello() {
        System.out.println(getName() + " says Gav ");

    }



}





