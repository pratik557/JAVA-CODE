import java.util.Scanner;

public class prg4 {
    public static void main(String[] args)
    {
        int Roll; String Name,branch;
        System.out.println("Enter your bio data");
        Scanner sc= new Scanner(System.in);
        Name= sc.nextLine();
        branch= sc.nextLine();
        Roll= sc.nextInt();
        System.out.println("Filled bio-data are:");
        System.out.println("NAME:"+Name);
        System.out.println("branch:"+branch);
        System.out.println("Roll:"+Roll);
        
    } 
}
