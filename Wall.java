package homeworkweek7;
//Program 15

public class Wall {

    //instance variables
    double width;
    double height;

    //no - arg constructor
    public Wall() {
    }
    //second constructor with parameters
    public Wall(double width, double height) {
        if (width > 0 && height < 0) {
            this.width = width;
            this.height = 0;
        } else if (width < 0 && height > 0) {
            this.width = 0.0;
            this.height = height;
        } else if (width < 0 && height < 0) {
            this.width = 0.0;
            this.height = 0.0;
        } else {
            this.width = width;
            this.height = height;
        }
    }
    //instance method- with parameter
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    //instance method-with reurn no parameters
    public double getWidth() {
        return width;
    }
    //instance method- with parameter
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    //instance method-with reurn no parameters
    public double getHeight() {
        return height;
    }
    //instance method-with reurn no parameters
    public double getArea() {
        return this.width * this.height;
    }


    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(3);
        //wall.setWidth(2);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}

