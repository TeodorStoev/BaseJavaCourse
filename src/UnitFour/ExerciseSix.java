package UnitFour;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(4);
        num.add(3);
        num.add(2);
        num.add(1);
        boolean running = true;

        while (running){
            System.out.println("Menu:");
            System.out.println("1. Add number");
            System.out.println("2. Show number");
            System.out.println("3. Check number");
            System.out.println("4. Exit");
            System.out.println("Enter your choose from 1 to 4: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter number: ");
                    int newNumbers = scanner.nextInt();
                    scanner.nextLine();
                    num.add(newNumbers);
                    System.out.println("The numbers is added");
                    break;

                case 2:
                    System.out.println("All numbers is "+num);
                    break;

                case 3:
                    System.out.println("Enter number: ");
                    int checkedNumbers = scanner.nextInt();
                    scanner.nextLine();


                        if(num.contains(checkedNumbers)){
                            System.out.println(checkedNumbers+" is on the list");
                        }else {
                            System.out.println(checkedNumbers+" is not on the list");
                        }

                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye");
                    break;
            }

        }




    }


}
