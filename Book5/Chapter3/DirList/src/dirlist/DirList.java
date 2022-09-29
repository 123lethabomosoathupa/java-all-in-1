/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dirlist;

/**
 *
 * @author letha
 */
import java.io.File;                                     //Required to be bale to use the file class
import java.util.Scanner;

public class DirList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(
                "Welcome to the Directory Lister");
        do {
            System.out.print("\nEnter a path: ");          //A Scanner object is used to get the pathname from the user
            String path = sc.nextLine();

            File dir = new File(path);

            if (!dir.exists() || !dir.isDirectory()) {
                System.out.println(
                        "\nThat directory doesn't exist.");
            } else {
                System.out.println(
                        "\nListing directory tree of:");
                System.out.println(dir.getPath());
                listDirectories(dir, "  ");
            }
        } while (askAgain());
        //and the loop repeats if the user answers Y.
    }

    private static void listDirectories(
            File dir, String indent) {
        File[] dirs = dir.listFiles();
        for (File f : dirs) {
            if (f.isDirectory()) {
                System.out.println(
                        indent + f.getName());
                listDirectories(f, indent + "  ");
            }
        }
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
