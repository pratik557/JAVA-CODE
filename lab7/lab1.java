import java.util.*;

//base class-->
class Plastic_2D {
    int length, breadth;

    public void Box_2d(int l, int b) {
        length = l;
        breadth = b;
    }

    public void Display() {
        double cost = (length * breadth) * 40;
        System.out.println("The price of the 2D sheet is " + cost);
    }
}

// derived class-->
class Plastic_3D extends Plastic_2D {
    int height;

    public void Box_3d(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void Display1() {
        double cost1 = (length * breadth * height) * 60;
        System.out.println("The price of the 3D sheet is " + cost1);
    }
}

public class lab1 {
    public static void main(String[] args) {
        // for base-->
        Plastic_2D call = new Plastic_2D();
        call.Box_2d(5, 4);
        call.Display();

        // for derived-->
        Plastic_3D call_D = new Plastic_3D();
        call_D.Box_3d(5, 4, 4);
        call_D.Display1();
    }
}
