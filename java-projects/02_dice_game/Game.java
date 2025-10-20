import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        while (true){
            System.out.println(" you wish to play (y/n): ");
            String chance = sc.nextLine().toLowerCase();
            if (chance .equals("y")){
                int dice1 = ran.nextInt(6)+1;
                int dice2 = ran.nextInt(6)+1;
                System.out.println("("+dice1 +" "+dice2+")");
            } else if (chance.equals("n")) {
                System.out.println("Thanks for playing");
                break;
            }
            else {
                System.out.println("all will be better");
            }
        }
    }
}
