package timer.v1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock implements TimeObserver {
    private final ClockTimer clockTimer;
    private final DateTimeFormatter formatter;

    public DigitalClock(ClockTimer clockTimer) {
        this.clockTimer = clockTimer;
        this.formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        clockTimer.registerObserver(this);
    }

    @Override
    public void update() {
        LocalTime time = clockTimer.getTime();
        System.out.println(formatter.format(time));
    }
}
