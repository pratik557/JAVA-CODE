import java.util.Scanner;

public class prg19{
    public static void main(String[] args)
    {
        int sub1,sub2,sub3,sub4,sub5,total,avg;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of the particular subjects");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
        sub3=sc.nextInt();
        sub4=sc.nextInt();
        sub5=sc.nextInt();
        total=sub1+sub2+sub3+sub4+sub5;
        avg=total/5;
        System.out.println("The average marks of the subject is grade D "+avg);
    }
}