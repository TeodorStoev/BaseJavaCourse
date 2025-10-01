package UnitThree;

public class ExserciseTwo {
    public  static void main(String[] args){
        int[] listOne = {12,15,32,42,55,75,122,132,150,180,200};
        int rightNumber = listOne[0];

        for (int number : listOne){
           if (number > 150){
               break;
           }

            if(number%5 == 0){
                System.out.println("Number " + number + " is divisible to 5");

            }
        }

    }


}
