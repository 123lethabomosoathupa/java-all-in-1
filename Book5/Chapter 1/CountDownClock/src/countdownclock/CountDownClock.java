/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countdownclock;

/**
 *
 * @author letha
 */
public class CountDownClock extends Thread                 //class extends the Thread class	
{

    public void run() {                                    //method is called by Java when the clock thread has been started
        for (int t = 20; t >= 0; t--) {                    //for loop counts down from 20 to 0
            System.out.println("T minus " + t);           
            try {
                Thread.sleep(1000);                       //The CountDownClock class uses the sleep method to pause for 1 second.
            } catch (InterruptedException e) {            //handles exceptions
            }
        }
    }
}
