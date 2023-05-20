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


    // attributes for the point we want to test are x1,y1
    public boolean isPointInside(double x1,double y1) {
        return (x1<=this.x+this.width)
                &&(x1>=this.x-this.width)
                &&(y1<=this.y+this.height)
                &&(y1>=this.y-this.height);
    }

    public boolean contains(MyRectangle2D r) {
        return isPointInside(r.getX()+r.width,r.getY()+r.getHeight())
                && isPointInside(r.getX()-r.width,r.getY()+r.getHeight())
                && isPointInside(r.getX()-r.width,r.getY()-r.getHeight())
                && isPointInside(r.getX()+r.width,r.getY()-r.getHeight());
    }


    public boolean isOverlaping(MyRectangle2D r) {
        return !contains(r)
                && (isPointInside(r.getX()+r.width,r.getY()+r.getHeight())
                || isPointInside(r.getX()-r.width,r.getY()+r.getHeight())
                || isPointInside(r.getX()-r.width,r.getY()-r.getHeight())
                || isPointInside(r.getX()+r.width,r.getY()-r.getHeight()));
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
