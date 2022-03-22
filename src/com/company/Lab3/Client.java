package com.company.Lab3;

public class Client {

    private int client_id;
    private String name;

    public Client(){
    }

    public Client(int id, String name){
        this.client_id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getClient_Id() {
        return client_id;
    }

    public void setClient_Id(int id) {
        this.client_id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + client_id +
                ", name='" + name + '\'' +
                '}';
    }
}
