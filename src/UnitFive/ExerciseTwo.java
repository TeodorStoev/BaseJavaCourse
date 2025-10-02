package UnitFive;

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseTwo {
    public static void main(String[] args) {
        int[] numbers = {32,4,22,4,56,32,1,2,3,4};
        System.out.println("Oud array: "+ Arrays.toString(numbers));
        System.out.println("New array: "+removeDuplicateNumbers(numbers));
    }
public static ArrayList<Integer> removeDuplicateNumbers (int[] numbers){
        ArrayList<Integer> nonDuplicateNumbers = new ArrayList<>();
        for(int num : numbers){
            if(nonDuplicateNumbers.contains(num)){
                continue;
            }
            nonDuplicateNumbers.add(num);
        }
        return nonDuplicateNumbers;
}
}
