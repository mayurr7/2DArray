import java.util.Scanner;

public class matrixRectangleSum3 {
     static void prefixSumMatrix(int Matrix[][]){
        int r = Matrix.length;
        int c =Matrix[0].length;
        //row wise prefix sum
        for(int i = 0 ; i < r; i++){
            for(int j =1; j < c; j++){
                Matrix[i][j] += Matrix[i][j -1];
            }
        }

        //column wise prefix sum

        for(int j = 0; j < c; j++){
            for(int i = 1; i < r; i++){
                Matrix[i][j] += Matrix[i-1][j];
            }
        }
        
    }    

    static int findSum3(int [][]Matrix, int r1, int c1, int r2, int c2){
        prefixSumMatrix(Matrix);
        int sum = 0; int up = 0; int leftUp = 0; int left = 0;

        if (r1 >= 1) {
            up = Matrix[r1 - 1][c2];
        }

        if(c1 >= 1){
            left = Matrix[r2][c1 - 1];
        }

        if(r1 >= 1 && c1 >= 1){
            leftUp = Matrix[r1 - 1][c1 - 1];
        }
        
        sum =Matrix[r2][c2] - up -left + leftUp;
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
         System.out.println(findSum3(Matrix, r1, c1, r2, c2));
        
    
    }
}
