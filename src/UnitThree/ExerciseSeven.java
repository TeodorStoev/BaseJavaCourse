package UnitThree;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess what number from 1 to 100 I'm thinking about: ");
       int guessNumber = scanner.nextInt();
        int randomNumber = 10;

       do {if (guessNumber>randomNumber)
           System.out.println("Your number is higher. Try again:");
           guessNumber = scanner.nextInt();
           if(guessNumber<randomNumber)
               System.out.println("Your number is low. Try again:");
           guessNumber = scanner.nextInt();

       }while (randomNumber!=guessNumber);
       System.out.println("Yea, this is my number");



    }

}
