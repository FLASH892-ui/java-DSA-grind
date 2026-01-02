import java.util.*;
import java.util.Scanner;
class Traversal{
    static void spiral(int[][] matrix, int row, int column){
        int top = 0; 
        int bottom = row - 1;
        int left = 0; 
        int right = column - 1;
        
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
    }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] matrix = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        Traversal.spiral(matrix,row,column);
    }
}
