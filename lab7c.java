import java.util.*;
class Account{
    int acc_no;
    double balance;
    public Account(int acc_no,double balance)
    {
        this.acc_no=acc_no;
        this.balance=balance;
    }
    void display()
    {
        System.out.println("Account number is:"+acc_no+"\n"+"Total Balance is:"+balance);

    }
}
class Person extends Account{
    String name;
    int aadhar_no;
    public Person(int acc_no,double balance,String name,int aadhar_no)
    {
        super(acc_no, balance);
        this.name=name;
        this.aadhar_no=aadhar_no;
    }
    void display()
    {
        System.out.println("Account number is: "+acc_no+"\n"+"Total Balance is:"+balance+"\n"+"Name is: "+name+"\n"+"Aadhar number is:"+aadhar_no);
    }
}
public class lab7c {
 public static void main(String [] args)
 {
     int acc_no,aadhar_no;
     double balance;
     String name;
     System.out.println("Enter the details:");
    Scanner sc=new Scanner(System.in);
    Person a[]=new Person[5];
    for(int i=0;i<5;i++)
    {   
        acc_no=sc.nextInt();
        aadhar_no=sc.nextInt();
        balance=sc.nextDouble();
        name=sc.next();
        a[i]=new Person(acc_no, balance, name, aadhar_no);
    }
    for(int i=0;i<5;i++)
    {   
        System.out.println("Details of Account Holder"+i);
        a[i].display();
    }
 }   
}