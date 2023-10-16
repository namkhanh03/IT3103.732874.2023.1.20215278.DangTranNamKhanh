import java.util.Scanner;

public class SortAndCalculateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int temp;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int sum = 0;
        System.out.println("After sorting: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println("");
        System.out.println("Sum of array = " + sum);
        System.out.println("Average value of array = " + (sum / n));
    }
}
