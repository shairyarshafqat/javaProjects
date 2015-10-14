package Java_Questions.DerekBanasTutorial;

/**
 * Created by shairyarshafqat on 3/16/15.
 */
public class JavaLessonFourteen {

    public static void main(String[] args) {

        Animals genericAnimal = new Animals();

//        // Calling the constructor with two arguments.
//        Animals aa = new Animals("asd","sdf");
//        System.out.println(aa);
//        System.out.println("a");
//        System.out.println();
//        // Printing the new obj. aa with two arguments.


        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        Cats morris = new Cats("morris", "tuna", "Rubber Mouse");

        System.out.println();

        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);

        Animals tabby = new Cats("Tabby", "salmon", "ball");

        System.out.println(tabby.getName());
        System.out.println(tabby.favFood);

        acceptAnimal(tabby);

        //
//        System.out.println(aa);
//        System.out.println("a");
//        System.out.println();
//        // Printing the new obj. aa with two arguments.

    }

    public static void acceptAnimal(Animals randAnimal)
    {
        System.out.println();

        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);
        System.out.println(((Cats)randAnimal).favToy + "/");
        System.out.println();

        randAnimal.walkAround();
        System.out.println();
//
//        Cats tempCat = (Cats) randAnimal;
//        System.out.println(tempCat.favToy);

        if(randAnimal instanceof Cats)
        {
            System.out.println(randAnimal.getName() + " is a Cat.");
        }


    }

}
