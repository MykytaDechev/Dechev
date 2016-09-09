package ua.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=9,b=3,c=2;
        System.out.println("Числа в переменных a, b и c: "+a+" "+b+" "+c);
        if(a<b&a<c){
            if(b<c)System.out.println("Последовательность "+a+" "+b+" "+c);
            else System.out.println("Последовательность "+a+" "+c+" "+b);
        }
        if(b<a&b<c){
            if(a<c)System.out.println("Последовательность "+b+" "+a+" "+c);
            else System.out.println("Последовательность "+b+" "+c+" "+a);
        }
        if(c<a&c<b){
            if(a<b)System.out.println("Последовательность "+c+" "+a+" "+b);
            else System.out.println("Последовательность "+c+" "+b+" "+a);
        }
    }
}

