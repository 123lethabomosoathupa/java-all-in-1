/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dodecaphobia3;

/**
 *
 * @author letha
 */
public class Dodecaphobia3 {

    public static void main(String[] args) {
        int number = 0;
        while (number < 20) {
            number += 2;
            if (number == 12) {
                continue;           //used to end the current iteration in a loop, and continues to the next iteration
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
