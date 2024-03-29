import java.util.Scanner;

public class arrayIO{
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
        System.out.println("Enter row of aarraay :");
        int r = sc.nextInt();
        System.out.println("enter column of arary");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter element of array : ");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] =sc.nextInt();
            }
        }

        System.out.println("2D Array : ");
        printAreay(arr);
    }
}