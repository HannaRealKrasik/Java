package apexsystem.Fruit;

public class Apple extends Fruit {

    @Override
    public void makeJuice(){
        System.out.println("juice from Apple done");
    }

    public Apple(int calories) {
        setCalories(3);
    }
    public void removeSeeds(){
        System.out.println("removeSeeds()");

    }


}
