/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listwords;

/**
 *
 * @author letha
 */
import java.util.Scanner;

public class ListWords {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[] word = s.split("\\s+");                // s.split = breaks a given string around matches of the given regular expression. After splitting against the given regular expression, this method returns a string array.
        for (String w : word) {
            System.out.println(w);
        }
    }
}
