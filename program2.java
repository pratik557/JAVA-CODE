public class program2 {	
    static int i=0;
       public program2()
       {
           this.i++;
       }
       public static void main(String args[])
       {
           program2 p1=new program2();
           program2 p2=new program2();
           program2 p3=new program2();
           program2 p4=new program2();
           program2 p5=new program2();
           System.out.println("No of times the object is made is "+ i);
       }
}
//the number of the times object is made