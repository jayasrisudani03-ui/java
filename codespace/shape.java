import java.util.*;

abstract class Shape {
    int length, breadth, radius;
    Scanner sc = new Scanner(System.in);

    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.print("Enter length and breadth: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        System.out.println("Rectangle Area = " + (length * breadth));
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.print("Enter base and height: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        System.out.println("Triangle Area = " + (0.5 * length * breadth));
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.print("Enter radius: ");
        radius = sc.nextInt();
        System.out.println("Circle Area = " + (Math.PI * radius * radius));
    }
}

class Main {
    public static void main(String[] args) {

        Shape s;

        s = new Rectangle();
        s.printArea();

        s = new Triangle();
        s.printArea();

        s = new Circle();
        s.printArea();
    }
}