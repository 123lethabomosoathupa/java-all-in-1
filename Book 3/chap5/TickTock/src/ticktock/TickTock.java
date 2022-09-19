/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticktock;

/**
 *
 * @author letha
 */
import java.awt.event.*;        //Defines a contract between user-interface components and an assistive technology that provides access to those components.
import javax.swing.*;           //The Timer class is part of the javax.swing package

public class TickTock {

    public static void main(String[] args) {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, new Ticker());

        t.start();

        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,             //The JOptionPane class is used to display a dialog box
                "Click OK to exit program");
    }
}

class Ticker implements ActionListener {

    private boolean tick = true;

    public void actionPerformed(ActionEvent event) {
        if (tick) {
            System.out.println("Tick...");

        } else {
            System.out.println("Tock...");

        }
        tick = !tick;

    }
}
