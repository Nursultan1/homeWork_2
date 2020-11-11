package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        System.out.println(myAge(33,21));
        System.out.println(myAge(12,43));
        System.out.println(myAge(22,-11));
        System.out.println(myAge(23,-21));
        System.out.println(myAge(19,21));
        System.out.println(generateRandomAge(0,107));

    }


    public static String myAge(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }


    }
    public static int generateRandomAge(int min,int max){
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }


    }














