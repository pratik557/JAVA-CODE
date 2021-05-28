/*Write a program in Java to define a class Rectangle having data member:
length and breadth; to calculate the area and perimeter of the rectangle. Use
member functions to read, calculate and display.*/

class Rectangle{
    int length,breadth;
    public void Input(int l,int b){
        length=l;
        breadth=b;
    }
    public void Display(){
        double Area=length * breadth;
        System.out.println("THE AREA OF THE RECTANGLE IS "+Area);
    }
}
public class lab4 {
    public static void main(String[] args){
    Rectangle val=new Rectangle();
    val.Input(4,6);
    val.Display();   
    }
}
