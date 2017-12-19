public class ZoomHelper extends HelperBase {
    public ZoomHelper(AppManager manager) {
        super(manager);
    }

    public void selectSign(ButtonData data) {
        switch (data.title) {
            case '+':
                zoomIn();
                break;
            case '-':
                zoomOut();
                break;
            default:
                break;
        }
    }

    public String getZoomResult() {
        return aux.controlGetText(WINTITLE, "", "Static2");
    }
}
