import java.util.Scanner;

public class transposeMatrix {
    public static int[][] transposeMatrixArray(int arr[][], int r, int c){
        int ans[][] =new int[c][r];

        for(int i = 0 ; i < c; i++){
            for(int j = 0; j < r; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    //not creating another array
    //Array in place method ,it only use int squre marrix  
    static void transposeMatrixInplace(int[][] arr, int r, int c){
        
    for(int i = 0; i < c; i++){
        for(int j = i; j < r; j++){
            //swapping arr[0][1] = arr[1][0] for all matrix and all indices
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
            }

        }printmatrix(arr);
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
        System.out.println("Answer matrix ");
        int ans[][] = transposeMatrixArray(arr, r, c);
        printmatrix(ans);


        //using inplacce
        //transposeMatrixInplace(arr, r, c);
    }
}
