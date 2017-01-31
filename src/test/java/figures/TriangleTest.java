package figures;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void getArea() throws Exception {
        Triangle t = new Triangle(4,5,6);
        float res = t.getArea();
        assertEquals(9, res, 1);
    }

    @Test
    public void getPerimeter() throws Exception {
        Triangle t = new Triangle(4,5,6);
        float res = t.getPerimeter();
        assertEquals(15, res, 1);
    }

    @Test
    public  void isValidateForExistence() throws Exception{
        Triangle mockIsExist = Mockito.mock(Triangle.class);
        when(mockIsExist.isValidateForExistence()).thenReturn(true);
        boolean b = mockIsExist.isValidateForExistence();
        assertTrue(b);
    }
}