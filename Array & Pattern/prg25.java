import java.util.*;

public class prg25 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        Scanner sc = new Scanner(System.in);
        int n,temp,i;
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter array value");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n ; i=i+2) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
        for (i = 0; i < n; i++) {
            System.out.println("after swap of half variable"+arr[i]);
        }
    }
}