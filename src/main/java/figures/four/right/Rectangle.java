package figures.four.right;

import figures.Triangle;
import main.FourCorner;

public class Rectangle extends FourCorner {

    private float sideC;
    private float sideA;
    private float sideB;

    public Rectangle(float sideA, float sideB) {
        super(sideA, sideB);
        this.sideA = sideA;
        this.sideB = sideB;
        getSideC();
        getAreaAndPerimeterOfInsideTriangle(sideA, sideB, sideC);
    }

    @Override
    public float getArea() {
        return sideA*sideB;
    }

    @Override
    protected float getSideC(){
        sideC = (float) Math.sqrt(sideA*sideA+sideB*sideB);
        return sideC;
    }

    @Override
    protected void getAreaAndPerimeterOfInsideTriangle(float sideA, float sideB, float sideC){
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        System.out.println("Area of inside triangle: "+triangle.getArea());
        System.out.println("Perimeter of inside triangle: "+triangle.getPerimeter());
    }
}
