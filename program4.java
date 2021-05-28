import java.util.Scanner;

class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3, sumLeft = 0, sumRight = 0, i, j;
        int arr[][] = new int[n][n];
        System.out.println("Enter the values of 3x3 matrix:");
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
    
        sumLeft = arr[0][0] + arr[1][1] + arr[2][2];
        sumRight = arr[0][2] + arr[1][1] + arr[2][0];

        System.out.println("Sum of left diagonal: " + sumLeft);
        System.out.println("Sum of right diagonal: " + sumRight);
    }
}