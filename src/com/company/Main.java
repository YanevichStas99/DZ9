package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Random random = new Random();
    private static Scanner scan = new Scanner(System.in);
    private static final int COUNT = 1000000;
    private static final int VAL1 = 3;
    private static final int VAL2 = 4;

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[][] array = new int[VAL1][VAL2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите число на которое умножится массив: ");
        int h = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] * h;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Задание 2");
        int[][] array2 = new int[VAL1][VAL2];
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = random.nextInt(100);
                System.out.print(array2[i][j] + " ");
                sum = sum + array2[i][j];
            }
            System.out.println();
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Задание 3");
        int[][] array3 = new int[VAL1][VAL2];
        System.out.println("Введите число от 0 до 20: ");
        int b = scan.nextInt();
        int sum2=0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = random.nextInt(20);
                System.out.print(array3[i][j] + " ");
                if(array3[i][j]==b){
                    sum2++;
                }
            }
            System.out.println();
        }
        System.out.println("Ваше число встречается "+sum2+" раз");
        System.out.println("Задание 4");
        int sum4=0,numberOfMaxstr=0;
        int[][] array4 = new int[VAL1][VAL2];
        for (int i = 0; i < array4.length; i++) {
            int sumOfvallues=0;
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = random.nextInt(100);
                System.out.print(array4[i][j] + " ");
                sumOfvallues=sumOfvallues+array4[i][j];

            }
            if (sumOfvallues>sum4){
                sum4=sumOfvallues;
                numberOfMaxstr=i;
            }
            System.out.println();
        }
        System.out.println(numberOfMaxstr+1+" строка с наибольшей суммой элементов");
        System.out.println("Задание 5");
        int[][] array5 = new int[VAL1][VAL2];
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = random.nextInt(100);
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }
        int[][] array5Changed=new int[VAL2][VAL1];
        int n=0;
        for (int i = array5.length-1; i >-1 ; i--) {

            for (int j = 0; j <array5[i].length ; j++) {
                array5Changed[j][n]=array5[i][j];


            }
            n++;

        }
        System.out.println("Перевернутый массив: ");
        for (int i = 0; i <array5Changed.length ; i++) {
            for (int j = 0; j <array5Changed[i].length ; j++) {
                System.out.print(array5Changed[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Задание 6");
        int firstcoin, secondcoin, thirdcoin;
        double countcoins = 0;
        for (int i = 0; i < COUNT; i++) {
            firstcoin = random.nextInt(2);
            secondcoin = random.nextInt(2);
            thirdcoin = random.nextInt(2);
            if (firstcoin == secondcoin && secondcoin == thirdcoin) {
                countcoins++;
            }
        }
        countcoins = countcoins/COUNT*100;
        System.out.println("Вероятность того что все три раза выпадет одна и таже сторона - "+countcoins+" %");
        System.out.println("Задание 7");
        double kubn=0;
        int[] arr7=new int[3];
        for (int i = 0; i <COUNT ; i++) {
            arr7[0]=random.nextInt(6)+1;
            arr7[1]=random.nextInt(6)+1;
            arr7[2]=random.nextInt(6)+1;
            Arrays.sort(arr7);
            if(arr7[0]+1==arr7[1] && arr7[1]+1==arr7[2]){
                kubn++;
            }
        }
        kubn=kubn/COUNT*100;
        System.out.println("Вероятность того что числа на кубиках идут подряд: "+kubn+" %");

        System.out.println("Задача 8");
        int a=100;
        int[] arr8=new int[a];
        for (int i = 0; i <arr8.length ; i++) {
            arr8[i]=random.nextInt(100);
        }
        System.out.println("Введите число на которое разобьется массив:");
        int N=scan.nextInt();
        while (a%N!=0){
            a++;
        }
        int o=a/N;
        int[] arr8new=new int[a];
        for (int i = 0; i <arr8.length ; i++) {
            arr8new[i]=arr8[i];
        }
        for (int i = 0; i <arr8new.length ; i++) {
            System.out.print(arr8new[i]+" ");
            if((i+1)%o==0){
                System.out.println();
            }
        }


    }

}
