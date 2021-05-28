import java.util.Scanner;

class Triangle{
    public static void main(String[] args)
    {
        double a,b,c,s,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to find the area of the triangle");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2.0d;//.0d is used to print the last two digit after the point
        System.out.println("The half of the perimeter of the triangle is " +s);
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle using heron's formula is = " +area);
    }
}
