package com.company.Lab4;

public class Engineer implements Employee{
    private String name;
    private String org_name;
    private int salary;

    public Engineer(String name, String org_name, int salary){
        this.name = name;
        this.org_name = org_name;
        this.salary = salary;
    }

    @Override
    public void getInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", org_name='" + org_name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
