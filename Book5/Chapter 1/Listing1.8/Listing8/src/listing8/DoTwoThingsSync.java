/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listing8;

/**
 *
 * @author letha
 */
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class DoTwoThingsSync {

    ScheduledThreadPoolExecutor pool
            = new ScheduledThreadPoolExecutor(2);
    CountDownClock clock = new CountDownClock();

    public static void main(String[] args) {
        new DoTwoThingsSync();
    }

    DoTwoThingsSync() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
