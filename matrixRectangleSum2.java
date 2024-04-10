import java.util.Scanner;

public class matrixRectangleSum2  {
    static void prefixSumMatrix(int Matrix[][]){
        int r = Matrix.length;
        int c =Matrix[0].length;
        
        for(int i = 0 ; i < r; i++){
            for(int j =1; j < c; j++){
                Matrix[i][j] += Matrix[i][j -1];
            }
        }
    }    

    static int findSum(int [][]Matrix, int r1, int c1, int r2, int c2){
        int sum = 0;
        prefixSumMatrix(Matrix);

        for(int i =r1; i <= r2; i++){
            //calculate sum r1 to r2
            if(r1 >= 1)
                 sum += Matrix[i][c2] - Matrix[i][c1 -1];
            else
                 sum += Matrix[i][c2];
        }

        return sum;
    }

    static void printmatrix(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of row  and  column:");
        int r = sc.nextInt();
        
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        System.out.println( "enter element of matrix: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
               arr[i][j] = sc.nextInt();
            }
            
        }
        System.out.println("orignal matrix ");
        printmatrix(arr);

        System.out.println("Enter boundaries of rectangle r1, r2, c1, c2 ");
        int r1 =sc.nextInt();
        int c1 =sc.nextInt();
        int r2 =sc.nextInt();
        int c2 =sc.nextInt();

        System.out.println("answer is : ");
        System.out.println(findSum(arr, r1, c1, r2, c2));
    }
}
