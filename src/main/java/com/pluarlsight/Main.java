package com.pluarlsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        /*
        Feautures:
        Creating accounts
        Viewing accounts
        Viewing videos
        Liking videos
        Commenting videos

        Create 4 var for user info


        */

        int followerCount = 0;
        int followCount = 0;
        String notification = "Mmeep viewed your profile! e.e";
        int userID = 123456;
        boolean isVerified = false;
        boolean isBanned = false;
        boolean isActive = true;
        boolean isLoggedIn = true;
        boolean isOnline = false;
        int videosLiked = 20_000;

        String username;
        String password;
        String email = "example@hotmail.com";
        String birthday = "1/2/2000";


        System.out.println("Welcome to Tiktok! Login");
        Scanner scan = new Scanner(System.in);
        System.out.println("Username: ");
        username = scan.nextLine();
        System.out.println("Password: ");
        password = scan.nextLine();

        System.out.println("Hello " + username + "! Welcome back!");

        /*while(password.equals("0"))
        if (password == "0"){
            System.out.println("Logged In Successfully!");
        } else {
            System.out.println("Password / Username is incorrect");
        }*/


        while(!password.equals( "0")){
            System.out.println("Password / Username is incorrect. Please try again");
            password = scan.nextLine();

            if (password.equals("0")){
                System.out.println("Logged In Successfully!");
            } /*else {
                System.out.println("Try again");
            }
            This entire piece isnt necessary since it'll loop back to the sout password incorrect
            */
        }

    }
}