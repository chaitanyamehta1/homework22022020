package homework22022020;/* Write a class with the name Wall. The class needs two fields
(instance variables) with name width and height of type double.
The class needs to have two constructors. The first constructor
does not have any parameters (no-arg constructor). The second
constructor has parameters width and height of type double and
it needs to initialize the fields. In case the width is less than
0 it needs to set the width field value to 0, in case the height
parameter is less than 0 it needs to set the height field value to 0. */

public class No15WallArea {
    double width;
    double height;
    public No15WallArea(double width, double height){
        if (width < 0){
            width = 0;
        }if (height < 0){
            height = 0;
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }
    public void setHeight(double height){
        if (height < 0){
            height = 0;

        }
        this.height=height;
    }
    public double getArea(){
        return getWidth()*getHeight();
    }

    public static void main(String[] args) {
        No15WallArea wall = new No15WallArea(5,4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);

        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

    }


}
