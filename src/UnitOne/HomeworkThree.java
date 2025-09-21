package UnitOne;

import java.util.Scanner;

public class HomeworkThree {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the length of the base of triangle:");
        double sideA = scanner.nextDouble();

        System.out.printf("Enter the height of triangle: ");
        double height = scanner.nextDouble();

        System.out.printf("Area of a triangle is: " +((sideA*height)/2));



    }


}
