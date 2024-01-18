package org.example.Utils;

import java.util.TimerTask;

public class TimerCinema {
    static int delay;

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public static void timerBookings(int flag){
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Cancelling of Confirmed Booking is not allowed anymore");
            }
        },  delay);
        flag = 1;
    }
}
