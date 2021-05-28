import java.util.*;

interface TwoDMeasurement{
    void getting_area(double radius);
    void getting_perimeter(double radius);
}
abstract class Circle implements TwoDMeasurement{
    double radius;
    public void getting_area(double radius){
        this.radius=radius;
        double Area=3.14*radius;
        System.out.println("the area of the circle is "+Area);
    }
    public void getting_perimeter(double radius){
        this.radius=radius;
        double perimeter=(2*3.14*radius);
        System.out.println("the perimeter of the circle is "+perimeter);
    }
}
class Point implements Circle{
    int x1,x2,y1,y2;
    public void measure_distance(int x1, int x2 , int y1, int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        double distance= (x2-x1)+(y2-y1);
        System.out.println("the distance of the circle is "+distance);
    }
}

public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter inputs ");
        Scanner sc=new Scanner(System.in);
        double radius;
        radius=sc.nextDouble();
        Point obj=new Point();
        obj.getting_area(radius);
        obj.getting_perimeter(radius);
        obj.measure_distance(2, 4, 6, 3);
    }
}
