class subtract{
    public void input(int a){
        int b=12;
        System.out.println("THE SINGLE VALUE AFTER SUBTRACTION "+(a-b));
    }
    public void input(int a,int b){
        System.out.println("THE DOUBLE VALUE AFTER SUBTRACTION "+(a-b));
    }
    public void input(int a,int b,int c){
        System.out.println("THE TRIPLE VALUE AFTER SUBTRACTION "+(a-b));
    }
}
public class lab2 {
    public static void main(String[] args){
    subtract digit=new subtract();
    digit.input(20);
    digit.input(20,17);
    digit.input(30,17,3);
}   
}
