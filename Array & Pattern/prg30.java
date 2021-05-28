public class prg30{
    public static void main(String[] args) {
       int i,j;
       for(i=1;i<=5;i++)
       {
       for(j=1;j<=i;j++)
       {
           if(i+j >=5)
           System.out.println(j);
           else
           System.out.println(" ");
       }
       System.out.println("\n");
       }
    }
}