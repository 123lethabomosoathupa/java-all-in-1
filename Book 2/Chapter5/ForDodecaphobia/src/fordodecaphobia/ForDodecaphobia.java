/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fordodecaphobia;

/**
 *
 * @author letha
 */
public class ForDodecaphobia {

    public static void main(String[] args) {
        for (int number = 2; number <= 20; number += 2) {
            if (number == 12) {
                break;
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
