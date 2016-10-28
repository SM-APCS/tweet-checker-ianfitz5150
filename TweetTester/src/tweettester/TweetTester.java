/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweettester;

import java.util.Scanner;
import java.lang.Math; 
/**
 * @class  AP CSA
 * @author INSERT YOUR NAME HERE
 */
public class TweetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in); // initialize scanner
         System.out.print("Please enter your tweet: "); // prompt user
         String tweet = scan.nextLine(); // initializes and scans for the tweet body
         System.out.println("The length of the tweet is " + tweet.length() + " characters(s) long.");
         
         
    }
    
}
