package edu.jcourse.lesson5;

public class Employee extends Person {
    private String departamnet;
    private String employeeID;

    public String getDepartamnet() {
        return departamnet;
    }

    public void setDepartamnet(String departamnet) {
        this.departamnet = departamnet;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        String result = getEmployeeID() + "," +
                getFirstname() + ","
                + getLastname() + ","
                + getEmail() + ","
                + getDepartamnet();
        return super.toString();

    }
}
