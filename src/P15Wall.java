public class P15Wall {
    // Instance variables
    double width;
    double height;

    // Default Constructor
    public P15Wall() {

    }

    // Parameterized Constructor
    public P15Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Get Width Method
    public double getWidth() {
        return width;
    }

    // Get Height Method
    public double getHeight() {
        return height;
    }

    // Set Width Method
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Set Height Method
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Get Area Method
    public double getArea() {
        return (getHeight() * getWidth());
    }

    //Main Method
    public static void main(String[] args) {
        P15Wall w = new P15Wall(5, 4);
        System.out.println("area= " + w.getArea());
        w.setHeight(-1.5);
        System.out.println("width= " + w.getWidth());
        System.out.println("height= " + w.getHeight());
        System.out.println("area= " + w.getArea());
    }
}

