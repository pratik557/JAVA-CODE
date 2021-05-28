import java.util.Scanner;
public class prg8 {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    float radius;
    double pi= 3.14,Area;
    radius=sc.nextFloat();
    Area=pi*radius*radius;
    System.out.println("The Area of the circle is:"+Area);

}    
}
