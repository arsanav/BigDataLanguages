package com.company.Lab3;

import java.util.*;

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



//    // Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
//    // Создать массив объектов. Вывести: a) список покупателей в алфавитном порядке;
//    // b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
//    public static void sorting(ArrayList<Customer> customers){
//        System.out.println("Сортировка:");
//        Comparator<Customer> CustomersComparator
//                = Comparator.comparing(Customer::getSurname);
//        customers.sort(CustomersComparator);
//        for (Customer customer:customers){
//            System.out.println(customer);
//        }
//    }
//
//    public static void credit_select(ArrayList<Customer> customers, long credit_start, long credit_end){
//        System.out.println("Карты из диапазона:");
//        for (Customer customer:customers){
//            if ((customer.getCredit_card() > credit_start) && (customer.getCredit_card() < credit_end)){
//                System.out.println(customer);
//            }
//        }
//    }
//
//    public static void main(String[] args){
//        ArrayList<Customer> customers = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        System.out.print("Введите количество покупателей: ");
//        if (scanner.hasNextInt()) {
//            number = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            number = -1;
//        }
//
//        for (int i = 0; i < number; i++){
//            Customer customer = new Customer();
//            customer.setId(i + 1);
//            System.out.println("Покупатель " + i + ":");
//            System.out.print("Введите фамилию: ");
//            if (scanner.hasNext()) {
//                customer.setSurname(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите имя: ");
//            if (scanner.hasNext()) {
//                customer.setName(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите отчество: ");
//            if (scanner.hasNext()) {
//                customer.setLastname(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите номер карты: ");
//            if (scanner.hasNextLong()) {
//                customer.setCredit_card(scanner.nextLong());
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите номер счета: ");
//            if (scanner.hasNextLong()) {
//                customer.setBank_acc(scanner.nextLong());
//            } else {
//                System.out.println("error");
//            }
//            customers.add(customer);
//        }
//        sorting(customers);
//        credit_select(customers, 0,110000000 );
//
//    }




//    public static void same_diagnosis(ArrayList<Patient> patients, String diagnosis){
//        System.out.println("Пациенты с диагнозом: " + diagnosis);
//        for (Patient patient:patients){
//            if (patient.getDiagnosis().equals(diagnosis)){
//                System.out.println(patient);
//            }
//        }
//    }
//
//    public static void card_select(ArrayList<Patient> patients, long card_start, long card_end){
//        System.out.println("Карты из диапазона:");
//        for (Patient patient:patients){
//            if ((patient.getCard_number() > card_start) && (patient.getCard_number() < card_end)){
//                System.out.println(patient);
//            }
//        }
//    }
//
//    public static void main(String[] args){
//        ArrayList<Patient> patients = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        System.out.print("Введите количество пациентов: ");
//        if (scanner.hasNextInt()) {
//            number = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            number = -1;
//        }
//
//        for (int i = 0; i < number; i++){
//            Patient patient = new Patient();
//            patient.setId(i + 1);
//            System.out.println("Покупатель " + i + ":");
//            System.out.print("Введите фамилию: ");
//            if (scanner.hasNext()) {
//                patient.setSurname(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите имя: ");
//            if (scanner.hasNext()) {
//                patient.setName(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите отчество: ");
//            if (scanner.hasNext()) {
//                patient.setLastname(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите адрес: ");
//            if (scanner.hasNextLine()) {
//                patient.setAddress(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//            scanner.next();
//            System.out.print("Введите телефон: ");
//            if (scanner.hasNext()) {
//                patient.setPhone(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите номер карты: ");
//            if (scanner.hasNextLong()) {
//                patient.setCard_number(scanner.nextLong());
//            } else {
//                System.out.println("error");
//            }
//            System.out.print("Введите диагноз: ");
//            if (scanner.hasNext()) {
//                patient.setDiagnosis(scanner.next());
//            } else {
//                System.out.println("error");
//            }
//
//            patients.add(patient);
//        }
//        same_diagnosis(patients, "ОРВИ");
//        card_select(patients, 0,110000000 );
//    }




//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        System.out.print("Введите количество элементов: ");
//        if (scanner.hasNextInt()) {
//            number = scanner.nextInt();
//        } else {
//            System.out.println("error");
//            number = -1;
//        }
//
//        ArrayList<Integer> input_data = new ArrayList<>(number);
//        System.out.print("Введите элементы: ");
//        for (int i = 0; i < number; i++){
//            if (scanner.hasNextInt()) {
//                 input_data.add(scanner.nextInt());
//            } else {
//                System.out.println("error");
//            }
//        }
//        One_Dim_Array array = new One_Dim_Array(input_data);
//
//        ArrayList<Integer> input_data_second = new ArrayList<>(number);
//        System.out.print("Введите второй массив: ");
//        for (int i = 0; i < number; i++){
//            if (scanner.hasNextInt()) {
//                input_data_second.add(scanner.nextInt());
//            } else {
//                System.out.println("error");
//            }
//        }
//        One_Dim_Array second_array = new One_Dim_Array(input_data_second);
//        System.out.println(array + " " + second_array);
//
//        System.out.println("Сумма: " + array.sum(second_array));
//        System.out.println("Разность: " + array.diff(second_array));
//        System.out.println("Произведение: " + array.multi(second_array));
//    }




    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;
        System.out.print("Введите числитель: ");
        if (scanner.hasNextInt()) {
            numerator = scanner.nextInt();
        } else {
            System.out.println("error");
            numerator = -1;
        }
        System.out.print("Введите знаменатель: ");
        if (scanner.hasNextInt()) {
            denominator = scanner.nextInt();
        } else {
            System.out.println("error");
            denominator = -1;
        }
        Simple_Fraction first_fraction = new Simple_Fraction(numerator, denominator);

        System.out.print("Введите числитель: ");
        if (scanner.hasNextInt()) {
            numerator = scanner.nextInt();
        } else {
            System.out.println("error");
            numerator = -1;
        }
        System.out.print("Введите знаменатель: ");
        if (scanner.hasNextInt()) {
            denominator = scanner.nextInt();
        } else {
            System.out.println("error");
            denominator = -1;
        }
        Simple_Fraction second_fraction = new Simple_Fraction(numerator, denominator);

        first_fraction.print();
        second_fraction.print();

        ((Simple_Fraction) first_fraction.sum(second_fraction)).print();
        ((Simple_Fraction) first_fraction.diff(second_fraction)).print();
        ((Simple_Fraction) first_fraction.multi(second_fraction)).print();
        ((Simple_Fraction) first_fraction.div(second_fraction)).print();


    }
}