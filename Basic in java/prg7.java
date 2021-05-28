import java.util.Scanner;

public class prg7 {
    public static void main(String[] args)
    {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a;
        a=value.nextInt();
        int div=a%10;
        System.out.println("The third digit is:"+div);
        a=a/10;
        div=a%10;
        System.out.println("The second digit is:"+div);
        a=a/10;
        div=a%10;
        System.out.println("The first digit is:"+div);

    }
    
}
