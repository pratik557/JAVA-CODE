class Plate{
    int length,width;

    Plate(int l,int w){//constructor
        length=l;
        width=w;
        System.out.println("The area of the plate is "+l*w);
    }
}

class Box extends Plate{
    int height;
    Box(int l, int w, int h){
        super(l, w);//during constructor overloading we need to use super to acccess the data from the base class
        height=h;
        System.out.println("The area of the box is "+l*w*h);
     }
}

public class lab6 {
    public static void main(String[] args){
       //Plate e1=new Plate(2,4);
       Box e1=new Box(2,4,3);
    }
    
}//During constructor the inherited constructed get called automatically when we use super keyword.
