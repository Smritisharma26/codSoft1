import java.util.Scanner;
import java.lang.Math;
public class GuessingGame{
    public static void main(String[] args){
        int answer=(int)(Math.random()*100)+1;
        int k=5;
        Scanner input=new Scanner(System.in);
        boolean correct=false;
        System.out.println("I'm thinking of a number between 1 to 100 \n You have five tries to guess the number.");
        while(k>0){
            System.out.println("Enter your guess:");
            int guess=input.nextInt();
            if(guess==answer){
                System.out.println("You guessed the number!");
                break;
            }
            else if(guess>answer){
                System.out.println("Your guess is too high");
                k--;
            }
            else{
                System.out.println("Your guess is too low");
            }
            k--;
        }
        if(correct==false){
            System.out.println("You ran out of tries \n You lose");
        }
    }
}