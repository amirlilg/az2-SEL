import main.Rectangle;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void computeAreaTest() {
        Rectangle rectangle = new Rectangle(10, 20);
        double area = rectangle.calculateArea();
        Assert.assertEquals(200.0, area, 0.0);
    }

    @Test
    public void widthChangeTest() {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setWidth(5.0);
        Assert.assertEquals(5.0, rectangle.getWidth(), 0.0);
    }

    @Test
    public void heightChangeTest() {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setHeight(25.0);
        Assert.assertEquals(25.0, rectangle.getHeight(), 0.0);
    }
    
}
