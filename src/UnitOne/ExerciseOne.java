package UnitOne;

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your firs name:");
        String firsName = scanner.nextLine();

        System.out.printf("Enter your last name:");
        String lastName = scanner.nextLine();

        System.out.printf("Enter your middle name:");
        String middleName = scanner.nextLine();

System.out.printf("Your full name is:" + firsName + middleName + lastName);

    }




}
