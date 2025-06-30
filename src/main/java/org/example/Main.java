package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        smallest();
//          System.out.println(numStatus(0)); //zero
//          System.out.println(numStatus(10)); //positive
//          System.out.println(numStatus(-10)); //negative
//        System.out.println(passwordValidation());


    }

    public static void smallest(){
        System.out.println("\nquestion 1\n");
        double[] nums = new double[3];
        double min = 0;

        //inputting the values
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number "+(i+1)+":");
            nums[i]=scanner.nextInt();
        }

        double firstIndex = nums[0];

        //checking
        for (int i = 0; i <nums.length ; i++) {
            if (firstIndex < nums[i]) {
                min = firstIndex;
            } else {
                min = nums[i];
            }
        }



        System.out.println("The smallest value is :"+ min);


    }


    public static String numStatus(int number){
        System.out.println("\nquestion2\n");
        if (number == 0){
            return "the number is zero";
        } else if (number > 0) {
            return "the number is positive";
        } else {
            return "the number is negative";
        }
    }

    public static String passwordValidation(){
        System.out.println("""
                \nquestion3
                your password must have at least ten characters.
                     - consists of only letters and digits.
                     - must contain at least two digits
                """);
        System.out.print("password: ");
        String password = scanner.nextLine();
        if (password.matches("[A-Za-z]+\\d+") && password.length()>=8) {    //using regex to check patterns
            return "the password is valid: "+password;
        } else {
            return "the password is not valid: "+password;
        }



    }
}