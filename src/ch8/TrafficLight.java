package us.shairyar.deiteljava.ch8;

/**
 * Created by shairyarshafqat on 3/31/15.
 */
public enum TrafficLight {

    red(10),
    yellow(10),
    green(3);


    public final int duration;

    TrafficLight(int d) {

        duration = d;
    }

    public int getDuration() {
        return duration;
    }


}
