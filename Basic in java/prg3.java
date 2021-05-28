import java.util.*;
public class prg3 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int base,power, result=1;
        System.out.println("Enter the base and power value");
        base = sc.nextInt();
        power =  sc.nextInt();
        for (int i = 1; i <= power; i++) 
        {
        result = result * base;
        }
        System.out.println("The power of the given number is="+result);
    }
}