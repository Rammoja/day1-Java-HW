import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculaterTest {

        Calculater calculater;

    @Before
    public void before(){
        calculater = new Calculater(12, 5);
    }

    @Test
    public void addNums() {
        assertEquals( 17, calculater.addNums() );
    }
    @Test
    public void subtractNums() {
        assertEquals( 7, calculater.subtractNums());
    }
    @Test
    public void divideNums() {
        assertEquals( 2, calculater.divideNums());
    }
    @Test
    public void multiplyNums() {
        assertEquals( 60, calculater.multiplyNums());
    }


}
