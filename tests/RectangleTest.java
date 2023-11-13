import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testComputeArea() {
        Rectangle rectangle = new Rectangle(3, 6);
        double actualArea = rectangle.computeArea();
        assertEquals(18, actualArea, 0);
    }

    @Test
    public void testRectangleGetWidth() {
        Rectangle rectangle = new Rectangle(3, 6);
        assertEquals(3, rectangle.getWidth());
    }

    @Test
    public void testRectangleGetHeight() {
        Rectangle rectangle = new Rectangle(3, 6);
        assertEquals(6, rectangle.getHeight());
    }

    @Test
    public void testRectangleSetWidth() {
        Rectangle rectangle = new Rectangle(3, 6);
        rectangle.setWidth(4);
        assertEquals(4, rectangle.getWidth());
    }

    @Test
    public void testRectangleSetHeight() {
        Rectangle rectangle = new Rectangle(3, 6);
        rectangle.setHeight(8);
        assertEquals(8, rectangle.getHeight());
    }
}