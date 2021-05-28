import java.util.Scanner;

public class prg5 {
    public static void main(String[] args)
    {
        int a,b;
        System.out.println("Swapping without third variable");
        Scanner sc= new Scanner(System.in);
        System.out.println("Value before swapping");
        a= sc.nextInt();
        b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value after swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
        
    } 
}
