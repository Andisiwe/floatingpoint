package za.ac.cput.floatingpoint;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class TestFloatingPoint extends TestCase {
    public void testFloat() throws Exception{
        FloatingPoint fp = new FloatingPoint();

        Assert.assertEquals(8.5, fp.myFloat(), fp.myFloat());
    }
}
