package edu.jcourse.lesson5;


public class Tiger extends Animal {
    private String name;
    private int age;


    public Tiger() {
    }

    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public int setAge() {
        return super.setAge();
    }

    public void getAge() {

        super.printAge();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println(getName() + " says Grr");

    }
}