package com.company.Lab4;

public class Supervisor extends Engineer{
    private int sub_number;

    public Supervisor(String name, String org_name, int scalary, int sub_number){
        super(name, org_name, scalary);
        this.sub_number = sub_number;
    }

    @Override
    public void getInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Supervisor{" + super.toString() +
                "sub_number=" + sub_number +
                '}';
    }
}
