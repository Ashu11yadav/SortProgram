package com.example.ashutech.myapplication;

/**
 * Created by Ashu.Yadav on 7/13/2017.
 */

class Employee {

    private String name;
    private int salary;

    public Employee(String n, int s){
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}