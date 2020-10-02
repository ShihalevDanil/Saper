package com.company;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст а я посчитаю сколько слов:");
        String userString = scanner.nextLine();
        String[] words = userString.split(" ");
        System.out.println(words.length);
        int numberCounter = 0;
        for(int i = 0; i < words.length; i++) {
            if(isNumber(words[i])) {
                numberCounter++;
            }
        }
        System.out.println("Количество чисел в строке" + numberCounter);
    }

    public static boolean isNumber(String word) {
        char[] chars = word.toCharArray();
        for (char i = 0; i < chars.length; i++){
            if(Character.isDigit(chars[i])){
                return true;
            }
        }
        /*word.toCharArray()
        for (char i = 0; i++) {
            if(Character.isDigit(i))
                return true;


        }
        return false;*/
        return false;
    }
}
