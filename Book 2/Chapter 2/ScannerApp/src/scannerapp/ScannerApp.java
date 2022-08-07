/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerapp;

/**
 *
 * @author letha
 */
import java.util.Scanner;       //The Scanner class is used to get user input

public class ScannerApp {

    static Scanner sc = new Scanner(System.in);     //creates an object of Scanner class which is defined in java. util. scanner package

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();       //It will save the integer which was typed
        System.out.println("You entered " + x + ".");
    }
}
