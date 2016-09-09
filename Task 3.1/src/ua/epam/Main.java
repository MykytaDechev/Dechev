package ua.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите число");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a%2==0){
            System.out.println("Четное");
        }
        else System.out.println("Нечетное"); }
}
