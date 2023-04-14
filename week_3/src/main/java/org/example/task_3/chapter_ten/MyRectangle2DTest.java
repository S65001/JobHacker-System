package org.example.task_3.chapter_ten;

public class MyRectangle2DTest {
    public static void main(String[] args) {
        MyRectangle2D rectangle = new MyRectangle2D(2, 2, 5.5, 4.9);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println((rectangle.contains(3, 3) ? "Contains" : "Does not contain") +
                " the point (3, 3).");
        System.out.println(
                (rectangle.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) ? "Contains" :
                        "Does not contain") + " the rectangle with points (4, 5, 10.5, 3.2)");
        System.out.println(
                (rectangle.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) ? "Overlaps" :
                        "Does not overlap") + " the rectangle with points (3, 5, 2.3, 5.4)");
    }
}
