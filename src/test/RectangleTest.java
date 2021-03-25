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
}
