package com.company.Lab3;

public class Patient {
    private int id;
    private String surname;
    private String name;
    private String lastname;
    private String address;
    private String phone;
    private long card_number;
    private String diagnosis;

    public Patient(){
    }

    public Patient(int id, String surname, String name, String lastname, String address,
                   String phone, long card_number, String diagnosis){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.card_number = card_number;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getCard_number() {
        return card_number;
    }

    public void setCard_number(long card_number) {
        this.card_number = card_number;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", card_number=" + card_number +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
