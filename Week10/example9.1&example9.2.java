package com.zjnu.demo;
class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}


public class test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        System.out.println("The radius of the circle is "+circle1.getRadius());
        System.out.println("The area of the circle of radius "+circle1.getRadius()+" is "+circle1.getArea());
        System.out.println("The perimeter of the circle of radius "+ circle1.getRadius()+" is "+circle1.getPerimeter());
        System.out.println();
        Circle circle2 = new Circle(25);
        System.out.println("The radius of the circle is "+circle2.getRadius());
        System.out.println("The area of the circle of radius "+circle2.getRadius()+" is "+circle2.getArea());
        System.out.println("The perimeter of the circle of radius "+ circle2.getRadius()+" is "+circle2.getPerimeter());
        System.out.println();
        Circle circle3 = new Circle(75);
        System.out.println("The radius of the circle is "+circle3.getRadius());
        System.out.println("The area of the circle of radius "+circle3.getRadius()+" is "+circle3.getArea());
        System.out.println("The perimeter of the circle of radius "+ circle3.getRadius()+" is "+circle3.getPerimeter());
        System.out.println();
        circle2.setRadius(100);
        System.out.println("The radius of the circle is "+circle2.getRadius());
        System.out.println("The area of the circle of radius "+circle2.getRadius()+" is "+circle2.getArea());
        System.out.println("The perimeter of the circle of radius "+ circle2.getRadius()+" is "+circle2.getPerimeter());
    }
}
