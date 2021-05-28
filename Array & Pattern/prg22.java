//check the frequecy of the number or check how many times the number is repeated.
import java.util.*;
public class prg22 {
    public static void main(String[] args)
    {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int i,val,count=0;
        System.out.println("Enter array value");
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the data for frequency");
        val=sc.nextInt();
        for (i=0;i<5;i++)
        {
            if (val==arr[i])
            {
               count++;
            }
        }
        System.out.println(+val+" has frequency "+count);
    }
}