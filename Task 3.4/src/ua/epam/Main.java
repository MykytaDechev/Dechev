package ua.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a= (int)(Math.random()*150)+5;

        if(a<=25||a>=100){

            System.out.println("Число "+a +" не в интервале (25-100)");

        }

        else {

            System.out.println("Число "+a +" в интервале (25-100)");

        }

    }

}

