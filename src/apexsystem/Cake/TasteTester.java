package apexsystem.Cake;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(33);
        birthdayCake.setPrise(56);
        birthdayCake.setTaste("hjk");
        System.out.println(birthdayCake.getPrise() +" "+birthdayCake.getCandles());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrise(78);
        System.out.println(weddingCake.getPrise());
    }
}
