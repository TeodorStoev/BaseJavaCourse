package UnitTwo;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vacation type: Beach/Mountain - ");
        String vacantionType = scanner.nextLine();

        System.out.println("Enter your daily budget: ");
        double dailyBudget = scanner.nextDouble();

        boolean bulgaria = (vacantionType.equals("Beach") && dailyBudget < 50) || (vacantionType.equals("Mountain") && dailyBudget < 30);
        boolean outsideBulgaria = (vacantionType.equals("Beach") && dailyBudget >= 50) || (vacantionType.equals("Mountain") && dailyBudget >= 30);

        if (bulgaria) {
            System.out.println("Bulgaria");
        }else if(outsideBulgaria){
            System.out.println("Outside Bulgaria");
        }else {
            System.out.println("No information about this type of vacation");
        }



    }
}




