import java.util.Scanner;

public class makeSpiralMatrix {
    static int[][] makeSpiralMatrixNSize(int n){
        int[][] Matrix = new int[n][n];

        int topRow = 0;  int bttomRow = n-1; int rightClm = n-1;
        int leftClm = 0;
        int currElement = 1;

        while (currElement <= n * n) {
            //top row
            for(int i = leftClm; i <= rightClm && currElement <= n * n ; i++){
                Matrix[topRow][i] = currElement;
                currElement++;
            }
            topRow++;

            //right column
            for(int j = topRow; j <= bttomRow && currElement <= n * n; j++){
                Matrix[j][rightClm] = currElement;
                currElement++;
            }
            rightClm--;

            //bottom row
            for(int i =rightClm; i >= leftClm && currElement <= n * n; i--){
                Matrix[bttomRow][i] = currElement;
                currElement++;
            }
            bttomRow--;

            //left column
            for(int  j =bttomRow; j >= topRow && currElement <= n * n; j--){
                Matrix[j][leftClm] = currElement;
                currElement++;
            }
            leftClm ++;
        }

            return Matrix;
    }

    static void printMatrix(int[][] Matrix){
        for(int i =0; i  < Matrix.length; i++){
            for(int j = 0; j < Matrix[i].length; j++){
                System.out.print(Matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Number : ");
        int n = sc.nextInt();

        int Matrix[][] = makeSpiralMatrixNSize(n);
        System.out.println("Spiral Matrix is : ");
        printMatrix(Matrix);

    }
}
