import java.util.*;
public class prg14 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int i,n,fact=1;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of the given number is="+fact);
    }
    
}
