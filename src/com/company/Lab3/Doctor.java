package com.company.Lab3;

import java.util.HashMap;
import java.util.Objects;

public class Doctor {
    private String name;
    private HashMap<Integer, Patient_1> patientHashMap;

    public Doctor(String name){
        this.name = name;
        patientHashMap = new HashMap<>();
    }

    public void addPatient(int id, Patient_1 patient){
        patientHashMap.put(id, patient);
    }

    public HashMap<Integer, Patient_1> getPatientHashMap() {
        return patientHashMap;
    }

    public void setDiagnosis(Patient_1 patient, String diagnosis, String rec) {
        if (Objects.equals(patient.getDiagnosis(), "-")){
            System.out.println("Диагноз уже поставлен");
        } else {
            patient.setDiagnosis(diagnosis);
            patient.setRec(rec);
            patient.setStatus("Диагноз поставлен, назначено лечение");
        }
    }

    public void write_out(int id) {
        this.patientHashMap.get(id).setRec("Выписан");
    }

}
