package ua.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a=8.5;
        double b=11.45;
        int c=10;
        double d=Math.abs(c-a);
        double e=Math.abs(c-b);
        if (d==e){
            System.out.println("Числа одинаково близки");}
        if(d>e){
            System.out.println("Число "+b +" ближе");}
        if (d<e) {
            System.out.println("Число "+a +" ближе");}
}}
