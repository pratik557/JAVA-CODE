import java.util.Scanner;

public class prg15 {//prime number = Number which having 2 factor.
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n,i,count=0;
    System.out.println("Enter the number");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        if(n % i == 0)
        count++;
    }
    if(count==2)//if count value have only two value of factor then its a prime number.
    System.out.println("The entered number is prime number");
    else
    System.out.println("Not a prime number");
}   
}
