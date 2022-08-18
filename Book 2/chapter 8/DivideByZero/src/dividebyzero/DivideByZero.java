/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dividebyzero;

/**
 *
 * @author letha
 */
public class DivideByZero {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;                                              // you know this won't work
        try {                                                   //statements that can throw exceptions
            int c = a / b;                                      // but you try it anyway
        } catch (ArithmeticException e) {                       //statements executed when exception is thrown
            System.out.println("Oops, you can't "
                    + "divide by zero.");
        }
    }
}
