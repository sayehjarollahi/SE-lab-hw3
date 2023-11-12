import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testComputeArea() {
        Rectangle rectangle = new Rectangle(3, 6);
        double actualArea = rectangle.computeArea();
        assertEquals(18, actualArea, 0);
    }

}