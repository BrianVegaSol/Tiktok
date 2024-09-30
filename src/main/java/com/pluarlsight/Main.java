package com.pluarlsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
        boolean isLoggedIn = false;
        boolean isOnline = false;
        int videosLiked = 20_000;

        String username;
        String correctUsername = "0";
        String password;
        String correctPassword = "0";
        String email = "example@hotmail.com";
        String birthday = "1/2/2000";


        System.out.println("Welcome to Tiktok! Login");
        Scanner scan = new Scanner(System.in);
        System.out.println("Username: ");
        username = scan.nextLine();
        System.out.println("Password: ");
        password = scan.nextLine();






        /*while(password.equals("0"))
        if (password == "0"){
            System.out.println("Logged In Successfully!");
        } else {
            System.out.println("Password / Username is incorrect");
        }*/


        while (!password.equals(correctPassword) && !username.equals(correctUsername)) {
            System.out.println("Password / Username is incorrect. Please try again");
            password = scan.nextLine();

            if (!username.equals(correctUsername)) {
                System.out.println("Username / password is incorrect. Please try again");
                username = scan.nextLine();
            }
            if (password.equals(correctPassword) && username.equals(correctUsername)) {
                System.out.println("Logged In Successfully!");
                isLoggedIn = true;
            //When if statement for username is here, does not check username and
            //lets you log in regardless of username as long as password is right



            } /*else {
                System.out.println("Try again");
            }
            This entire piece isnt necessary since it'll loop back to the sout password incorrect
            */
        }


        //Remsey's Code

        /*if(password.equals(correctPassword) && username.equals(correctUsername)) {
            System.out.println("Logged in Succesfully");
            isLoggedIn = true;
        }
        else
        {
            System.out.println("Password/Username is incorrect");
            isLoggedIn = false;
        }*/

        System.out.println("Hello " + username + "! Welcome back!");
    Video movie1 = new Video("Spooderman");
    movie1.likeVideo();

    //Main Method
    LikeTheVideo("CocoMaster","How to make for loops in Java");
    }

    //LikeVideo Method
    public static void LikeTheVideo(String usersName, String videoTitle) {
        System.out.println(usersName + " liked the video: " + videoTitle);
    }


}