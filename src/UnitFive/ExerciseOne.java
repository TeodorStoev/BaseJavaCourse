package UnitFive;

public class ExerciseOne {
    public static void main(String[] args) {
        int[] numbers = {56, 3, 2,34,4,5,32, 42};
        smallestNumber (numbers);
        average(numbers);
        middleCharacter(numbers);
        String[] words = {"book","pen","phone","TV","button"};
        countWords(words);
        secondLargestNumber(numbers);

    }

    public static void smallestNumber (int[] num) {
        int smallestNumber = num[0];
        for (int number : num) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        System.out.println("The smallest number is: " + smallestNumber);
    }
        public static void secondLargestNumber (int[] num){
        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;
        for(int number : num){
            if (number > firstLargestNumber) {
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = number;
            } else if (number > secondLargestNumber && number != firstLargestNumber) {
                secondLargestNumber = number;
            }
        }
        System.out.println("The second largest number is: " + secondLargestNumber);

    }
    public static void average (int[] numbers){
        int average = 0;
        for (int number : numbers){
            average = number + average;
        }
        System.out.println("The average is: "+average);
    }
    public static void middleCharacter (int[] character){

            if (character.length % 2 == 0){
                int firstMiddleCharacter = character.length/2-1;
                int socondMiddleCharacter = character.length/2;
                System.out.println("The middle characters are: "+character[firstMiddleCharacter]+" and "+character[socondMiddleCharacter]);
            }else {
                int oddMiddleCharacter = character.length/2;
                System.out.println("The middle character is: "+character[oddMiddleCharacter]);
            }

    }
    public static void countWords (String[] words){
        System.out.println("The count of words is: "+words.length);
    }
}
