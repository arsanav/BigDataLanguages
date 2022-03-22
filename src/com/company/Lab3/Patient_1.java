package com.company.Lab3;

public class Patient_1 {
    private String name;
    private String diagnosis;
    private String rec;
    private String status;

    public Patient_1(String name){
        this.name = name;
        this.diagnosis = "-";
        this.rec = "-";
        this.status = "Поступил в больницу";
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
