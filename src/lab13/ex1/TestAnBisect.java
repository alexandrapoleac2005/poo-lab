package lab13.ex1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestAnBisect {

    private AnBisect anBisect;

    @Before
    public void setUp(){
        anBisect = new AnBisect();
    }

    @Test
    public void testAnBisect(){

        assertTrue(anBisect.esteAnBisect(4));
        assertTrue(!anBisect.esteAnBisect(11));
        assertTrue(!anBisect.esteAnBisect(99));

    }

    @After
    public void tearDown(){
        anBisect = null;
    }
}
