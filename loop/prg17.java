import java.util.*;

public class prg17 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,num;
        System.out.println("Enter the Number");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
        if(num % i==0)
        System.out.println("The factor of the number is "+i);
        }
    }
}
