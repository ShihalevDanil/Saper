package com.company;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст а я посчитаю сколько слов");
        String userString = scanner.nextLine();
        String[] words = userString.split(" ");
        System.out.println(words.length);
    }
}
