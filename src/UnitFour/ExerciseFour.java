package UnitFour;

public class ExerciseFour {
    public static void main(String[] args){
        int[] array = {3,54,-9,4,17};
        int biggestNumber = 0;

        for(int num:array){
            if(num>biggestNumber){
                biggestNumber=num;

            }


        }
        System.out.println("The biggest number is: "+biggestNumber);
    }
}
