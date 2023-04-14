package org.example.task_3.chapter_ten;
/***********************************************************************
 *                          MyRectangle2D                              *
 *---------------------------------------------------------------------*
 * -x: double                                                          *
 * -y: double                                                          *
 * -width: double                                                      *
 * -height: double                                                     *
 * --------------------------------------------------------------------*
 * +MyRectangle2D()                                                    *
 * +MyRectangle2D(x: double, y: double, width: double, height: double) *
 * +getArea(): double                                                  *
 * +getPerimeter(): double                                             *
 * +contains(r: MyRectangle2D): boolean                                *
 * +contains(x: double, y: double): boolean                            *
 * +overlaps(r: MyRectangle2D): boolean                                *
 * +setX(x: double ): void                                             *
 * +setY(y: double): void                                              *
 * +getX(): double                                                     *
 * +getY(): double                                                     *
 * +setHeight(height: double): void                                    *
 * +setWidth(width: double): void                                      *
 * +getWidth(): double                                                 *
 * +getHeight(): double                                                *
 **********************************************************************/

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }
    MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }


    public double getPerimeter() {
        return 2 * (width + height);
    }


    public boolean contains(double x, double y) {
        return ( getDistance(this.y, y) <= height / 2 ) && ( getDistance(this.x, x) <= width / 2 );
    }

    public boolean contains(MyRectangle2D r) {
        return ( getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 )
                && ( getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2)
                && (height / 2 + r.getHeight() / 2 <= height)
                && (width / 2 + r.getWidth() / 2 <= width);
    }


    public boolean overlaps(MyRectangle2D r) {
        return !contains(r)
                && ((x + width / 2 > r.getX() - r.getWidth())
                || (y + height / 2 > r.getY() - r.getHeight()))
                && (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2)
                && (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }


    private double getDistance(double p1, double p2) {
        return Math.abs(p1-p2);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
