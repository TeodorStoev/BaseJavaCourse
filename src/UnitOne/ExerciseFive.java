package UnitOne;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int y = 525600;
        int d = 1440;

        System.out.println("Enter minutes: ");
        int minutes = scanner.nextInt();

        int years = minutes/y;
        int r = minutes-years*y;
        int days = r/d;


        System.out.println("You have " + years + " years and " + days + " days");





    }



}
