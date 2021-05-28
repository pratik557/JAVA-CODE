class Shape{
    public void show(){
        System.out.println("I am base");
    }
}


class circle extends Shape{
    int radius;
    public void showarea(int radius){
        this.radius=radius;
        double area= 3.14*(radius*radius);
        System.out.println("THE AREA OF THE CIRCLE IS "+area);

    }
}


class rectangle extends Shape{
    int width,length;
    public void showarea(int width,int lenght){
        this.width=width;
        this.length=lenght;
        System.out.println("THE AREA OF THE RECTANGLE IS "+(length*width));
    }
}



public class lab4 {
    public static void main(String[] args){
        //base
        Shape e1=new Shape();
        e1.show();
        
        //derived from base
        circle e2=new circle();
        e2.showarea(3);

        //derived from base
        rectangle e3=new rectangle();
        e3.showarea(2,3);

        

    }
    
}
