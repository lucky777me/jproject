package edu.jcourse.lesson7.HomeWork;



public class FamilyMain {


    public static void main(String[] args) {

        Father father = new Father();
       father.setGender(" male ");
       father.setName(" Valera ");
       father.setSurname(" Ivanov ");
       father.setAge(35);
       father.setHeight(1.9F);
       father.setWeight(90);
       father.setBMI(90 / (1.9F * 1.9F));

        Mother mother = new Mother();
        mother.setGender(" female ");
        mother.setName(" Anna ");
        mother.setSurname(" Ivanova ");
        mother.setAge( 32 );
        mother.setHeight ( 1.7F );
        mother.setWeight( 56 );
        mother.setBMI(56 / (1.75F * 1.75F));


        Kid1 kid1 = new Kid1();
        kid1.setGender(" female ");
        kid1.setName(" Lena ");
        kid1.setSurname(" Ivanova ");
        kid1.setAge( 15 );
        kid1.setHeight( 1.6F );
        kid1.setWeight( 48 );
        kid1.setBMI(48 / (1.6F * 1.6F));



        System.out.println(father.getName() + father.getSurname() + father.getGender() + father.getAge() + " " + father.getHeight() + " " + father.getWeight());
        System.out.println(mother.getName() + mother.getSurname() + mother.getGender() + mother.getAge() + " " + mother.getHeight() + " " + mother.getWeight());
        System.out.println(kid1.getName() + kid1.getSurname() + kid1.getGender() + kid1.getAge() + " " + kid1.getHeight() + " " +  kid1.getWeight());
        System.out.println ("BMI:" + father.getBMI());
        System.out.println("BMI:" + mother.getBMI());
        System.out.println("BMI:" + kid1.getBMI());

    }
    // a nado li tak?




}
