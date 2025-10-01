package UnitFour;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean running = true;

        while (running){
            System.out.println("Menu:");
            System.out.println("1. Add task");
            System.out.println("2. Show tasks");
            System.out.println("3. Remove task");
            System.out.println("4. Exit");
            System.out.print("Choose one option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter task: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task added");
                    break;

                case 2:
                    if (!tasks.isEmpty()){
                        System.out.println("Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i+1) + ". " + tasks.get(i));
                        }
                    } else {
                        System.out.println("The list is empty");
                    }
                    break;

                case 3:
                    if(tasks.isEmpty()){
                        System.out.println("No task in the list");
                    } else {
                        System.out.println("Enter task number to remove: ");
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine();
                        if(taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber-1);
                            System.out.println("Task removed");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
