package UnitTwo;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 16){
            System.out.println("You is eligible to work");
        }else {
            System.out.println("You isn't eligible to work");
        }

    }


}
