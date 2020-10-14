package com.company;

import java.util.Random;
import java.util.Scanner;

public class Saper {
    public static void main(String[] args){
        System.out.println("Добро пожаловть в сапер на минималках");
        System.out.println("Правила: 1.Есть 9 цифр из них 2 цифры под бомбой" +
                "                    2.Тебе нужно не попасть на бомбу и закрыть остальные" +
                "                    3.Удачи я в тебя верю");
        System.out.println("Введи чило от 1 до 9");
        Random bombFukc = new Random();
        Random bombFuck2 = new Random();
        Scanner scanner = new Scanner(System.in);
        int bombFukc3 = bombFukc.nextInt(9);
        int bombFuck4 = bombFuck2.nextInt(9);

        int coordinates1 = scanner.nextInt();
        int[] fullCoordinates = {1,2,3,
                                 4,5,6,
                                 7,8,9};
        for(int i = 0; i > fullCoordinates.length; i++){
            if(i = bombFukc3 || i = bombFuck4){
                System.out.println("Вы проиграли");
                return;
            }
            else {
                System.out.println("Отлично двигаем дальше");}


        }
    }
}
