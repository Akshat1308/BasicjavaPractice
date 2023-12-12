package main.p1;

// class aaa {
//     String name;

//     void print() {
//         System.out.println(this.name);
//     }
// }

public class Main {
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
        h1.name = "shristi";
        h1.walk();
        h1.eats();
        Boy.hair = "black";
        Boy b1 = new Boy();
        b1.gethair();
        b1.setHair("brown");
        b1.gethair();
        Boy b2 = new Boy();
        b2.gethair();

    }
}