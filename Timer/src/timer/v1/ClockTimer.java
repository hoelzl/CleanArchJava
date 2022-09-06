package timer.v1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ClockTimer {
    LocalTime time = LocalTime.now();
    List<TimeObserver> timeObservers = new ArrayList<>();

    public void registerObserver(TimeObserver observer) {
        timeObservers.add(observer);
    }

    @SuppressWarnings("unused")
    public void unregisterObserver(TimeObserver observer) {
        timeObservers.remove(observer);
    }

    public void notifyObservers() {
        timeObservers.forEach(TimeObserver::update);
    }

    public LocalTime getTime() {
        return time;
    }

    public void tick() {
        time = LocalTime.now();
        notifyObservers();
    }
}
