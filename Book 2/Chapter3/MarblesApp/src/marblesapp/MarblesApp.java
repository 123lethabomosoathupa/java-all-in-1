/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marblesapp;

/**
 *
 * @author letha
 */
import java.util.Scanner;       //Scanner is a class in java. util package used for obtaining the input of the primitive types like int, double, etc. and strings

public class MarblesApp {

    static Scanner sc = new Scanner(System.in);     //Scanner class allows user to take input from console

    public static void main(String[] args) {
        // declarations →9
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;
        // get the input data →15
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();
        // calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren;

        marblesLeftOver = numberOfMarbles % numberOfChildren;

        // print the results →26
        System.out.println("Give each child "
                + marblesPerChild + " marbles.");
        System.out.println("You will have "
                + marblesLeftOver + " marbles left over.");
    }
}
