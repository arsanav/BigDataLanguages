package com.company.Lab3;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab3 {
    //Определить класс Вектор размерности n. Определить несколько конструкторов.
    // Реализовать методы для вычисления модуля вектора, скалярного произведения,
    // сложения, вычитания, умножения на константу.
    // Объявить массив объектов. Написать метод, который для заданной пары векторов будет определять,
    // являются ли они коллинеарными или ортогональными.

    public static void isCollinear_Orthogonal(Vector v1, Vector v2){
        if (v1.getN() != v2.getN()){
            System.out.println("Ошибка размерности");
        }
        boolean isCollinear = true;
        ArrayList<Double> ratio = new ArrayList<>();
        for (int i = 0; i < v1.getN(); i++){
            if ((v1.getData().get(i) != 0 && v2.getData().get(i) == 0) ||
                    (v2.getData().get(i) == 0 && v1.getData().get(i) != 0)){
                isCollinear = false;
                break;
            }
            if (v1.getData().get(i) == 0 && v2.getData().get(i) == 0){
                break;
            }
            ratio.add(v1.getData().get(i)/v2.getData().get(i));
        }
        for (int i = 0; i < v1.getN() - 1; i++){
            if (!Objects.equals(ratio.get(i),ratio.get(i + 1))){
                isCollinear = false;
                break;
            }
        }
        if (isCollinear){
            System.out.println("Вектора коллинеарны");
        } else if (v1.scalar(v2) == 0){
            System.out.println("Вектора ортогональны");
        } else {
            System.out.println("Вектора не коллинеарны и не ортогональны");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        double[] x = new double[3];
        System.out.print("Введите количество векторов: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("error");
            n = -1;
        }

        Vector[] vector_array = new Vector[n];
        Vector first, second;
        System.out.println("Введите координаты векторов: ");
        for (int i = 0; i < n; i++){
            System.out.println("Вектор " + i);
            for (int j = 0; j < 3; j++) {
                if (scanner.hasNextDouble()) {
                 x[j] = scanner.nextDouble();
                } else {
                    System.out.println("error");
                }
            }
            vector_array[i] = new Vector(x);
        }
        System.out.println("Выберите два вектора:");
        if (scanner.hasNextInt()) {
            first = vector_array[scanner.nextInt()];
        } else {
            first = new Vector(3);
            System.out.println("error");
        }
        if (scanner.hasNextInt()) {
            second = vector_array[scanner.nextInt()];
        } else {
            second = new Vector(3);
            System.out.println("error");
        }
        isCollinear_Orthogonal(first, second);
    }

}