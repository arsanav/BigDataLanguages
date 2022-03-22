package com.company.Lab3;

public class Account {
    private Client client;
    private int account_id;
    private int credit_balance;
    private int credit_limit;
    public boolean account_status;

    public Account(Client client, int credit_limit){
        this.client = client;
        this.account_id = client.getClient_Id();
        this.credit_limit = credit_limit;
        this.credit_balance = 0;
        this.account_status = true;
    }

    public int getCredit_balance() {
        return credit_balance;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public int getAccount_id() {
        return account_id;
    }

    public Client getClient() {
        return client;
    }

    public void disableAccount(){
        this.account_status = false;
    }

    public boolean checkAccount(){
        if (!this.account_status){
            System.out.println("Аккаунт аннулирован");
            return false;
        } else {
            return true;
        }
    }

    public void change(int sum){
        if (checkAccount()){
          this.credit_balance += sum;
        }
    }

    public void send(Account account, int sum){
        if (checkAccount()){
            this.change(-sum);
            account.change(sum);
        }
    }

    public void payOrder(Order order){
        if (order.getClient_ID() == this.client.getClient_Id()){
            this.change(-order.getSum());
            order.setStatus();
        } else {
            System.out.println("Заказ не принадлежит клиенту");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "client=" + client +
                ", account_id=" + account_id +
                ", credit_balance=" + credit_balance +
                ", account_status=" + account_status +
                '}';
    }
}
