package com.chapter8Inheritance.programs;

//Start with Box.
class Box11 {
    private double width;
    private double height;
    private double depth;

    // Construct clone of an object.
    Box11(Box11 ob) {
        // pass object to constructor.
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructor used when all dimensions are specified.
    Box11(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions are specified.
    Box11() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor used when cube is created.
    Box11(double len) {
        width = height = depth = len;
    }

    // Compute and return volume.
    double volume() {
        return width * height * depth;
    }
}

// Add weight.
class BoxWeight11 extends Box11 {
    double weight;

    // Construct clone of an object
    BoxWeight11(BoxWeight11 ob) {
        super(ob);
        weight = ob.weight;
    }

    // Constructor when all parameters are specified
    BoxWeight11(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
    }

    // Default constructor
    BoxWeight11() {
        super();
        weight = -1;
    }

    // Constructor used when cube is created.
    BoxWeight11(double len, double m) {
        super(len);
        weight = m;
    }
}

// Add shipping costs.
class Shipment extends BoxWeight11 {
    double cost;

    // Construct clone of an object.
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // Constructor when all parameters are specified.
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); // call superclass constructor
        cost = c;
    }

    // Default constructor.
    Shipment() {
        super();
        cost = -1;
    }

    // Constructor used when cube is created.
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

// Demo class
public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipment cost: $" + shipment2.cost);
    }
}
