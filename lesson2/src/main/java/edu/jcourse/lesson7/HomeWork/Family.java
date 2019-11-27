package edu.jcourse.lesson7.HomeWork;



public abstract class Family {

        String Name;
        String Surname;
        String Gender;
        int age;
        float height;
        int weight ;
        public double BMI ;

        public void setBMI(double BMI) {
        this.BMI = BMI;
    }
    public double getBMI() {
        return ( getWeight() / ( getHeight() * getHeight() ) );
    }

    public Family() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return super.toString();
    }

}





