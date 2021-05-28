import java.util.*;

public class prg2
{
    public static void main(String[] args)
    {
        int s1, s2, s3, area, S;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Three Sides of a Triangle");
        s1 = a.nextInt();
        s2 = a.nextInt();
        s3 = a.nextInt();
        S = (s1 + s2 + s3) / 2;
        int area1 = (S * (S - s1) * (S - s2) * (S - s3));
        area = (int) Math.sqrt(area1);

        System.out.println("The Area of triangle =" + area);
    }
}