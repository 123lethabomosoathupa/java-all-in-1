/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dodecaphobia;

/**
 *
 * @author letha
 */
public class Dodecaphobia {

    public static void main(String[] args) {
        int number = 2;
        while (number <= 20) {
            if (number == 12) {
                break;
            }
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}
