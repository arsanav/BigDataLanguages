package com.company.Lab6;

import java.util.*;

public class Lab6 {
//    public static double mnk(Stack<Double> X, Stack<Double> Y, int n)
//    {
//        double sx2, sxy, buf_u, buf_i;
//        sx2 = sxy = 0.0;
//        for (int i = 0; i < n; i++)
//        {
//            buf_u = Y.pop();
//            buf_i = X.pop();
//
//            sx2+=buf_i * buf_i;
//            sxy+=buf_i * buf_u;
//        }
//
//        return sxy/sx2;
//    }
//
//    public static void main(String[] args){
//        Stack<Double> ii = new Stack<>();
//        Stack<Double> uu = new Stack<>();
//        for(int i = 1; i <= 20; i++){
//            ii.push(((double) i)/10);
//        }
//        uu.push(0.27);
//        uu.push(0.56);
//        uu.push(0.9);
//        uu.push(1.18);
//        uu.push(1.49);
//        uu.push(1.79);
//        uu.push(2.05);
//        uu.push(2.42);
//        uu.push(2.68);
//        uu.push(3.01);
//        uu.push(3.35);
//        uu.push(3.56);
//        uu.push(3.85);
//        uu.push(4.18);
//        uu.push(4.48);
//        uu.push(4.79);
//        uu.push(5.12);
//        uu.push(5.45);
//        uu.push(5.68);
//        uu.push(5.9);
//
//        double q = mnk(ii, uu,20);
//        System.out.println("R=" + q);
//    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n, a, c;
        if (scanner.hasNextInt()){
            n = scanner.nextInt();
        } else {
            System.out.println("error");
            n = - 1;
        }
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for (int i = 0; i < n; i++){
            System.out.print("Введите число " + i + ": ");
            if (scanner.hasNextInt()){
                integerTreeSet.add(scanner.nextInt());
            } else {
                System.out.println("error");
            }
        }
        System.out.println("Исходное множество: " + integerTreeSet);
        Iterator<Integer> iterator = integerTreeSet.iterator();
        for(int i = 0; i < n-1; i++){
            TreeSet<Integer> buf = new TreeSet<>();
            if(iterator.hasNext()){
                a = iterator.next();
            } else {
                System.out.println("error");
                a = -1;
            }
            while(iterator.hasNext()){
                c = a;
                a = iterator.next();
                buf.add(c + a);
            }
            System.out.println("Промужеточное множество: " + buf);
            iterator = buf.iterator();
        }
    }
}
