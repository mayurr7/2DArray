import java.util.Scanner;

public class spiralMatrix {
    static void spiralMatrixPrint(int[][] Matrix, int r, int c){
        int topRow = 0;  int bttomRow = r-1; int rightClm = c-1;
        int leftClm = 0;
        int totalElement = 0;
        while (totalElement < r * c) {
            //topRow -> leftClm to rightClm
            for(int i = leftClm; i <= rightClm && totalElement < r * c ; i++){
                System.out.print(Matrix[topRow][i]+" ");
                totalElement++;
                
            }topRow++;

            //rightClm ->topRow to  btttomRow
            for(int j = topRow ; j <= bttomRow && totalElement < r * c ; j++){
                System.out.print(Matrix[j][rightClm]+" ");
                totalElement++;
            }rightClm--;

            //bottomRow -> rightClm toleftClm
            for(int i = rightClm; i>= leftClm && totalElement < r * c ; i--){
                System.out.print(Matrix[bttomRow][i] + " ");
                totalElement++;
            }bttomRow--;

            //leftClm -> bottomRow to topRow
            for(int j = bttomRow; j  >= topRow && totalElement < r * c ; j--){
                System.out.print(Matrix[j][leftClm]+ " ");
                totalElement++;
            }leftClm++;
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
        System.out.println("Answer matrix ");
        spiralMatrixPrint(Matrix, r, c);
    
    }    
}