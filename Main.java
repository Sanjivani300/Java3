package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter first number");
        int a=obj.nextInt();

        System.out.println("Enter second number");
        int b=obj.nextInt();

        System.out.println("Enter the operation");
        obj.nextLine();
        char operation=obj.nextLine().charAt(0);

        int result=0;

        switch(operation){
            case '+':
                result= a + b;
                break;
            case '-':
                result= a - b;
                break;
            case '*':
                result= a * b;
                break;
            case '/':
                result= a / b;
                break;
            default:
                System.out.println("Invalid operatoin");
        }
        System.out.println("The result is "+result);

    }
}
