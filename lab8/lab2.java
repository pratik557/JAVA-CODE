/*Define an interface Motor with a data member –capacity and two methods
such as run() and consume(). Define a Java class „Washing machine‟ which
implements this interface and write the code to check the value of the interface
data member thru an object of the class.*/


interface Motor{
    int capacity=5;
    public void run();
    public void consume();
}
class Washing_machine implements Motor{
    public void run(){
        System.out.println("This is Washing machine run method");
    }
    public void consume(){
        System.out.println("This is Washing machine consume method");
    }

}
public class lab2{
    public static void main(String[] args) {
       Washing_machine obj=new Washing_machine();
       obj.run();
       obj.consume();
       System.out.println("The value of the data member having capacity is "+obj.capacity);
     
    }
}