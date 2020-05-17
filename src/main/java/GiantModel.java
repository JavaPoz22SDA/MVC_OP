public class GiantModel {
    private Health health;
    private Fatigue fatigue;
    private Nourishment nourishment;

    public GiantModel(Health health, Fatigue fatigue, Nourishment nourishment){
       this.fatigue = fatigue;
       this.health = health;
       this.nourishment = nourishment;
    }

    public Nourishment getNourishment() {
        return nourishment;
    }

    public void setNourishment(Nourishment nourishment) {
        this.nourishment = nourishment;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "GiantModel{" +
                "health=" + health +
                ", fatigue=" + fatigue +
                ", nourishment=" + nourishment +
                '}';
    }
}
