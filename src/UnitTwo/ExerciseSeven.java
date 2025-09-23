package UnitTwo;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        int temperature = scanner.nextInt();

        System.out.println("If you want to convert from Celsius to Fahrenheit enter 1 " +
                "If you want to convert from Fahrenheit to Celsius enter 2 ");
        int typeTemperature = scanner.nextInt();

        if(typeTemperature==2){
            System.out.println("temperature in Celsius is: " + ((temperature-32) * (5.0 / 9.0)));
        }else if(typeTemperature==1) {
            System.out.println("Temperature in Fahrenheit is: " + ((temperature * (9.0 / 5.0)) + 32));
        }else {
            System.out.println("Not valid data");
        }


    }


}
