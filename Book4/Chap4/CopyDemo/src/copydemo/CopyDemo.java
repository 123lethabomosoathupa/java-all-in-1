/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copydemo;

/**
 *
 * @author letha
 */
import java.util.Arrays;

class CopyDemo {

    public static void main(String args[]) {
        int arrayOriginal[] = {42, 55, 21};
        int arrayNew[]
                = Arrays.copyOf(arrayOriginal, 3);              //It copies the specified array, reducing or filling, if necessary, with false to make the copy the desired length.
        printIntArray(arrayNew);
    }

    static void printIntArray(int arrayNew[]) {
        for (int i : arrayNew) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }
}
