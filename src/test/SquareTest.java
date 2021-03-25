import main.Square;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest{
	
	@Test
    public void calculateAreaTest() {
    	Square square = new Square(20);
    	double area = square.calculateArea();
    	Assert.assertEquals(400.0, area, 0.0);
    }
	
    @Test
    public void squareSideChangeTest() {
    	Square square = new Square(10);
    	square.setSide(11.0);
    	Assert.assertEquals(11.0, square.getSide(), 0.0);
    }	
}