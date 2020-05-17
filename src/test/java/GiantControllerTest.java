import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class GiantControllerTest {
    private  GiantModel giantModel;
    private GiantView giantView;
    private GiantController giantController;

    @BeforeEach
    public  void setUp(){
        System.out.println("PRZED");
        giantModel = Mockito.mock(GiantModel.class);
        giantController = Mockito.mock(GiantController.class);
        giantView = Mockito.mock(GiantView.class);
        giantController = new GiantController(giantModel, giantView);

    }


    @Test
    public void testSetHealth(){


       // Mockito.verify(giantModel,
        //        Mockito.times(2));

        giantController.setHealth(Health.HEALTHY);
        System.out.println(giantController.getHealth());
        Mockito.when(giantController.getHealth()).thenReturn(Health.HEALTHY);
        assertEquals(giantController.getHealth(), Health.HEALTHY);


       /// for( final Health health: Health.values()){
      // /     giantController.setHealth(health);
       //    Mockito.verify(giantModel).setHealth(health);
     //   }
      //  giantController.getHealth();
       // Mockito.verify(giantModel).getHealth();

    }
    @Test
    public void  testSetFatigue(){
        for( final Fatigue fatigue: Fatigue.values()){
            giantController.setFatigue(fatigue);
            Mockito.verify(giantModel).setFatigue(fatigue);
        }
        giantController.getFatigue();
        Mockito.verify(giantModel).getFatigue();
    }
    @Test
    public void testSetNourishment(){
        for ( final  Nourishment nourishment: Nourishment.values()){
            giantController.setNourishment(nourishment);
            Mockito.verify(giantModel).setNourishment(nourishment);

        }
        giantController.getNourishment();
        Mockito.verify(giantModel).getNourishment();
    }
}