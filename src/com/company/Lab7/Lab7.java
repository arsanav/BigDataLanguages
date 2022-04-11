package com.company.Lab7;

import com.sun.source.tree.Tree;

import java.util.*;

public class Lab7 {

//    private static final String text =  "В русском тексте каждую букву заменить ее порядковым номером в \n" +
//            "алфавите. При выводе в одной строке печатать текст с двумя\n" +
//            "пробелами между буквами, в следующей строке внизу\n" +
//            "под каждой буквой печатать ее номер.";
//    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
//
//    private static void printSymbolLine(String line) {
//        for (char symbol : line.toCharArray()) {
//            System.out.print(" " + symbol + " ");
//        }
//        System.out.println();
//    }
//
//    private static void printNumberLine(String line) {
//        int number;
//        for (char sym : line.toCharArray()) {
//            number = alphabet.indexOf(sym);
//            if (number == -1){
//                number = alphabet.toUpperCase(Locale.ROOT).indexOf(sym);
//                if (number == -1){
//                    System.out.print("-- ");
//                    continue;
//                }
//            }
//            System.out.printf("%2d ",(number + 1));
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args){
//        String[] lines = text.split("\\n");
//        for (String line : lines) {
//            line = line.replaceAll("\\s+", "");
//            printSymbolLine(line);
//            printNumberLine(line);
//        }
//
//    }


//    public static void main(String[] args){
//    String text =  "В русском тексте каждую букву заменить ее порядковым номерам в \n" +
//            "алфавите. При выводе в одной строке печатать текст с двумя\n" +
//            "прабелами между буквами, в следующей страке внизу\n" +
//            "под каждой буквой печатать ее номер.";
//    System.out.println(text.replaceAll("ра", "ро"));
//    }


//    public static void main(String[] args){
//        String text =  "В русском тексте каждую букву заменить ее порядковым номерам в \n" +
//            "алфавите. При выводе в одной строке печатать текст с двумя \n" +
//            "прабелами между буквами, в следующей страке внизу \n" +
//            "под каждой буквой печатать ее номер.";
//
//        String [] words = text.toLowerCase().replaceAll("[.?!,\n]", "").split(" ");
//        TreeMap<String, Integer> wordsTreeMap = new TreeMap<>();
//        for (String word : words){
//            Integer number = wordsTreeMap.get(word);
//            if (number == null){
//                number = 0;
//            }
//                number++;
//                wordsTreeMap.put(word, number);
//        }
//        for (String word : wordsTreeMap.keySet()){
//            System.out.println(word + ": " + wordsTreeMap.get(word));
//        }
//
//    }


    public static void main(String[] args){
        String text = """
                В русском тексте каждую букву заменить ее порядковым номерам в\s
                алфавите. При выводе в одной строке печатать текст с двумя\s
                прабелами между буквами, в следующей страке внизу\s
                под каждой буквой печатать ее номер.""";
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество символов: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("error");
            n = -1;
        }

        char[] symbols = text.toLowerCase().replaceAll("[\n\\s]", "").toCharArray();
        HashMap<Character, Integer> symbolsHashMap = new HashMap<>();
        for (char sym : symbols){
            Integer number = symbolsHashMap.get(sym);
            if (number == null){
                number = 0;
            }
                number++;
                symbolsHashMap.put(sym, number);
        }
        symbolsHashMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .limit(n).forEach(System.out::println);
    }

}
