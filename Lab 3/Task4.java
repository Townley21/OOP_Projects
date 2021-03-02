import java.awt.*;

public class Task4 {

    public static void main(String[] args) {


        double perimeter = 0;
        double area;

        Point A = new Point(0,0);
        Point B = new Point(4,0);
        Point C = new Point(0,5);

        perimeter += A.distance(B);
        perimeter += B.distance(C);
        perimeter += C.distance(A);

        area = (A.distance(C) * A.distance(B)) / 2;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        double sideC = Math.pow(A.distance(C), 2);
        double sideA = C.distance(B);
        double sideB = B.distance(A);

        double eq1 = sideC / (Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB);

        double angB = eq1;
        double angA = 90;
        double angC = 180 - (angA + angB);

        System.out.println("Angle A in Degrees: " + angA);
        System.out.println("Angle A in Radians: " + angA * Math.PI / 180);
        System.out.println("Angle B in Degrees: " + angB);
        System.out.println("Angle A in Radians: " + angB * Math.PI / 180);
        System.out.println("Angle C in Degrees: " + angC);
        System.out.println("Angle A in Radians: " + angC * Math.PI / 180);

    }


}
