/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedloop;

/**
 *
 * @author letha
 */
public class NestedLoop {

    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                System.out.print(x + "-" + y + " ");
            }
            System.out.println();
        }
    }
}
