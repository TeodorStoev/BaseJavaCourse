package UnitFour;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter row: ");
        int row = scanner.nextInt();

        System.out.println("Enter colum: ");
        int colum = scanner.nextInt();

        int[][] matrix = new int[row][colum];

        System.out.println("Enter number in the matrix: ");
        for(int i = 0; i<row; i++) {
            for(int j = 0; j< colum; j++){
                matrix [i] [j] = scanner.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }



    }


}
