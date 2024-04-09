import java.util.Scanner;

public class sumOf2Matrix {
    static void add(int arr[][], int r1, int c1, int arr2[][], int r2, int c2 ){
        if(r1 != r2 || c1 != c2){
            System.out.println("Addition not possible  becausse dimension are diffrents ");
            return;

        }
       
        int[][] sum = new int [r1][c1];
        for(int i =0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
            
        }
        printAreay(sum);
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
        System.out.println("Enter row of arraay :");
        int r1 = sc.nextInt();
        System.out.println("enter column of arary");
        int c1 = sc.nextInt();

        int arr[][] = new int[r1][c1];

        System.out.println("Enter element of first matrix  : ");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] =sc.nextInt();
            }
        }


        
        System.out.println("Enter row of arraay :");
        int r2 = sc.nextInt();
        System.out.println("enter column of arary");
        int c2 = sc.nextInt();

        int arr2[][] = new int[r2][c2];

        System.out.println("Enter element of 2nd matrix : ");

        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                arr2[i][j] =sc.nextInt();
            }
        }

        System.out.println("First matrix : ");
        printAreay(arr);

        System.out.println("Second matrix : ");
        printAreay(arr2);        

        System.out.println("Sum of 2 matrix : ");
        add(arr, r1, c1, arr2, r2, c2);
    }
}
