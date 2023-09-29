/**
 * ChatGTP prompt: Creat a class called Cube, with a private method width.
 * Create a method called surfaceArea that calculates the surface area of a cube
 * Create a method called volume that calculates the volume of a cube
 */


package com.csc205.project2;

public class Cube extends Shape {

    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double v) {
        super();
        this.width = v;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // ChatGPT prompt: Surface area of a Cube in java.
    public double surfaceArea() {
        return 6 * Math.pow(width, 2);
    }

    //ChatGPT prompt: Volume of a Cube in java.
    public double volume() {
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();

    }
}
