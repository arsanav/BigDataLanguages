package com.company.Lab3;

import java.util.Objects;

public class Staff extends Doctor{

    public Staff(String name) {
        super(name);
    }

    @Override
    public void addPatient(int id, Patient_1 patient) {
        super.addPatient(id, patient);
    }

    public boolean checkRec(int id){
        return !Objects.equals(super.getPatientHashMap().get(id).getRec(), "-");
    }

    public void doRec(int id){
        super.getPatientHashMap().get(id).setRec("Вылечен");
    }

}
