package UnitThree;

public class ExerciseFive {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        for (int num : numbers){
            if (num %3 == 0){
                continue;
            }else{
                System.out.println("Nnumber " +num+ " isn't multiples of three");
            }
        }

    }
}
