/**
 * Used ChatGPT to calculate the volume and surface area of the Three Dimensional Object
 * Prompt used: Create a method called surfaceArea to calculate the surface area of a cylinder. Create
 * a method called volume to calculate the volume of a cylinder.
 */

package com.csc205.project2;

public class Cylinder extends Shape{

    private double height;
    private double radius;

    public Cylinder() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double v, double w) {
        super();
        this.height = v;
        this.radius = w;

    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Input in ChatGPT was : Surface area of a cylinder in java. Adjusted accordingly
    public double surfaceArea() {
        return 2.0 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2.0) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

