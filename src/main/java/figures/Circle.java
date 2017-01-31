package figures;

import main.Shape;

public class Circle extends Shape {

    private float radius;

    public Circle(float r) {
        this.radius = r;
    }

    public float getArea() {
        return (float) (Math.PI*(radius*radius));
    }

    public float getPerimeter() {
        return (float) (2*Math.PI*radius);
    }
}
