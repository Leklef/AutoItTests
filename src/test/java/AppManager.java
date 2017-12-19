import autoitx4java.AutoItX;

public class AppManager {
    ZoomHelper zoomHelper;
    private AutoItX aux;
    public static String WINTITLE = "Документ - WordPad";

    public AppManager() {
        aux = new AutoItX();
        aux.run("C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe");
        aux.winWait(WINTITLE);
        aux.winActivate(WINTITLE);
        aux.winWaitActive(WINTITLE);
        zoomHelper = new ZoomHelper(this);
    }

    public void stop() {
        aux.winClose(WINTITLE);
    }

    public AutoItX getAux() {
        return aux;
    }
}
