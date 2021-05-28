class Change{
    int a;
    int b;
    public void input(int x,int y){
        a=x;
        b=y;
    }
    public void display(){
        System.out.println("Before swap a =" +a+ "and b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap a =" +a+ "and b= "+b);
    }

}

public class swap {
    public static void main(String[] args){
        Change s=new Change();
        s.input(2, 7);
        s.display();

    }
}
