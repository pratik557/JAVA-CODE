import java.util.*;

public class program1 {
    public static void main(String[] args) {
        int n;
        int temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array= \n");
        n = sc.nextInt();

        int num[] = new int[n];
        System.out.println("Enter array elements= \n");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order= \n");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
}