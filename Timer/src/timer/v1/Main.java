package timer.v1;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        ClockTimer clockTimer = new ClockTimer();
        //noinspection unused
        DigitalClock digitalClock = new DigitalClock(clockTimer);

        Runnable tickClock = () -> {
            try {
                for (int i = 0; i < 31; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    clockTimer.tick();
                    // System.out.println(clockTimer);
                    System.out.println("========================\n");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread clockThread = new Thread(tickClock);
        clockThread.start();

        try {
            TimeUnit.SECONDS.sleep(3);
            new IsoClock(clockTimer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}