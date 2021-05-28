//Interface-->>It is a group of method which must to declare in the implemented class.
// we need to declare interface class by using keyword interface.
interface Bicycle{  

     void Speed(int fast);
     void Break(int stop);
}
class Avoncycle implements Bicycle{
    public void Speed(int fast){
        System.out.println("speeding up");
    }
    public void Break(int stop){
        System.out.println("pulling break");
    }
}
public class interface_question {
    public static void main(String[] args) {
        Ayoncycle obj=new Ayoncycle();
        obj.Speed(1);
        obj.Break(1);
    }
}
