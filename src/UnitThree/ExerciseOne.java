package UnitThree;

public class ExerciseOne {
    public static void main(String[] args){
        int [] numbers = {2,35,161,-123,42};
        int biggestNumber  = numbers[0];

       for (int number: numbers){
           if (biggestNumber < number){
               biggestNumber = number;
           }
        }
       System.out.println("The biggest number is: " +biggestNumber);

    }


}
