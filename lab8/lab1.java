/*1. Illustrate the usage of abstract class with following Java classes –
i>An abstract class „student‟ with data member roll no, reg no and a
abstract method course()
ii>A subclass „kiitian‟ with course() method implementation*/


abstract class Student{
    int roll_no,reg_no;

    Student(int roll,int reg){
        roll_no=roll;
        reg_no=reg;
    }
    abstract  void course();//-->>here,we only initilize the abstract method and further we use this method in derived class 
}
class kittian extends Student{
        kittian(int roll,int reg){
        super(roll,reg);//-->Don't get confuse Pratik.The super keyword can only be called by contructor not by method.
    }
    public void course(){
    System.out.println("The student roll number is " +roll_no);//-->>we have to take the same data member of the abstract class Student.
    System.out.println("The student registration number is " +reg_no);
    }
}

public class lab1 {
    public static void main(String[] args){
        kittian obj=new kittian(1905936,1000152);
        //kittian(214,456353); <<-->>WE CAN'T CALL CONSTRUCTOR BY GIVING ARGUMENTS ON IT. OTHERWISE,IT WILL SHOW YOU ERROR. 
        obj.course();

    }
}
