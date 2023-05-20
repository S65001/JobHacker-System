package org.example.task_3.chapter_nine;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(4,40);
        Rectangle rectangle2 =new Rectangle(3.5 ,35.9);

        //the width, height, area, and perimeter
        System.out.println("width:" + rectangle1.getWidth() +
        "  height:"+ rectangle1.getHeight()+
        "  area:"+rectangle1.getArea()+
        "  perimeter:"+rectangle1.getPerimeter());

        System.out.println("width:" + rectangle2.getWidth() +
                "  height:"+ rectangle2.getHeight()+
                "  area:"+rectangle2.getArea()+
                "  perimeter:"+rectangle2.getPerimeter());
    }
}