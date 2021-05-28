import java.util.*;
class box{
    int x,y,z;
    public void input(int length,int width,int height)
    {
    x=length;
    y=width;
    z=height;
    }
    public void volume()
    {
        double vol= x*y*z;
        System.out.println("The volume of the box is = "+vol);
    }
}public class lab1{
    public static void main(String[] args)
    {
        int l,w,h;
        System.out.println("Enter the three sides of a box");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        w=sc.nextInt();
        h=sc.nextInt();
        box item=new box();
        item.input(l, w, h);
        item.volume();
    }
}