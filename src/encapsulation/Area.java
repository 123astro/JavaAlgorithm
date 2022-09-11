package encapsulation;

public class Area {
    int length;
    int breadth;

    // constructor to initialize values

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

