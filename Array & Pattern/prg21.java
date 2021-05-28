//check whether the number is present or not.
import java.util.*;
public class prg21 {
    public static void main(String[] args)
    {
        int arr[]=new int[100];
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        System.out.println("Enter the size of an array");
        n=sc.nextInt();
        System.out.println("Enter array value");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value you want to check");
        int num;
        num=sc.nextInt(); 
        for(i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                count++;
                break;
            }
        }
        if (count==0)
        System.out.println("not found");
        else
        System.out.println("Found");
    }
}
