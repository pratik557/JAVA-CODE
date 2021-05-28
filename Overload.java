 class Sub {
    int data;
    void subtract(int a, int b)
    {
        System.out.println(+a+ " subtract " +b +" is "+(a-b));
    }
    void subtract(int a)
    {
        int b=9;
        System.out.println(+a+" subtract "+b +" is "+(a-b));
    }
    void subtract(double a, double b)
    {
        System.out.println(+a+" subtract "+b +" is "+(a-b));
    }
}
class Overload
{
    public static void main(String[] args)
    {
        int n1=Integer.parseInt(args[0]),n2=Integer.parseInt(args[1]);
        double n3=Double.parseDouble(args[2]),n4=Double.parseDouble(args[3]);
        Sub obj1 = new Sub();
        obj1.subtract(n1,n2);
        obj1.subtract(n1);
        obj1.subtract(n3,n4);
    }
}
