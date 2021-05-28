import java.util.Scanner;

public class prg6 {
public static void main(String[] args)
{
    double amount,rate;
    int principal,time,n;
    System.out.println("Enter the value of principal,rate,time and n");
    Scanner sc=new Scanner(System.in);
    principal=sc.nextInt();
    rate=sc.nextDouble();
    time=sc.nextInt();
    n=sc.nextInt();
    amount=principal* Math.pow(1+ (rate/n),n*time);
    System.out.println("The total amount is " +amount+ " after " +time+ " year");
    double Cintrest=amount-principal;
    System.out.println("The total compound intrest is " +Cintrest+ " after " +time+ " years");
}
}