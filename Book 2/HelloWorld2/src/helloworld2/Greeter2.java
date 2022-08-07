/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld2;

/**
 *
 * @author letha
 */
import javax.swing.JOptionPane;   // This class creates a Greeter object that displays a hello message in a dialog box. 

public class Greeter2 {            

    public void sayHello() {
        JOptionPane.showMessageDialog(null,
                "Hello, World!", "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
