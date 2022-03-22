package com.company.Lab3;

public class Order {
    private Client client;
    private int order_id;
    private int sum;
    private boolean status;

    public Order(Client client, int id, int sum){
        this.client = client;
        this.order_id = id;
        this.sum = sum;
        this.status = true;
    }

    public int getClient_ID() {
        return client.getClient_Id();
    }

    public int getSum() {
        return sum;
    }

    public void setStatus() {
        this.status = true;
    }
}
