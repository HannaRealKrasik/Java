package apexsystem.Fruit;

public class Main {
    public static void main(String[] args) {
        Fruit ban = new Banana();
        ((Banana) ban).removeSeeds();
        System.out.println(ban.getCalories());
        ban.makeJuice();
        squuze(ban);
        ban = new Apple(6);
        ban.makeJuice();
        squuze(ban);
    }
    public static void squuze(Fruit fruit){
        if(fruit instanceof Banana){
            System.out.println("Banana");
        }
        else System.out.println("Apple and other");
    }
}
