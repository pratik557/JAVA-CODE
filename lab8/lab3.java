/*Define an interface with three methods – earnings(), deductions() and bonus()
and define a Java class „Manager‟ which uses this interface without
implementing bonus() method. Also define another Java class „Substaff‟ which
extends from „Manager‟ class and implements bonus() method. Write the
complete program to find out earnings, deduction and bonus of a sbstaff with
basic salary amount entered by the user as per the following guidelines –
earnings basic + DA (80% of basic) + HRA (15% of basic)
deduction PF 12% of basic 
bonus 50% of basic*/

import java.util.*;
interface Company{
    void earnings(double basic);
    void deductions(double basic);
    void bonus(double basic);
}
abstract class Manager implements Company{
    double basic,DA,HRA;
    public void earnings(double basic){
        this.basic=basic;
        DA=0.80*basic;
        HRA=0.15*basic;
        double Salary=basic+DA+HRA;
        System.out.println("The total earning salary of the Manager is "+Salary);
    }
    public void deductions(double basic){
        this.basic=basic;
        double PF=0.12*basic;
        System.out.println("The total deductions salary of the Manager is "+PF);
    }
}

class Substaff extends Manager{
    public void bonus(double basic){
        this.basic=basic;
        double total_bonus=0.50*basic;
    System.out.println("The total deductions salary of the Manager is "+total_bonus);
        
    }
} 

public class lab3 {
    public static void main(String[] args) {
        System.out.println("Enter the basic Salary of the employee is");
        Scanner sc=new Scanner(System.in);
        double basic;
        basic=sc.nextDouble();
        Substaff obj=new Substaff();
        obj.earnings(basic);
        obj.deductions(basic);
        obj.bonus(basic);
    }
}
