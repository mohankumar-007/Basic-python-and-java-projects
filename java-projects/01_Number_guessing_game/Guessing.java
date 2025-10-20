
import java.util.Scanner;

public class Guessing {
    public static void number_guessing()
    {
        Scanner sc = new Scanner(System.in);
        int num = 1 +(int)(100 * Math.random()); //generate the random number from 1 to 100
        int chance =5; // this is the assignment of no. of chances

        int i;
        for(i=0; i <= chance; i++){
            System.out.println("enter the guessing number:");
            int guess = sc.nextInt();

            if (guess == num){
                System.out.println("hurray you have found the correct number");
                sc.close();
                return;// exit the function if the guessed number is correct
            }
            else if( guess < num){
                System.out.println("Little bit higher");
            }
            else{
                System.out.println("Little bit lower");
            }
        }

        /* if the is out of chance then print */
        System.out.println("Sorry you have lost please try again");


    }
    public static void main (String[] args){
        number_guessing();
    }
}





