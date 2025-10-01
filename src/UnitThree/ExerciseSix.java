package UnitThree;

public class ExerciseSix {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;

        for (int num : numbers) {
           sum = sum + num;
        }
        System.out.println("The average of numbers is: " + sum/7);
    }
}