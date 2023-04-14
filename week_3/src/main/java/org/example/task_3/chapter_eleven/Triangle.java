package org.example.task_3.chapter_eleven;

/***********************************************************************
 *                             Triangle                                *
 *---------------------------------------------------------------------*
 * -side1: double                                                      *
 * -side2: double                                                      *
 * -side3: double                                                      *
 * -color: String                                                      *
 * -isFilled: boolean                                                  *
 * --------------------------------------------------------------------*
 * +Triangle()                                                         *
 * +Triangle( side1: double ,  side2: double , side3: double)          *
 * +getColor(): String                                                 *
 * +setColor( color: String): void                                     *
 * +isFilled(): boolean                                                *
 * +setFilled(): void                                                  *
 * +getArea(): double                                                  *
 * +getPerimeter(): double                                             *
 * +getSide1(): double                                                 *
 * +setSide1( side1: double): void                                     *
 * +getSide2(): double                                                 *
 * +setSide2( side1: double): void                                     *
 * +getSide3(): double                                                 *
 * +setSide3( side1: double): void                                     *
 * +toString(): String                                                 *
 **********************************************************************/

public class Triangle extends GeometricObject{
    private double side1,side2,side3;
    private String color;
    private boolean isFilled;
    public Triangle() {
        this.side1=1;
        this.side2=1;
        this.side3=1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public double getArea() {
        double s=getPerimeter()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return  "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}
