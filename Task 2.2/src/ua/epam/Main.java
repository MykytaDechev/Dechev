package ua.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=123;
        int b=a%10;
        int c=(a/10)%10;
        int d=(a/100)%10;
        int result=b+c+d;

        System.out.println("Сумма = " +result);
    }
}
