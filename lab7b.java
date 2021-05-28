import java.util.*;
class Plate{
    int length,width;
    public Plate(int length,int width)
    {
        this.length=length;
        this.width=width;
        System.out.println("Area is:"+(length*width));
    }
}
class Box extends Plate{
    int height;
    public Box(int length,int widht,int height)
    {
        super(length, widht);
        this.height=height;
        System.out.println("Volume is:"+(length*width*height));
    }
}
class WoodBox extends Box{
    int thick;
    public WoodBox(int length,int widht,int height,int thick)
    {
        super(length, widht, height);
        this.thick=thick;
        System.out.println("Volume of Woodbox is:"+(length*widht*height*thick));
    }
}


public class lab7b {
    public static void main(String [] args)
    {
        WoodBox obj2=new WoodBox(5, 6, 7, 8);
    }
}