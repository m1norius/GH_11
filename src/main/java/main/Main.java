package main;

import figures.Circle;
import figures.Triangle;
import figures.four.non_right.Parallelogram;
import figures.four.non_right.Rhombus;
import figures.four.right.Rectangle;
import figures.four.right.Square;
import java.util.Scanner;

//Rectangle, Circle, Triangle, Square, Parallelogram, Rhombus
public class Main {

    private static float sideA;
    private static float sideB;
    private static float sideC;
    private static float radius;
    private static float corner;

    private static Scanner s;
    public static void main(String[] args) {



        s = new Scanner(System.in);
        String name;

        while (true){
            System.out.println("Enter name of figure or Exit");
            name = s.next();
            if(name.equals("Exit")){
                System.exit(1);
            }else {
                getFigure(name);
            }
        }
    }

    private static void getFigure(String name) {

        switch (name){
            case "Parallelogram":

                try {
                    System.out.println("Enter side A: ");
                    sideA = s.nextFloat();
                    System.out.println("Enter side B: ");
                    sideB = s.nextFloat();
                    System.out.println("Enter corner: ");
                    corner = s.nextFloat();

                }catch (Exception e){
                    System.out.println("Incorrect symbol");
                    return;
                }

                Shape parallelogram = new Parallelogram(sideA, sideB, corner);
                getResult(parallelogram);

                break;

            case "Rhombus" :

                try {
                    System.out.println("Enter side A: ");
                    sideA = s.nextFloat();
                    System.out.println("Enter side B: ");
                    sideB = s.nextFloat();
                    System.out.println("Enter corner: ");
                    corner = s.nextFloat();

                }catch (Exception e){
                    System.out.println("Incorrect symbol");
                    return;
                }

                Shape rhombus = new Rhombus(sideA, sideB, corner);
                getResult(rhombus);

                break;

            case "Rectangle" :

                try {
                    System.out.println("Enter side A: ");
                    sideA = s.nextFloat();
                    System.out.println("Enter side B: ");
                    sideB = s.nextFloat();
                }catch (Exception e){
                    System.out.println("Incorrect symbol");
                    return;
                }

                Shape r = new Rectangle(sideA, sideB);
                getResult(r);

                break;
            case "Square" :

                try{
                    System.out.println("Enter side A: ");
                    sideA = s.nextFloat();
                    System.out.println("Enter side B: ");
                    sideB = s.nextFloat();
                }catch (Exception e){
                    System.out.println("Incorrect symbol");
                    return;
                }

                Shape r1 = new Square(sideA, sideB);
                getResult(r1);

                break;
            case "Circle" :
                try {
                    System.out.println("Enter radius: ");
                    radius = s.nextFloat();
                }catch (Exception e){
                    System.out.println("Incorrect symbol");
                    return;
                }

                Shape r2 = new Circle(radius);
                getResult(r2);

                break;
            case "Triangle" :
                try {
                    System.out.println("Enter side A: ");
                    sideA = s.nextFloat();
                    System.out.println("Enter side B: ");
                    sideB = s.nextFloat();
                    System.out.println("Enter side C: ");
                    sideC = s.nextFloat();
                }catch (Exception e){
                    System.out.println("Incorrect symbol");
                    return;
                }

                Shape r3 = new Triangle(sideA, sideB, sideC);
                getResult(r3);

                break;
            default:
                System.out.println("Unknown figure");
        }
    }

    private static void getResult(Shape shape){
        System.out.println("Area: "+shape.getArea());
        System.out.println("Perimeter: "+shape.getPerimeter());
    }

//    private static boolean isDigit(char[] num){
//        for (char c : num){
//            if(!Character.isDigit(c)){
//                return false;
//            }
//        }
//        return true;
//    }
}
