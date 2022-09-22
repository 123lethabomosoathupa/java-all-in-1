/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package countdownclock;

import java.util.ArrayList;

/**
 *
 * @author letha
 */
public class CountDownAppV2 {

    public static void main(String[] args) {
        Thread clock = new CountDownClock();                        //The Count DownClock class instance is created at the beginning of the main method and saved in the clock variable.    
        ArrayList<Runnable> events = new ArrayList<Runnable>();     //The next step is to create three LaunchEvent objects, which are timed.
                                                                    //Runnable variables with the names flood, ignition, and liftoff are given these objects.
        events.add(new LaunchEvent(16, "Flood the pad!"));
        events.add(new LaunchEvent(6, "Start engines!"));
        events.add(new LaunchEvent(0, "Liftoff!"));
        clock.start();
        for (Runnable e : events) {                                 //For loop ensures objects are executed
            new Thread(e).start();
        }
    }
}
