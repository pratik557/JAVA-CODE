/*Write a program which will overload the area () method and display the area
of a circle, triangle and square as per user choice and user entered dimensions.*/


class Calculate{
    double radius,base,height;
    public void Input(int r){
        radius=r;
    }
    public void Input(int b,int h){
        base=b;
        height=h;
    } 
    public void Display(){
        double area=3.14*radius*radius;//circle
        System.out.println("THE AREA OF THE CIRCLE IS "+area);
        area= 0.5*(base * height);//triangle
        System.out.println("THE AREA OF THE TRIANGLE IS "+area);
    }
}
public class lab3 {
    public static void main(String[] args){
        Calculate obj=new Calculate();
        obj.Input(3);
        obj.Input(4, 6);
        obj.Display();
    }
}
