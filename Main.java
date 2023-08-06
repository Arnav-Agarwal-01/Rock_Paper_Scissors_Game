// Here we import the required Scanner and Random classes

import java.util.Scanner;
import java.util.Random;

// This is the start of code , starts with class
public class Main {
    public static void main(String[] args) {
        // creating instance of scanner class
        Scanner sc = new Scanner(System.in);
        // creating instance of random class
        Random random = new Random();
        // both the integers that keep user and computer score
        int user_score = 0;
        int computer_score = 0;
        System.out.println("Welcome to this game of rock papers and scissors");
        System.out.println("Please enter how many rounds do you want to play this game for ? ");
        int n = sc.nextInt();
        System.out.println("I will play as your opponent , and here are the rules to the game");
        System.out.println("I am a computer language , so you will have to enter the rock , paper and scissors numerically");
        System.out.println("1 is for ROCK , 2 is for PAPER , 3 is for SCISSORS");
        for (int a = 1 ; a<=n ; a++) {
            System.out.println("Please Enter Your Option");
            int user = sc.nextInt();
            int comp = random.nextInt(1,4);
            if (user == 1 && comp == 1) {
                // we are creating a time delay here , of 500 milliseconds so as to keep the code from not rushing too much
                // to remove the exception / error we are entering this code here
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("You have entered rock and the computer also has entered rock");
                System.out.println("Its a draw");
                System.out.println("Computer Score = " + computer_score + "   User Score = " + user_score);
            }
            else if (user == 2 && comp == 2) {
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("You have entered Paper and the computer also has entered paper");
                System.out.println("Its a draw");
                System.out.println("Computer Score = " + computer_score + "   User Score = " + user_score);
            }
            else if (user == 3 && comp == 3) {
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("You have entered scissors and the computer also has entered scissors");
                System.out.println("Its a draw");
                System.out.println("Computer Score = " + computer_score + "   User Score = " + user_score);
            }
            else if (user == 1 && comp == 2) {
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("You have entered rock and the computer has entered Paper");
                System.out.println("The computer wins");
                ++computer_score;
                System.out.println("Computer Score = " + computer_score + "   User Score = " + user_score);
            }
            else if (user == 1 && comp == 3) {
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("You have entered rock and the computer has entered scissors ");
                System.out.println("You win");
                ++user_score;
                System.out.println("Computer Score = " + computer_score + "   User Score = " + user_score);
            }
            else if (user == 2 && comp == 1) {
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("You have entered Paper and the computer has entered rock");
                System.out.println("You Win");
                ++user_score;
                System.out.println("Computer Score = " + computer_score + "   User Score = " + user_score);
            }
            else if (user == 2 && comp == 3) {
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("You have entered Paper and the computer has entered scissors ");
                System.out.println("The computer wins");
                ++computer_score;
                System.out.println("Computer Score = " + computer_score + "   User Score = " + user_score);
            }
            else if (user == 3 && comp == 1) {
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("You have entered scissors and the computer has entered rock");
                System.out.println("The computer wins");
                ++computer_score;
                System.out.println("Computer Score = " + computer_score + "   User Score = " + user_score);
            }
            else if (user == 3 && comp == 2) {
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("You have entered scissors and the computer has entered paper");
                System.out.println("You win");
                ++user_score;
                System.out.println("Computer Score = " + computer_score + "   User Score = " + user_score);

            }
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println("Got Interrupted");
            }
        }
            int total_user_Score = user_score;
            int total_computer_score = computer_score;
            if (total_user_Score>total_computer_score){
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("FINAL SCORES");
                System.out.println("Computer Score = "+computer_score + "   User Score = "+user_score);
                System.out.println("You win ");
            }
            else if (total_user_Score == total_computer_score){
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("FINAL SCORES");
                System.out.println("Computer Score = "+computer_score + "   User Score = "+user_score);
                System.out.println("This Game is a Draw");
            }
            else if (total_user_Score<total_computer_score){
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }
                System.out.println("FINAL SCORES");
                System.out.println("Computer Score = "+computer_score + "   User Score = "+user_score);
                System.out.println("The computer wins");
            }
    }
}
