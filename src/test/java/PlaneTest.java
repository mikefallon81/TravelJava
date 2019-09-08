import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void getType(){
        assertEquals(PlaneType.BOEING737, plane.getType());
    }

    @Test
    public void planeHasCapacity5(){
        assertEquals(5, plane.getCapacity());
    }

    @Test
    public void planehasWeight10(){
        assertEquals(10.00, plane.getWeight(), 0.01);
    }

}
