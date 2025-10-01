package UnitThree;

public class ExerciseFour {
    public static void main(String[] args){
        int [] numbers = {3, 7, 11, 20, 8, 15};

        for (int num : numbers){
            if(num %5 == 0){
                System.out.println("Firs number how multiple to five is " + num);
                break;
            }
        }
    }
}
