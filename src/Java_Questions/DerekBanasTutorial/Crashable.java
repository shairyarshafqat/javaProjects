package Java_Questions.DerekBanasTutorial;

/**
 * Created by shairyarshafqat on 3/16/15.
 */
public abstract class Crashable {

    boolean carDrivable = true;

    public void youCrashed()
    {
        this.carDrivable = false;
    }

    public abstract void setCarStrength(int carStrength);

    public abstract int getCarStrength();
}
