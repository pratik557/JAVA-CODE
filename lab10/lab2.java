/*Q2. Create an user defined exception named Check Argument to check the number of arguments passed 
through command line. If the number of arguments is less than four, throw the Check Argument
exception, else print the addition of squares of all the four elements.*/

import java.util.*;

class CheckArgument extends RuntimeException {
    public String toString() {
        return "Invalid Argument!!";
    }
}

public class lab2 {
    public static void main(String[] args) {
        int sum = 0, n, len;
        Scanner sc = new Scanner(System.in);
        String s1;
        s1 = sc.nextLine();
        len = s1.length();
        try {
            if (len < 4) {
                throw new CheckArgument();
            }
            for (int i = 0; i < len; i++) {
                n = s1.charAt(i);
                System.out.println("\n" + n);
                sum = sum + (n * n);
            }
            System.out.println("The sum is: " + sum);
        } catch (CheckArgument e) {
            System.out.println(e.toString());
        }
    }
}