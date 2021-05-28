import java.util.*;
class Shape{
    double area;
    public void showArea()
    {
        System.out.println("Areas are shown below!!!!");
    }
}
class Circle extends Shape{
    double r;
    public Circle(double r)
    {
        this.r=r;
    }
    public void calc()
    {
        area=3.14*r*r;
    }
    public void display()
    {
        System.out.println("The area of circle is: "+area);
    }
}
class Rectangle extends Shape{
    int l,b;
    public Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void calc()
    {
        area=l*b;
    }
    public void display()
    {
        System.out.println("The area of Rectangle is: "+area);
    }
}

public class lab7d {
    public static void main(String [] args)
    {
        int l,b;
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=sc.nextDouble();
        System.out.println("Enter the length and breadth:");
        l=sc.nextInt();
        b=sc.nextInt();
        Shape obj2=new Shape();
        obj2.showArea();
        Circle obj=new Circle(r);
        obj.calc();
        obj.display();
        Rectangle obj1=new Rectangle(l, b);
        obj1.calc();
        obj1.display();
    }
}