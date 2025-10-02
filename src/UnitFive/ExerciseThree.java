package UnitFive;

public class ExerciseThree {
    public static void main(String[] args) {
        int[] numbers = {11,12,13,14,15};
        lastNumber(numbers);

    }
    public static void lastNumber (int[] number){

        if(number.length==0){
            System.out.println("This string is empty");
        }else {
            System.out.println("Last number is: "+number[number.length-1]);

        }

        }
}
