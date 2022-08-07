/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shadowapp;

/**
 *
 * @author letha
 */
public class ShadowApp {

    static int x;       //class variable is being declared

    public static void main(String[] args) {
        x = 5;
        System.out.println("x = " + x);
        int x;  //initialized
        x = 10;
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = " + ShadowApp.x);
    }

}
