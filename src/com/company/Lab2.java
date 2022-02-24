package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Lab2 {

//    public static void main(String[] args){
//        // Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания
//        // (убывания) значений их длины.
//        int n;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество строк: ");
//        if (scanner.hasNextInt()){
//            n = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            n = - 1;
//        }
//        scanner.nextLine();
//        String[] string = new String[n];
//        for (int i = 0; i < n; i++){
//            System.out.print("Введите строку " + i + ": ");
//            string[i] = scanner.nextLine();
//        }
//
//        String buf;
//        for(int i = string.length - 1 ; i > 0 ; i--){
//            for(int j = 0 ; j < i ; j++){
//                if( string[j].length() > string[j+1].length() ){
//                    buf = string[j];
//                    string[j] = string[j+1];
//                    string[j+1] = buf;
//                }
//            }
//        }
//        System.out.println("Результат:");
//        for(int i = 0; i < string.length; i++){
//            System.out.println(string[i]);
//        }
//    }


//    public static void main(String[] args){
//        // Ввести n строк с консоли. Вывести на консоль те строки,
//        // длина которых меньше (больше) средней, а также длину.
//        int n;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество строк: ");
//        if (scanner.hasNextInt()){
//            n = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            n = - 1;
//        }
//        scanner.nextLine();
//        String[] string = new String[n];
//        for (int i = 0; i < n; i++){
//            System.out.print("Введите строку " + i + ": ");
//            string[i] = scanner.nextLine();
//        }
//
//        int sum_length = 0;
//        for (String temp_string : string){
//            sum_length += temp_string.length();
//        }
//        float avg = (float) sum_length / string.length;
//        boolean flag = false;
//        System.out.println("Средняя длина = " + avg);
//        System.out.println("Строки, длинее средней:");
//        for (String temp_string : string){
//            if (temp_string.length() > avg){
//                System.out.println(temp_string + ", длина: " + temp_string.length());
//                flag = true;
//            }
//        }
//        if (flag == false){
//            System.out.println("Таких строк нет");
//        }
//    }


//    public static void main(String[] args){
//        // Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
//        Scanner scanner = new Scanner(System.in);
//        int n;
//        int[][] matrix;
//        System.out.print("Введите размерность матрицы: ");
//        if (scanner.hasNextInt()){
//            n = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            n = -1;
//        }
//
//        matrix = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("Введите элемент [" + i + "][" + j + "]: ");
//                if (scanner.hasNextInt()) {
//                    matrix[i][j] = scanner.nextInt();
//                } else {
//                    System.out.println("error");
//                }
//            }
//        }
//
//        System.out.println("Введенная матрица:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int k = 0;
//        System.out.print("Введите количество позиций: ");
//        if (scanner.hasNextInt()) {
//            k = scanner.nextInt();
//        } else {
//            System.out.println("error");
//        }
//
//        int temp;
//        for (int i = 0; i < n; i++) {
//                temp = matrix[i][0];
//                for (int j = 0; j < n - 1; j++) {
//                        matrix[i][j] = matrix[i][j + 1];
//                }
//                matrix[i][n-1] = temp;
//        }
//
//        System.out.println("Сдвиг влево:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        for (int j=0; j<n; j++) {
//            temp = matrix[n-1][j];
//            for (int i = n - 1; i > 0; i--) {
//                matrix[i][j] = matrix[i - 1][j];
//            }
//            matrix[0][j] = temp;
//        }
//
//        System.out.println("Сдвиг вниз:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        for (int j = 0; j < n; j++) {
//            temp = matrix[0][j];
//            for (int i = 0; i < n - 1; i++) {
//                matrix[i][j] = matrix[i + 1][j];
//            }
//            matrix[n - 1][j] = temp;
//        }
//
//        System.out.println("Сдвиг вверх:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        // Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
        Scanner scanner = new Scanner(System.in);
        int n;
        int[][] matrix;
        System.out.print("Введите размерность матрицы: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("error");
            n = -1;
        }

        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Введите элемент [" + i + "][" + j + "]: ");
                if (scanner.hasNextInt()) {
                    matrix[i][j] = scanner.nextInt();
                } else {
                    System.out.println("error");
                }
            }
        }

        System.out.println("Введенная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int temp, number = 0, z = 0;
        int[] arr = new int[n * n];
        for(int[] string : matrix){
            for(int el : string){
                arr[z++] = el;
            }
        }

        int desc = 0, desc_max = 0, asc = 0, asc_max = 0, index_desc = 0, index_asc = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]){
                asc += 1;
                if (asc > asc_max){
                    asc_max = asc;
                    index_asc = i + 1;
                }
            } else {
                asc = 0;
            }

            if (arr[i] > arr[i + 1]){
                desc += 1;
                if (desc > desc_max){
                    desc_max = desc;
                    index_desc = i + 1;
                }
            } else {
                desc = 0;
            }
        }

        System.out.print("max возрастающая последовательность из " + (asc_max + 1) + ": ");
        while (asc_max + 1 != 0){
            System.out.print(arr[index_asc-asc_max--] + " ");
        }
        System.out.print("\nmax убывающая последовательность из " + (desc_max + 1) + ": ");
        while (desc_max + 1 != 0){
            System.out.print(arr[index_desc-desc_max--] + " ");
        }
    }
}