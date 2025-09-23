package UnitTwo;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a value in degrees for the angle A: ");
        int angleA = scanner.nextInt();

        System.out.println("Enter a value in degrees for the angle B: ");
        int angleB = scanner.nextInt();

        System.out.println("Enter a value in degrees for the angle C: ");
        int angleC = scanner.nextInt();

        boolean triangle = angleA > 0 && angleB > 0 && angleC > 0 && angleA + angleB + angleC == 180;

        boolean right = angleA == 90 || angleB == 90 || angleC == 90;
        boolean obtuse = angleA > 90 || angleB > 90 || angleC > 90;
        boolean acute = angleA < 90 && angleB < 90 && angleC < 90;


        boolean equilateral = angleA == 60 && angleB == 60 && angleC == 60;
        boolean isosceles = ( (angleA == angleB || angleA == angleC || angleB == angleC) && !equilateral );
        boolean multifaceted = angleA != angleB && angleA != angleC && angleB != angleC;





        if (triangle) {
            String sideType = equilateral ? "Equilateral" : isosceles ? "Isosceles" : "Scalene";
            String angleType = right ? "Right" : obtuse ? "Obtuse" : "Acute";
            System.out.println(sideType + " " + angleType + " triangle");
        } else {
            System.out.println("These values cannot be a triangle");
        }

    }



}
