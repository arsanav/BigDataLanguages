package com.company.Lab3;

import java.util.ArrayList;

public class Vector{
    private int n;
    private ArrayList<Double> data;

    public Vector(){
        this.n = 0;
        data = new ArrayList<>();
    }

    public Vector(int n){
        this.n = n;
        data = new ArrayList<>(n);
    }

    public Vector(double... data){
        n = data.length;
        this.data = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            this.data.add(data[i]);
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Vector {" + data + "}";
    }

    public double modulus(){   //модуль
        double mod_sq = 0;
        for (double d : this.data){
            mod_sq += d*d;
        }
        return Math.sqrt(mod_sq);
    }

    public double scalar(Vector v){ //скалярное произведение
        if (n != v.data.size()){
            System.out.println("Ошибочный размер вектора");
        }
        double sc = 0;
        for (int i = 0; i < n; i++){
            sc += this.data.get(i) * v.data.get(i);
        }
        return sc;
    }

    public Vector sum(Vector v){ // сумма
        if (n != v.data.size()){
            System.out.println("Ошибочный размер вектора");
        }
        Vector v_output = new Vector(n);
        for (int i = 0; i < n; i++){
            v_output.data.add(this.data.get(i) + v.data.get(i));
        }
        return v_output;
    }

    public Vector diff(Vector v){ // разность
        if (n != v.data.size()){
            System.out.println("Ошибочный размер вектора");
        }
        Vector v_output = new Vector(n);
        for (int i = 0; i < n; i++){
            v_output.data.add(this.data.get(i) - v.data.get(i));
        }
        return v_output;
    }

    public Vector multi(int c){ // умножение на константу
        Vector v_output = new Vector(this.data.size());
        for (int i = 0; i < n; i++){
            v_output.data.add(this.data.get(i) * c);
        }
        return v_output;
    }

}
