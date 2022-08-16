package apexsystem.Fruit;

public class Banana extends Fruit{


    public Banana() {
        setCalories(33);
    }

    public void Peel(){
        System.out.println("Peel");
    }
    @Override
    public void makeJuice(){
        System.out.println("juice from Banana done");
    }
    public void removeSeeds(){
        System.out.println("removeSeeds()Banana");

    }
}
