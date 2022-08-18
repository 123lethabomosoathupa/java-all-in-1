/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileexception1;

/**
 *
 * @author letha
 */
import java.io.*;

public class FileException1 {

    public static void main(String[] args) {
        openFile("C:\test.txt");
    }

    public static void openFile(String name) {
        FileInputStream f = new FileInputStream(name);
    }
}
