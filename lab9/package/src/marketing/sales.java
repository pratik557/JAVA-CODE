package marketing;

import general.employee;

class Salesman extends employee{
    double TA;

    public void alloance() {
        employee obj1 = new employee();
        TA = 0.5 * (obj1.earning(2000, 125));
        System.out.println("Travelling alloance is:" + TA);
    }
}
public class sales {
    public static void main(String[] args) {
        Salesman obj2 = new Salesman();
        obj2.alloance();
    }
}