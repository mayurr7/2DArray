import java.util.Scanner;

public class practice {
   static int[][] transposeMatrix(int arr[][], int r , int c ){
    int  ans[][] = new int[c][r];
    for(int i = 0 ; i < c ; i++){
        for(int j = 0; j <r; j++){
            ans[i][j] = arr[j][i];
            
        }
    }
    return ans;
   }

   static void reverseTransposeMatrix(int ans[][]){
        for(int i = 0; i < ans.length; i ++){
            int left = 0;
            int right = ans[i].length-1;
            while (left < right) {
                int temp = ans[i][left];
                ans[i][left] = ans[i][right];
                ans[i][right] = temp;
                left++;
                right--;
            }
        }
   }

    static void printAreay(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter row  and columnof arraay :");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter element of first matrix  : ");

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] =sc.nextInt();
            }
        }
        System.out.println("Array matrix ");
        printAreay(arr);
      
   
    
        System.out.println("answer is :");
       int ans[][] = transposeMatrix(arr, r, c);
       

        reverseTransposeMatrix(ans);
        printAreay(ans);
       

    }
}

