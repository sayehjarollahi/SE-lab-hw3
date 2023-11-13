import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void testComputeArea() {
        Square square = new Square(4);
        double actualArea = square.computeArea();
        assertEquals(16, actualArea, 0);
    }

    @Test
    public void testSquareSetEdge(){
        Square square = new Square(4);
        square.setEdge(5);
        assertEquals(25, square.computeArea());
    }

    @Test
    public void testSquareGetEdge(){
        Square square = new Square(4);
        assertEquals(4, square.getEdge());
    }
}
