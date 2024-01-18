package org.example.Utils;

import java.util.TimerTask;

public class TimerCinema {

    public static void timerBookings(int flag){
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Cancelling of Confirmed Booking is not allowed anymore");
            }
        },  120000);
        flag = 1;
    }
}
