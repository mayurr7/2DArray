import java.util.Scanner;

public class practice {
    // static void swappArrayy(int arr[][] , int i, int j){
    //    arr[i][j] =arr[j][i];
    // }

   static void reverseArray(int arr[][]){
    for(int i =0; i<arr.length; i++){
        for(int j = arr.length-1; j>=0; j--){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    

   }

    // static void reverse(int arr[][]){
       
    //     for(int i =0; i<arr.length; i++){
    //         for(int j = 0 ; j<arr[i].length; j++){
    //             swappArrayy(arr, i, j);
    //             j++;
    //         }
    //     }
      
       
    // }

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
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int arr[][] = new int[r1][c1];

        System.out.println("Enter element of first matrix  : ");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] =sc.nextInt();
            }
        }
        System.out.println("Array matrix ");
        printAreay(arr);
      
   
    
        System.out.println("answer is :");
      reverseArray(arr);
       

    }
}
int top =0;
int bottom = arr.length-1;
 while (top < bottom) {
    int temp = arr[i][top];
    arr[i][top] = arr[bottom][i];
    arr[bottom][i] = temp;
    top++;
    bottom--;
 }

}printAreay(arr);