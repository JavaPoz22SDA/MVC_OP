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
        this.giantView.displayGiant(this.modelCollection.get(index));
    }

   public Health getHealth(int index) {
        return this.modelCollection.get(index).getHealth();
    }

    public void setHealth(int index, Health health) {
        this.modelCollection.get(index).setHealth(health);
    }

    public Fatigue getFatigue(int index) {
        return this.modelCollection.get(index).getFatigue();
   }

   public void setFatigue(int index, Fatigue fatigue) {
        this.modelCollection.get(index).setFatigue(fatigue);
    }

   public Nourishment getNourishment(int index) {
       return this.modelCollection.get(index).getNourishment();
    }

   public void setNourishment(int index, Nourishment nourishment) {
        this.modelCollection.get(index).setNourishment(nourishment);
    }

  //  public GiantView getGiantView(int index) {
   //     return giantView;
  //  }

   // public void setGiantView(int index, GiantView giantView) {
   //     this.giantView = giantView;
  //  }

  //  public GiantModel getGiantModel(int index) {
   //     return modelCollection.get(index);
  //  }

  //  public void setGiantModel(int index, GiantModel giantModel) {
    //    this.giantModel = giantModel;
   // }
}
