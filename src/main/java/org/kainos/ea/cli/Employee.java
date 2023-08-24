package org.kainos.ea.cli;

public class Employee {
    private int employeeID;
    private String name;
    private double salary;
    private String bankAccount;
    private String nationalInsurance;

    public Employee(int employeeID, String name, double salary, String bankAccount, String nationalInsurance) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.bankAccount = bankAccount;
        this.nationalInsurance = nationalInsurance;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public void setNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }
}
