package main.p2;

import main.p1.Horse;
import main.p1.Pen;
import main.p1.Shape;

public class Main2 {
    Pen pen1 = new Pen();

    public static void main(String[] args) {

        Pen pen1 = new Pen();
        // aaa a1 = new aaa();
        // a1.name = "akshat";
        // a1.print();
        pen1.brand = "rey";
        pen1.color = "pink";
        pen1.print();
        Shape triangle = new Shape();
        triangle.brand = "red";
        triangle.print();
        Horse h1 = new Horse();
        h1.walk();
    }
}
