import java.awt.Point;

public class Task1 {

    public static void main(String[] args) {

        double perimeter = 0;
        double area;

        Point pnt1 = new Point(0,0);
        Point pnt2 = new Point(4,0);
        Point pnt3 = new Point(0,5);

        perimeter += pnt1.distance(pnt2);
        perimeter += pnt2.distance(pnt3);
        perimeter += pnt3.distance(pnt1);

        area = (pnt1.distance(pnt3) * pnt1.distance(pnt2)) / 2;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);


    }
}
