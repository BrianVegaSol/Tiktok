package com.pluarlsight;

import java.util.Scanner;

public class CalculatorASMD {
    //Challenging myself with this to use a while loop
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static float division(float num1f, float num2f) {
        return num1f / num2f;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    //How the code should be written
   /* public static float add(float number1, float number2) {
        return number1 + number2;
    }

    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public static float division(float num1f, float num2f) {
        return num1f / num2f;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }*/

    public static void main(String[] args) {
        //If the while works, a l w a y s initialize vars early so there arent scope issues
        //like with the while loop xO




        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to My Calculator App!");
        System.out.println("Select an operation to get started: " +
                "\n(A)ddition" +
                "\n(S)ubtraction" +
                "\n(M)ultiplication" +
                "\n(D)ivision");
        char operation = scan.next().charAt(0);
        char operationCheck = Character.toUpperCase(operation);
        System.out.println(operationCheck);

        //TRY DECLARING NUMS OUTSIDE OF THE SCOPE OF THE WHILE LOOP
        //SO THAT THE SWITCH DOESNT FLIP OUT MAN

        int num1 = 0;
        int num2 = 0;
        float fnum1 = 0f;
        float fnum2 = 0f;

        //All this is unnecessary if in the method data types are all float/doubles
        //Code is forced into Invalid input statement despite being correct
        //Why is the while statement always set to true?
       while(operationCheck != 'A' || operationCheck != 'S' || operationCheck != 'M' || operationCheck != 'D') {
            System.out.println("Invalid input");
            operation = scan.next().charAt(0);
            operationCheck = Character.toUpperCase(operation);
            if(operationCheck == 'A' || operationCheck == 'S' || operationCheck == 'M' || operationCheck == 'D'){
                break;
           }
        }
            if (operationCheck == 'A' || operationCheck == 'S' || operationCheck == 'M') {
                System.out.println("Enter your first number: ");
                num1 = scan.nextInt();
                System.out.println("Enter your second number: ");
                num2 = scan.nextInt();
            } else if (operationCheck == 'D') {
                System.out.println("Enter your first number: ");
                fnum1 = scan.nextFloat();
                System.out.println("Enter your second number: ");
                fnum2 = scan.nextFloat();
            }
            switch (operationCheck) {
                case 'A':
                    System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                    break;
                case 'S':
                    System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                    break;
                case 'M':
                    System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                    break;
                case 'D':
                    System.out.println(fnum1 + " / " + fnum2 + " = " + division(num1, num2));
                    break;

            }
        }
    }
