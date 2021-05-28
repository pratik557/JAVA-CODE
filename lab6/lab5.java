/*Write a program in java to input and display the details of n number of
students having roll, name and cgpa as data members. Also display the name
of the student having lowest cgpa.*/


import java.util.*;
class student{
    int roll,cgpa;
    String name;
    public void Input(int roll,int CGPA,String name){
        this.roll=roll;
        this.cgpa=cgpa;
        this.name=name;
    }
    public void display(){
        System.out.println("NAME IS "+name+"\nROLL IS "+roll+"\nCGPA "+cgpa);
    }
}
public class lab5 {
    public static void main(String[] args){
        System.out.println("Enter the number of the student ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        student arr[]=new student[n];
        String name;
        double cgpa;
        int roll;
        
            
        }
    }
}
