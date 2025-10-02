package UnitFive;

public class ExerciseFour {
    public static void main(String[] args) {
        int number = 3;
        isEven(number);
    }
    public static void isEven (int number){
        if (number % 2 == 0){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
