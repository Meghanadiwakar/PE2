package PE2.problem3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest{


    Even test;
    @Before
    public void setUp(){
        test=new Even();
    }
    @After
    public void Teardown(){
        test=null;
    }

    @Test
    public void testForEvennumber() {
        int result = test.Evenodd(2);
        assertEquals(0, result);
    }

    @Test
    public void testForOddnumber() {
        int result = test.Evenodd(5);
        assertEquals(1, result);

    }


}