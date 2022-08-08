/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evencounter;

/**
 *
 * @author letha
 */
public class EvenCounter {

    public static void main(String[] args) {
        int number = 2;
        while (number <= 20) {
            System.out.print(number + " ");
            number += 2;                //Counts in 2s until 20.
        }
        System.out.println();
    }
}
