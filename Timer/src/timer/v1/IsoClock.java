package timer.v1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class IsoClock implements TimeObserver {
    private final ClockTimer clockTimer;
    private final DateTimeFormatter formatter;

    public IsoClock(ClockTimer clockTimer) {
        this.clockTimer = clockTimer;
        this.formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        clockTimer.registerObserver(this);
    }

    @Override
    public void update() {
        LocalTime time = clockTimer.getTime();
        System.out.println(formatter.format(time));
    }
}
