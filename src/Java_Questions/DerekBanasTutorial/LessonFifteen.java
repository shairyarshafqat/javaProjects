package Java_Questions.DerekBanasTutorial;

/**
 * Created by shairyarshafqat on 3/17/15.
 */
public class LessonFifteen {

    public static void main(String[] args) {

        Vehicle car = new Vehicle(4, 100.00);

        System.out.println("Cars max speed " + car.getSpeed());
        System.out.println("Num of wheels " + car.getWheel());
        System.out.println();

        car.setCarStrength(10);
        System.out.println("the strength of car " + car.getCarStrength());
    }

}
