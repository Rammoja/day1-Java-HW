import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }
    @Test
    public void getVolume() {
        System.out.println(waterBottle.getVolume());
        assertEquals( 100, waterBottle.getVolume() );
    }

    @Test
    public void isAbleToDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }
    @Test
    public void drinkall(){
        waterBottle.all();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillUp(){
        waterBottle.up();
        assertEquals(100, waterBottle.getVolume());
    }


}
