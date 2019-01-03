package PE2.problem2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Powerof4test {

    Powerof4 test;
    @Before
    public void setUp(){
        test=new Powerof4();
    }
    @After
    public void Teardown(){
        test=null;
    }
        @Test
        public void testForNumberWhichIsAPowerOf4(){

            int result = test.isPowerOfFour(64);
            assertEquals(1, result);
        }

    @Test
    public void testForNumberWhichIsANotPowerOf4(){

        int result = test.isPowerOfFour(23);
        assertEquals(0, result);
    }



}