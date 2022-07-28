package apexsystem;

import java.util.Random;

public class chapter4d {
    public static void main(String[] args) {
        int points = 0;
        Random random = new Random();
        System.out.println("you have 5 attempt to reach 20 points");
       for(int i = 0; i < 10; i++){
           int die = random.nextInt(6) + 1;
            points =points + die;
            if(points < 20)
           System.out.println("You on " +points+ " possition. You need " +(20 - points)+ " points" );
            else if (points >= 20) {
                System.out.println("You win");
                break;
            }
       }
       if(points < 20)
           System.out.println("You loos");

    }
}
