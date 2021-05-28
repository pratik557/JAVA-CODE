/*Define two packages as – General and Marketing. In General package define a
class „employee‟ with data members as empid(protected), ename(private) and a
public method as earnings() which calculate total earnings as
earnings basic + DA (80% of basic) + HRA (15% of basic)
In Marketing package define a class „sales‟ which is extending from „employee‟
class and has a method tallowance() which calculates Travelling Allowance as
5% of total earning. Write the programs to find out total earning of a sales person
for the given basic salary amount and print along with the emp id.*/


package general;

import java.util.Scanner;

public class employee {
    protected int empid;
    private String name;
    public double basic, DA, HRA;

    public double earning(double basic, int empid) {
        this.basic = basic;
        this.empid = empid;
        DA = 0.8 * basic;
        HRA = 0.15 * basic;
        double earnings = basic + DA + HRA;
        System.out.println("The total earning is:" + earnings);
        System.out.println("Employee id is:" + empid);

        return earnings;
    }

    public static void main(String[] args) {

        System.out.println("Enter the basic salary and empid:");
        double basic;
        int empid;
        Scanner sc = new Scanner(System.in);
        basic = sc.nextDouble();
        empid = sc.nextInt();
        employee obj = new employee();
        obj.earning(basic, empid);
    }
}