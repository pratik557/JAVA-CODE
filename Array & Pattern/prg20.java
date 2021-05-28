//declaring and inserting values in an array.
import java.util.*;
public class prg20
{
    public static void main(String[] args)
    {
        int arr[]=new int[100];
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        System.out.println("Enter the value in the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.println("The entered value are " +arr[i]);
        }
    }
}