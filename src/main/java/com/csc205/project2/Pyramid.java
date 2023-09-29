/**
 * ChatGPT prompt: Create a method called surfaceArea to calculate the surface area of a pyramid. Create
 * a method called volume to calculate the volume of a pyramid.
 */

package com.csc205.project2;

public class Pyramid extends Shape{

    private double length;
    private double width;
    private double height;

    public Pyramid() {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    public Pyramid(double v, double w, double h) {
        super();
        this.length = v;
        this.width = w;
        this.height = h;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    // ChatGPT prompt: Surface area of a pyramid in java.
    public double surfaceArea() {
        return Math.pow(length, 2) + (2 * length * height);
    }

    // ChatGPT prompt: Volume of a pyramid in java.
    public double volume() {
        return (1.0 / 3.0) * Math.pow(length, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
