package main;

abstract public class FourCorner extends Shape {

    private float sideA;
    private float sideB;

    public FourCorner(float sideA, float sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    abstract protected float getSideC();
    abstract protected void getAreaAndPerimeterOfInsideTriangle(float sideA, float sideB, float sideC);

    public float getPerimeter() {
        return (sideA+sideB)*2;
    }

}