import org.junit.Test;
import org.testng.Assert;

public class ZoomTest extends TestBase {

    @Test
    public void testZoomIn() {
        ButtonData data = new ButtonData('+');
        app.zoomHelper.selectSign(data);
        System.out.println(app.zoomHelper.getZoomResult());
        Assert.assertEquals(app.zoomHelper.getZoomResult(), "110%");
    }

    @Test
    public void testZoomOut() {
        ButtonData data = new ButtonData('-');
        app.zoomHelper.selectSign(data);
        System.out.println(app.zoomHelper.getZoomResult());
        Assert.assertEquals(app.zoomHelper.getZoomResult(), "90%");
    }

}
