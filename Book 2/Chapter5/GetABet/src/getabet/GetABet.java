/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package getabet;

/**
 *
 * @author letha
 */
import java.util.Scanner;

public class GetABet {

    static Scanner sc = new Scanner(System.in);             //creates an object of Scanner class which is defined in java. util. scanner package.

    public static void main(String[] args) {
        int bank = 1000; // assume the user has $1,000
        int bet; // the bet entered by the user
        System.out.println("You can bet between 1 and "
                + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();                             //used to scan the next token of the input as an int.
        } while ((bet <= 0) || (bet > bank));
        System.out.println("Your money's good here.");
    }
}
