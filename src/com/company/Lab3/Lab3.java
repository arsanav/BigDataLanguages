package com.company.Lab3;

import java.util.Scanner;
import java.util.Random;

public class Lab3 {
    //Определить класс Вектор размерности n. Определить несколько конструкторов.
    // Реализовать методы для вычисления модуля вектора, скалярного произведения,
    // сложения, вычитания, умножения на константу.
    // Объявить массив объектов. Написать метод, который для заданной пары векторов будет определять,
    // являются ли они коллинеарными или ортогональными.

//    public static void isCollinear_Orthogonal(Vector v1, Vector v2){
//        if (v1.getN() != v2.getN()){
//            System.out.println("Ошибка размерности");
//        }
//        boolean isCollinear = true;
//        ArrayList<Double> ratio = new ArrayList<>();
//        for (int i = 0; i < v1.getN(); i++){
//            if ((v1.getData().get(i) != 0 && v2.getData().get(i) == 0) ||
//                    (v2.getData().get(i) == 0 && v1.getData().get(i) != 0)){
//                isCollinear = false;
//                break;
//            }
//            if (v1.getData().get(i) == 0 && v2.getData().get(i) == 0){
//                break;
//            }
//            ratio.add(v1.getData().get(i)/v2.getData().get(i));
//        }
//        for (int i = 0; i < v1.getN() - 1; i++){
//            if (!Objects.equals(ratio.get(i),ratio.get(i + 1))){
//                isCollinear = false;
//                break;
//            }
//        }
//        if (isCollinear){
//            System.out.println("Вектора коллинеарны");
//        } else if (v1.scalar(v2) == 0){
//            System.out.println("Вектора ортогональны");
//        } else {
//            System.out.println("Вектора не коллинеарны и не ортогональны");
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int number, dimension;
//        System.out.print("Введите количество векторов: ");
//        if (scanner.hasNextInt()) {
//            number = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            number = -1;
//        }
//
//        System.out.print("Введите размерность: ");
//        if (scanner.hasNextInt()) {
//            dimension = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            dimension = -1;
//        }
//
//        Vector[] vector_array = new Vector[number];
//        Vector first, second;
//        double[] coords = new double[dimension];
//        System.out.println("Введите координаты векторов: ");
//        for (int i = 0; i < number; i++){
//            System.out.println("Вектор " + i);
//            for (int j = 0; j < dimension; j++) {
//                if (scanner.hasNextDouble()) {
//                 coords[j] = scanner.nextDouble();
//                } else {
//                    System.out.println("error");
//                }
//            }
//            vector_array[i] = new Vector(coords);
//        }
//        System.out.println("Выберите два вектора:");
//        if (scanner.hasNextInt()) {
//            first = vector_array[scanner.nextInt()];
//        } else {
//            first = new Vector(dimension);
//            System.out.println("error");
//        }
//        if (scanner.hasNextInt()) {
//            second = vector_array[scanner.nextInt()];
//        } else {
//            second = new Vector(dimension);
//            System.out.println("error");
//        }
//        isCollinear_Orthogonal(first, second);
//    }



//    //Определить класс Вектор в R3. Реализовать методы для проверки векторов на ортогональность,
//    // проверки пересечения не ортогональных векторов, сравнения векторов.
//    // Создать массив из m объектов. Определить, какие из векторов компланарны.
//    public static void isCoplanar(VectorR3 v1, VectorR3 v2, VectorR3 v3){
//        double m = v1.getX() * v2.getY() * v3.getZ() + v1.getY() * v2.getZ() * v3.getX()
//                 + v1.getZ() * v2.getX() * v3.getY() - v1.getZ() * v2.getY() * v3.getX()
//                 - v1.getX() * v2.getZ() * v3.getY() - v1.getY() * v2.getX() * v3.getZ();
//        if (m == 0){
//            System.out.println("Вектора компланарны");
//        } else {
//            System.out.println("Вектора не компланарны");
//        }
//
//    }
//
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        System.out.print("Введите количество векторов: ");
//        if (scanner.hasNextInt()) {
//            number = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            number = -1;
//        }
//        VectorR3[] vector_array = new VectorR3[number];
//        Random random = new Random();
//        double x1, x2, y1, y2, z1, z2;
//        System.out.println("Введите координаты векторов: ");
//        for (int i = 0; i < number; i++){
//            x1 = random.nextDouble();
//            x2 = random.nextFloat();
//            y1 = random.nextFloat();
//            y2 = random.nextFloat();
//            z1 = random.nextFloat();
//            z2 = random.nextFloat();
//            vector_array[i] = new VectorR3(x1, x2, y1, y2, z1, z2);
//        }
//
//        for (int i = 0; i < number; i++){
//            System.out.println("Вектор " + i + ": " + vector_array[i].toString());
//        }
//
//        for (int i = 0; i < number - 2; i++){
//            for (int j = i + 1; j < number - 1; j++){
//                for (int k = j + 1; k < number; k++){
//                    System.out.print("Вектора " + i + ", " + j + ", " + k + ": ");
//                    isCoplanar(vector_array[i], vector_array[j], vector_array[k]);
//                }
//            }
//        }
//
//    }


    public static void main(String[] args){

    }
}