package figures.four.non_right;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ParallelogramTest {
    @Test
    public void getSideC() throws Exception {
        Parallelogram mockParallelogram = Mockito.mock(Parallelogram.class);
        when(mockParallelogram.getSideC()).thenReturn(10f);
        float res =  mockParallelogram.getSideC();
        float res1 = Parallelogram.methodForTesting(10, 10, res);
        assertEquals(30, res1, 1);
    }

    @Test
    public void getArea() throws Exception {
        Parallelogram p = new Parallelogram(15, 20, 35);
        float res = p.getArea();
        assertEquals(172.072, res, 1);
    }



}