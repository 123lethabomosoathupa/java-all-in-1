/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scopeapp;

/**
 *
 * @author letha
 */
public class ScopeApp {

    static int x;       //x is class variable

    public static void main(String[] args) {
        x = 5;
        System.out.println("main: x = " + x);
        myMethod();
    }

    public static void myMethod() {
        int y;
        y = 10;     //being intialized
        if (y == x + 5) {
            int z;      
            z = 15;  //being initialized
            System.out.println("myMethod: z = " + z);
        }
        System.out.println("myMethod: x = " + x);
        System.out.println("myMethod: y = " + y);
    }
}
