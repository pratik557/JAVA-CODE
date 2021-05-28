class Plastic2D{
    int l,b;
    Plastic2D(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    void display()
    {
        double cost=(l*b)*40;
        System.out.println("The cost of 2D sheets is:"+cost);
    }
}
class Plastic3D extends Plastic2D{
    int h;
    Plastic3D(int l,int b,int h)
    {
        super(l,b);
        this.h=h;
    }
    void display()
    {
        double cost1=(l*b*h)*60;
        System.out.println("The cost of 3D plastic is:"+cost1);
    }
}
public class lab7a {
    public static void main(String [] args)
    {
        int l,b,h;
        System.out.println("Enter three sides:");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        Plastic2D obj1=new Plastic2D(l, b);
        obj1.display();
        Plastic3D obj2=new Plastic3D(l, b, h);
        obj2.display();
    }
}