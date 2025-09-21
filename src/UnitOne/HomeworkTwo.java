package UnitOne;

import java.util.Scanner;

public class HomeworkTwo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter first side of triangle A: ");
        double sideA = scanner.nextDouble();

        System.out.printf("Enter second side of triangle B: ");
        double sideB = scanner.nextDouble();

        System.out.printf("Enter third side of triangle C: ");
        double sideC = scanner.nextDouble();

        System.out.printf("Perimeter of triangle is: " + (sideA+sideB+sideC));




    }


}
