class Point {
    int x, y;


    Point() {
        x = 5;
        y = 5;
    }

    
    Point(int a, int b) {
        x = a;
        y = b;
    }

    
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

   
    void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        Point p1 = new Point();
        System.out.println("Using Default Constructor:");
        p1.display();

        
        Point p2 = new Point(10, 20);
        System.out.println("Using Parameterized Constructor:");
        p2.display();

        
        Point p3 = new Point(p2);
        System.out.println("Using Copy Constructor (copy of p2):");
        p3.display();
    }
}