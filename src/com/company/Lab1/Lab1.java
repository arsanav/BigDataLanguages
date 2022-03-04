package com.company.Lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Lab1 {

//    public static void main(String[] args) {
//        //Var1.2 Создать приложение, которое отображает в окне консоли
//        // аргументы командной строки метода main() в обратном порядке.
//        for (int i = args.length - 1; i >= 0; i--){
//            System.out.println("arg " + i + " = " + args[i]);
//        }
//    }
//     public static void main(String[] args) {
//          //Var 1.3 Создать приложение, выводящее n строк
//          // с переходом и без перехода на новую строку.
//          int n;
//          Scanner scanner = new Scanner(System.in);
//          System.out.print("Введите количество строк: ");
//          if (scanner.hasNextInt()){
//                n = scanner.nextInt();
//          } else {
//                System.out.println("error");
//                n = - 1;
//          }
//          scanner.nextLine();
//          String[] string = new String[n];
//          for (int i = 0; i < n; i++){
//                System.out.print("Введите строку " + i + ": ");
//                string[i] = scanner.nextLine();
//          }

//          for (int i = 0; i < n; i++){
//                System.out.println("Строка " + i + ": " + string[i]);
//          }
//
//            for (int i = 0; i < n; i++){
//                  System.out.print("Строка " + i + ": " + string[i] + " ; ");
//            }
//
//     }
    public static void main(String[] args){
        // Var 2.2, 2.3 Ввести с консоли n целых чисел и поместить их в массив.
        // На консоль вывести: наибольшее и наименьшее число / числа, которые делятся на 3 или на 9
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        if (scanner.hasNextInt()){
              n = scanner.nextInt();
        } else {
              System.out.println("error");
              n = - 1;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            System.out.print("Введите число " + i + ": ");
            if (scanner.hasNextInt()){
                list.add(scanner.nextInt());
            } else {
                System.out.print("error");
            }
        }

        System.out.println("max: " + Collections.max(list));
        System.out.println("min: " + Collections.min(list));

        for (int number : list){
            if (number % 3 == 0){
                System.out.print(number + " ");
            }
        }
    }
}