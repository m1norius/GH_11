package figures;

import main.Shape;

public class Triangle extends Shape {

    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected boolean isValidateForExistence(){
        if(a + b > c && a + c > b && c + b > a){
            return true;
        }else {
            System.out.println("Triangle is not exist");
        }
        return false;
    }

    public float getArea() {

        if(isValidateForExistence()){
            float p = getPerimeter()/2;
            return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }

        return 0;
    }

    public float getPerimeter() {
        if (isValidateForExistence()){
            return a+b+c;
        }else {
            return 0;
        }
    }
}
