/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathfunctionsapp;

/**
 *
 * @author letha
 */
public class MathFunctionsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 100;
        int b = -50;
        int c = 3;
        double x = 25.0;
        double y = 3.0;
        double z = 4.0;
        System.out.println("abs(b) = " + Math.abs(b));          //returns the absolute value of an int value
        System.out.println("cbrt(x) = " + Math.cbrt(x));        //Cube root of number
        System.out.println("exp(y) = " + Math.exp(z));          //returns the Euler's number e raised to the power of the specified value(Exponential function)
        System.out.println("hypot(y,z)= " + Math.hypot(y, z));  //returns the square root of the sum of squares of its arguments
        System.out.println("log(y) = " + Math.log(y));          //returns the natural logarithm (base e) of a number, that is.
        System.out.println("log10(y) = " + Math.log10(y));      //returns the base 10 logarithm of a double value
        System.out.println("max(a, b) = " + Math.max(a, b));    //returns the greater of two int values
        System.out.println("min(a, b) = " + Math.min(a, b));    //returns the lesser of two int values
        System.out.println("pow(a, c) = " + Math.pow(a, c));    //is used to calculate a number raise to the power of some other number
        System.out.println("random() = " + Math.random());      //returns a pseudorandom double type number greater than or equal to 0.0 and less than 1.0.
        System.out.println("signum(b) = " + Math.signum(b));    //returns the Sign function of a value passed to it as argument
        System.out.println("sqrt(x) = " + Math.sqrt(y));        //returns the correctly rounded positive square root of a double value
    }

}
