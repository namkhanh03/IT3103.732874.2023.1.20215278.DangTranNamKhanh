import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];
        int[][] arr3 = new int[a][b];

        System.out.println("The first matrix: ");
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("The second matrix: ");
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of two matrices: ");
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
                if (j == (b - 1)){
                    System.out.println("");
                }
            }
        }
    }
}
