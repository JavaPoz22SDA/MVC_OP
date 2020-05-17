import java.util.ArrayList;
import java.util.List;

public class GiantCollectionController {
    private GiantView giantView;
    private List<GiantModel> modelCollection;
    private GiantModel giantModel;
    private int index;


    public GiantCollectionController(List<GiantModel> modelCollection, GiantView giantView){
        this.giantView = giantView;
        this.modelCollection = modelCollection;
    }

    public void updateView(int index){
        this.giantView.displayGiant(this.giantModel);
    }

    public Health getHealth(int index) {
        return this.giantModel.getHealth();
    }

    public void setHealth(int index, Health health) {
        this.giantModel.setHealth(health);
    }

    public Fatigue getFatigue(int index) {
        return this.giantModel.getFatigue();
    }

    public void setFatigue(int index, Fatigue fatigue) {
        this.giantModel.setFatigue(fatigue);
    }

    public Nourishment getNourishment(int index) {
        return this.giantModel.getNourishment();
    }

    public void setNourishment(int index, Nourishment nourishment) {
        this.giantModel.setNourishment(nourishment);
    }

    public GiantView getGiantView(int index) {
        return giantView;
    }

    public void setGiantView(int index, GiantView giantView) {
        this.giantView = giantView;
    }

    public GiantModel getGiantModel(int index) {
        return giantModel;
    }

    public void setGiantModel(int index, GiantModel giantModel) {
        this.giantModel = giantModel;
    }
}
