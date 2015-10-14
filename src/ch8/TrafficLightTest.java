package us.shairyar.deiteljava.ch8;

/**
 * Created by shairyarshafqat on 3/31/15.
 */
public class TrafficLightTest {

    public static void main(String[] args)
    {

        for(TrafficLight light : TrafficLight.values())
            System.out.printf("The light is %s and the duration is %d\n",light, light.getDuration());
    }
}
