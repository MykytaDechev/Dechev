package ua.epam;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int min=100;
        int max=999;
        int random = (int) (min + Math.random() * (max - min));
        int a=random%10;
        int a1=(random/10)%10;
        int a2=(random/100)%10;
        System.out.println("Число = " +random +" наибольшее число = " +Math.max(a, Math.max(a1,a2)));
}}