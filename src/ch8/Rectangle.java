package us.shairyar.deiteljava.ch8;

/**
 * Created by shairyarshafqat on 3/24/15.
 */

/*
Create a class Rectangle with attributes length and width, each of which defaults to 1.
Provide methods that calculate the rectangle’s perimeter and area.
It has set and get methods for both length and width.
The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0.
Write a program to test class Rectangle.
*/

public class Rectangle {

    private int length = 1;
    private int width = 1;

    public Rectangle(int length, int width) {

        this.length = length;
        this.width = width;


        System.out.println("The perimeter of the rectangle is "+perimeter());
        System.out.println("The area of the rectangle is " + area());
    }

    public int getLength() {
        return length;
    }

    public void  setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int perimeter()
    {
        int p = 2 * (this.length + this.width);
        return p;
    }

    public int area()
    {
        int a = this.length * this.width;
        return a;
    }


}
