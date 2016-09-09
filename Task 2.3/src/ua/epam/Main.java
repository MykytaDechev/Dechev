package ua.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите число");
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        int b =a%10;
        int c =(a/10)%10;
        int result =b+c;
        System.out.println("Сумма = " +result);
}}
