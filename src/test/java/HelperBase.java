import autoitx4java.AutoItX;
import com.jacob.com.*;
import com.jacob.activeX.*;
public class HelperBase {
    protected AppManager manager;
    protected String WINTITLE;
    protected AutoItX aux;

    public HelperBase(AppManager manager) {
        this.manager = manager;
        WINTITLE = AppManager.WINTITLE;
        this.aux = manager.getAux();
    }

    public void zoomIn() {
        aux.controlClick(WINTITLE, "", "Button2");
    }

    public void zoomOut() {
        aux.controlClick(WINTITLE, "", "Button1");
    }
}
