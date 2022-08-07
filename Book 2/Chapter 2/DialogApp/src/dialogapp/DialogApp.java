/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dialogapp;

/**
 *
 * @author letha
 */
import javax.swing.JOptionPane;         //provide standard dialog boxes such as message dialog box, confirm dialog box and input dialog box

public class DialogApp {

    public static void main(String[] args) {
        String s;
        s = JOptionPane.showInputDialog("Enter an integer:");           //user can input a value in dialogue box
        int x = Integer.parseInt(s);        //returns the integer
        System.out.println("You entered " + x + ".");
    }
}
