package figures.four.non_right;
import figures.Triangle;
import main.FourCorner;

public class Parallelogram extends FourCorner {

    private double corner;
    private float deg;
    private float sideA;
    private float sideB;
    private float sideC;

    public Parallelogram(float sideA, float sideB, double corner) {
        super(sideA, sideB);
        this.corner = corner;
        this.sideA = sideA;
        this.sideB = sideB;
        deg = (float) Math.sin(Math.toRadians(corner));
        sideC = getSideC();
        getAreaAndPerimeterOfInsideTriangle(sideA, sideB, sideC);
    }

    public float getArea() {
        return sideA * sideB * deg;
    }

    @Override
    public float getSideC() {
        float sideC = (float) Math.sqrt(sideA*sideA + sideB*sideB - 2*sideA*sideB*Math.cos(Math.toRadians(corner)));
        System.out.println("Side C "+sideC);
        return sideC;
    }

    @Override
    protected void getAreaAndPerimeterOfInsideTriangle(float sideA, float sideB, float sideC) {
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        System.out.println("Area of inside triangle: "+triangle.getArea());
        System.out.println("Perimeter of inside triangle: "+triangle.getPerimeter());
    }

    protected static float methodForTesting(float sideA, float sideB, float sideC){
        return sideA+sideB+sideC;
    }
}
