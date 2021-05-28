/*Write a program to perform following operations on user entered strings –
i) Change the case of the string
ii) Reverse the string
iii) Compare two strings
iv) Insert one string into another string*/
 
 
 class lab2 {
    public static void main(String[] args) {
        //CASE1-->>UPPER CASE TO LOWER CASE-->>
        String s1="FIX THE CAUSE,NOT THE STMPTOM";
        String case1=s1.toLowerCase();
        System.out.println(case1);

        //CASE2-->>LOWER CASE TO UPPER CASE-->>
        String s2="Fix the cause, not the symptom";
        String case2=s2.toUpperCase();
        System.out.println(case2);

        //COMPARE TWO STRING-->>
        String name1="Pratik";  
        String name2="Pratik";  
        String name3=new String("Pratik");  
        System.out.println(name1==name2); 
        System.out.println(name1==name3);  


        //REVERSE THE STRING-->>
        StringBuffer s3=new StringBuffer("atpuG kitarP");  
        s3.reverse();  
        System.out.println(s3);  
         
        //INSERT ONE STRING INTO ANOTHER STRING-->>   
        StringBuffer s4=new StringBuffer("Pratik ");  
        s4.insert(7,"Gupta");  
        System.out.println(s4);  
    }
}