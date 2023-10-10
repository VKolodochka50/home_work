package de.telran;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        //Initialise primitive types area to printing them out in the console
        char myChar = 'G';
        int myInt = 89;
        byte myByte = 4;
        short myShort = 56;
        float myFloat = 4.7333436F;
        double myDouble = 4.355453532;
        long myLong = 12121;
// Print data to System output

        System.out.println("Here the value of CHAR variable = " +myChar);
        System.out.println("Here the value of INT variable = " +myInt);
        System.out.println("Here the value of BYTE variable = " +myByte);
        System.out.println("Here the value of SHORT variable = " +myShort);
        System.out.println("Here the value of FLOAT variable = " +myFloat);
        System.out.println("Here the value of DOUBLE variable = " +myDouble);
        System.out.println("Here the value of LONG variable = " +myLong);

    }
}
//1 уровень сложности: 1) Установить JDK 11, 17
//Создать два проекта Java, переключить в настройках один на 11, второй на 17
//
//2) В методе main инициализировать все примитивные типы.
//Вывести их результат в консоль:
//char: G
//int: 89
//byte: 4
//short: 56
//float: 4.7333436
//double: 4.355453532
//long: 12121