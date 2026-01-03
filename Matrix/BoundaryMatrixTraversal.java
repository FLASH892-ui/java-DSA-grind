import java.util.*;
import java.util.Scanner;
class Traversal{
    static void boundary(int[][] matrix, int row, int column){
        if(row == 1){
            for(int j=0; j<column; j++){
                System.out.print(matrix[0][j]+" ");
            }
            return;
        }
        if(column == 1){
            for(int i = 0; i <row; i++) {
                System.out.print(matrix[i][0] + " ");
            }
            return;
        }
        for(int j=0;j<column-1;j++){
            System.out.print(matrix[0][j]+" ");
        }
        for(int i = 0; i < row - 1; i++) {
            System.out.print(matrix[i][column - 1] + " ");
        }
        for(int j = column - 1; j > 0; j--) {
            System.out.print(matrix[row - 1][j] + " ");
        }
        for(int i = row - 1; i > 0; i--) {
            System.out.print(matrix[i][0] + " ");
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
        Traversal.boundary(matrix,row,column);
    }
}
