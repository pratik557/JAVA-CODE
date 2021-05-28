import java.util.*;

public class prg23 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        Scanner sc = new Scanner(System.in);
        int n, i, j, temp;
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter array value");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n ; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println("Array value after sorted " + arr[i]);
        }
    }
}