import java.util.Scanner;

public class DisplayStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int q = 0;

        while (n <= 0){
            System.out.println("n must greater than 0. ");
            n = sc.nextInt();
        }

        for(int i = 1; i <= n; i++){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
