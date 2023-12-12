package main.p1;

public class Pen {
    public String brand;
    public String color;

    public void print() {
        System.out.println("brand : " + brand + "\ncolor : " + color);
    }

    public Pen() {
        System.out.println("contructor called");
    }

    public Pen(String brand, String color) {
        this.brand = brand;
        this.color = color;

    }
}
