import java.util.*;
class prg31{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        Scanner myobj=new Scanner(System.in);
        int i,j,temp;
        int done[]=new int[10];
        System.out.print("Enter array value");
        for (i=0;i<10;i++)
        {
           arr[i]=myobj.nextInt();
        }
        for (i=0;i<10;i++)
        {
            temp=1;
            if (done[i]==1)
            {
                continue;
            }
            
            for (j=i+1;j<10;j++)
            {
                if (arr[i]==arr[j])
                {
                    temp=temp+1;
                    done[j]=1;
                }
            }
            System.out.println(arr[i]+" has frequency "+temp+"\n");
        }
    }
}