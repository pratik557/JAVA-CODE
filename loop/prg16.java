import java.util.Scanner;
public class prg16 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n,a=0,b=1,c;
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.println("The fabonacci series of the number are "+a);
            c=a+b;
            a=b;
            b=c;
        }
        
    }
    
}
