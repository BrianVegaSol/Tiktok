package com.pluarlsight;

import java.util.Scanner;

public class CalculatorASMD {
    /*public static int add(int number1, int number2) {
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
    }*/

    public static float add(float number1, float number2) {
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
    }

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

        //TRY DECLARING NUMS OUTSIDE OF THE SCOPE OF THE WHILE LOOP
        //SO THAT THE SWITCH DOESNT FLIP OUT MAN


        float num1;
        float num2;



        //All this is unnecessary if in the method data types are all float/doubles
       /* while(operationCheck != 'A' || operationCheck != 'S' || operationCheck != 'M' || operationCheck != 'D') {
            System.out.println("Invalid input");
            operation = scan.next().charAt(0);
            operationCheck = Character.toUpperCase(operation);
        }*/
            if (operationCheck == 'A' || operationCheck == 'S' || operationCheck == 'M') {
                System.out.println("Enter your first number: ");
                int num1 = scan.nextInt();
                System.out.println("Enter your second number: ");
                int num2 = scan.nextInt();
            } else if (operationCheck == 'D') {
                System.out.println("Enter your first number: ");
                float num1 = scan.nextFloat();
                System.out.println("Enter your second number: ");
                float num2 = scan.nextFloat();
            }

        //



        //Hopefully initializing nums before while loop works so I can delete this
        System.out.println("Enter your first number: ");
        num1 = scan.nextFloat();
        System.out.println("Enter your second number: ");
        num2 = scan.nextFloat();
        //


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
                    System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
                    break;

            }


        }

    }
