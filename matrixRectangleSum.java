import java.util.Scanner;

public class matrixRectangleSum {

    static int matrixRectangleSumBruteForce(int[][] Matrix, int r1, int c1, int r2, int c2){
        int sum =0;

        for(int i = r1; i <= r2; i++){
            for(int j = c1; j <= c2; j++){
                sum += Matrix[i][j];
            }
        }
        return sum;
        

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

        System.out.println("Enter boundaries of rectangle r1, r2, c1, c2 ");
        int r1 =sc.nextInt();
        int c1 =sc.nextInt();
        int r2 =sc.nextInt();
        int c2 =sc.nextInt();

        System.out.println("answer is : ");
       System.out.println(matrixRectangleSumBruteForce(Matrix, r1, c1, r2, c2));


    }
}
