import java.util.*;

public class prg24 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        Scanner sc = new Scanner(System.in);
        int n,temp,j=10, i;
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter array value");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n/2 ; i++) {
                    temp = arr[i];
                    arr[i] = arr[j - 1 - i];
                    arr[j - 1 -i] = temp;
                }
        for (i = 0; i < n; i++) {
            System.out.println("after swap of half variable"+arr[i]);
        }
    }
}