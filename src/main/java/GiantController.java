public class GiantController {

    private GiantModel giantModel;
    private GiantView giantView;

    public GiantController( GiantModel giantModel, GiantView giantView){
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public GiantView getGiantView() {
        return giantView;
    }

    public void setGiantView(GiantView giantView) {
        this.giantView = giantView;
    }

    public GiantModel getGiantModel() {
        return giantModel;
    }

    public void setGiantModel(GiantModel giantModel) {
        this.giantModel = giantModel;
    }

    public void updateView(){
        this.giantView.displayGiant(this.giantModel);
    }

}
