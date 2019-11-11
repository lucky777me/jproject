package edu.jcourse.lesson5;

public class PersonMain {
    public PersonMain() {
    }

    public static void main(String[] args) {

    Employee employee = new Employee();
    employee.setEmployeeID("11");
     employee.setFirstname("John");
     employee.setLastname("Green");
     employee.setEmail("john.green@gmail.com");
     employee.setDepartamnet("Aplication Development");

     Student student = new Student();
     student.setFirstname("Ivan");
     student.setLastname("Ivanov");
     student.setFaculty("Java Programming");
     student.setEmail("ivan.ivanov@gmail.com");

        System.out.println(employee.getFirstname() + "");
        System.out.println(employee);
        System.out.println(student.toString());


    }


}
