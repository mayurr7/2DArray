import java.util.Scanner;

public class leftSpiralMatrix {
    static void statrtLeftSpiralMatrix(int[][]Matrix,int r, int c){
        int topRow = 0; int leftClm = 0; int rightClm =c-1; int bottomRow =r-1;
        int totalElement = 0;
        while (totalElement < r * c) {
            //for left column
            for(int j = topRow; j <= bottomRow && totalElement < r*c; j++){
                System.out.print(Matrix[j][leftClm]+ " ");
                totalElement++;
            }
            leftClm++;

            //for bottom row
            for(int i = leftClm; i <= rightClm && totalElement < r*c; i++){
                System.out.print(Matrix[bottomRow][i]+ " ");
                totalElement++;
            }
            bottomRow--;

            //for right column
            for(int j= bottomRow; j >= topRow && totalElement < r*c; j--){
                System.out.print(Matrix[j][rightClm]+ " ");
                totalElement++;
            }
            rightClm--;

            //for top row
            for(int i = rightClm; i >= leftClm && totalElement < r*c; i--){
                System.out.print(Matrix[topRow][i]+ " ");
                totalElement++;
            }
            topRow++;
        }
        
    }

    static void printmatrix(int[][] Matrix){
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[i].length; j++){
                System.out.print(Matrix[i][j] + " ");
            }System.out.println();
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of row  and  column:");
        int r = sc.nextInt();
        
        int c = sc.nextInt();
        int Matrix[][] = new int[r][c];

        System.out.println( "enter element of matrix: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
               Matrix[i][j] = sc.nextInt();
            }
            
        }
        System.out.println("orignal matrix ");
        printmatrix(Matrix);

        System.out.println("Answer is");
        statrtLeftSpiralMatrix(Matrix, r, c);
        
        
        
    
    }
}
