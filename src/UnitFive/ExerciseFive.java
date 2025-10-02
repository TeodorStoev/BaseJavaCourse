package UnitFive;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Is number a palindrome? "+isPalindrome(number));

    }
    public static boolean isPalindrome(int number){
        String str = Integer.toString(number);

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
