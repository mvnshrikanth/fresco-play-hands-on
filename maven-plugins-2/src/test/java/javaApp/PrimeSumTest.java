package javaApp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeSumTest {
    @Test
    public void negativeTest()
    {
        long output = PrimeSum.primesum(-10);
        assertEquals(0, output);
    }
    @Test
    public void zeroTest()
    {
        long output = PrimeSum.primesum(0);
        assertEquals(0, output);
    }
    @Test
    public void positiveTest()
    {
        long output = PrimeSum.primesum(20);
        assertEquals(77, output);
    }
}
  