import java.util.*;

public class rectagle {
    
    public static void main(String[] args){
        float length,breadth,Area;
        System.out.println("Enter the value of the length and breadth");
        Scanner sc=new Scanner(System.in);
        length=sc.nextFloat();
        breadth=sc.nextFloat();
        Area=length*breadth;
        System.out.println("The area of the Rectangle is = "+Area);
    }
}
