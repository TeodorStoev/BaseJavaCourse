package UnitTwo;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Price: ");
        double price = scanner.nextDouble();

        System.out.println("Quantity: ");
        int quantity = scanner.nextInt();



        if (100 <= quantity && quantity < 120){
            System.out.println("The revenue from sale: " + (price*quantity*(1-0.15)));
            System.out.println("Discount: " + (price*quantity*0.15));
        }else {
            if(quantity >= 120){
                System.out.println("The revenue from sale: " + (price*quantity*(1-0.20)));
                System.out.println("Discount: " + (price*quantity*0.20));
            }else {
                System.out.println("The revenue from sale: "+(price*quantity));
                System.out.println("Discount: 0");
            }
        }




    }



}
