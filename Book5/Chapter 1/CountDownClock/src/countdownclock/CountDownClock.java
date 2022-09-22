/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countdownclock;

//In a multithreaded Java application, you can create an object that can be run as a thread by using the Thread class.

//The following program can be found as an example of a Count Down Process used by either NASA or SpaceX


public class CountDownClock extends Thread                 //class extends the Thread class	
{

    public void run() {                                    //Java calls a function after launching the clock thread.
        for (int t = 20; t >= 0; t--) {                    //for loop counts down from 20 to 0
            System.out.println("T minus " + t);           
            try {
                Thread.sleep(1000);                       //The sleep method is used by the CountDownClock class to pause for one second.
            } catch (InterruptedException e) {            //InterruptedException handles exceptions
            }
        }
    }
}
