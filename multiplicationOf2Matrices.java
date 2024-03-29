import java.util.Arrays;
import java.util.Scanner;

public class multiplicationOf2Matrices {

    static void multiplication(int arr[][], int r1, int c1, int arr2[][], int r2, int c2){
        if(c1 != r2){
            System.out.println( "Wrong dimension, Multiplication is not possible");
            return;
        }

        int[][]mul = new int[r1][c2];
        for(int i =0; i<r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < r2; k++){
                    mul[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("answer is");
        printMatrix(mul);

    }
    
    static void printMatrix(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first matrix size of row and column  ");

      int r1 =sc.nextInt();
      int c1 = sc.nextInt();

      int arr[][] = new int[r1][c1];

      System.out.println("Enter element of first matrix  : ");

      for(int i = 0; i < r1; i++){
          for(int j = 0; j < c1; j++){
              arr[i][j] =sc.nextInt();
          }
      }
      System.out.println("matrix 1 :");

      printMatrix(arr);

     
      System.out.println("Enter second matrix size of row and column  ");
      int r2 =sc.nextInt();
      int c2 = sc.nextInt();

      int arr2[][] = new int[r2][c2];

      System.out.println("Enter element of second matrix  : ");

      for(int i = 0; i < r2; i++){
          for(int j = 0; j < c2; j++){
              arr2[i][j] =sc.nextInt();
          }
      }
      System.out.println("matrix 2 :");
      printMatrix(arr2);

      multiplication(arr, r1, c1, arr2, r2, c2);

     }
}
