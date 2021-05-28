import java.util.*;

class Number{
    public void swap(){
        int i,n;
        int arr[]=new int [10];
        for (i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1])//if array of a[0]>a[1] 
                {
                    //then swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }

public class lab7 {
    public static void main(String[] args){
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
        a[i]=sc.nextInt();
        Number item=new Number();
        item.swap();
        }
        }
    }}

