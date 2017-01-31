package figures;

import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {
    @Test
    public void getPerimeter() throws Exception {
        Circle c = new Circle(45);
        float res = c.getPerimeter();
        assertEquals(282.743, res, 1);
    }

    @Test
    public void getArea() throws Exception {
        Circle c = new Circle(45);
        float res = c.getArea();
        assertEquals(6361.7251, res, 1);
    }
}