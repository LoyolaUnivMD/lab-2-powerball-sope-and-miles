// Programmers:  [Miles and Sope]
// Course:  CS 212
// Due Date: 2/3/24
// Lab Assignment:
// Problem Statement: Write a Java program to prompt the player for their name and generate 10 random lottery tickets for the.
// Data In: Users Name
// Data Out: Ticket Numbers
// Credits: [N/A]

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class Main {
  public static void main(String[] args) {
    //Outputs the purpose of the program 
    System.out.println("This program generates 10 lottery tickets.");
    //Calls random function 
    Random rand = new Random();
    //Declares variables
    DecimalFormat ftm = new DecimalFormat("#00");
    //Declares scanner variable
    try (Scanner scanner = new Scanner(System.in)){
      System.out.println("What is your name: ");
      //Saves the users name
      String fullName = scanner.nextLine();
      //Splits at the space
      String[] nameParts = fullName.split(" ");
      //Saves the first name
      String firstName = nameParts[0];
    System.out.println("How much would you like to bet: ");
      int bet = scanner.nextInt();
      System.out.println("Great "+ firstName +" is betting "+ "$"+bet);
      //Outputs the ticket to the user


      System.out.println("Here is your ticket: ");
      int[] Winningnum =  {03, 05, 16, 58, 59, 11};
      double winnings = 0;
      double prize = 0;
      //For loop that generates 10 tickets
      for (int i = 0; i < 10; i++){
        //For loop that generates 6 random numbers
        for (int j = 0; j < 6; j++){
          //Outputs the random numbers
          int lotterynums = rand.nextInt(99);
          System.out.print(ftm.format(lotterynums)+ " ");
          if (lotterynums == Winningnum[j]){
          winnings = Math.pow(bet,1.75);
          prize = winnings;
            }
        }
        System.out.println();
      } 
      //Outputs a line 
      System.out.println("-----------------");
      //Outputs a good luck message to the user
      System.out.println("Good luck " + firstName + "!");
      //Outputs the jackpot amount
       System.out.println("-----------------");
      System.out.println("Your winnings are $" + prize);
      System.out.println("-----------------");

    }
  }
}
