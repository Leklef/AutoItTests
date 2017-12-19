import org.junit.After;
import org.junit.Before;

public class TestBase {
    public AppManager app;

    @Before
    public void initApp() {
        app = new AppManager();
    }

    @After
    public void stopApp() {
        app.stop();
    }
}
