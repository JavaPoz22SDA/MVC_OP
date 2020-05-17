import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GiantView giantView = new GiantView();
        GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.TIRED, Nourishment.HUNGRY);
        GiantModel giantModel1 = new GiantModel(Health.HEALTHY, Fatigue.TIRED, Nourishment.SATURATED);
        GiantModel giantModel2 = new GiantModel(Health.DEAD, Fatigue.TIRED, Nourishment.SATURATED);

        GiantController giantController = new GiantController(giantModel, giantView );
        giantController.updateView();
        System.out.println(giantController.getFatigue());

        List<GiantModel> modelCollection = new ArrayList<>();
        modelCollection.add(giantModel);
        modelCollection.add(giantModel);
        modelCollection.add(giantModel2);
        GiantCollectionController giantCollectionController = new GiantCollectionController(modelCollection, giantView);
        giantCollectionController.getGiantModel(1);

    }
}
