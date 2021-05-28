/*Q3. Write a java program to create Account with 500
rupee minimum balance, deposit amount, withdraw
amount and also throws LessBalanceException which
returns the statement that says withdraw amount is
not valid.*/

import java.util.*;

class LessBalanceException extends Exception {
    public String toString() {
        return "Withdraw Amount is invalid!!";
    }
}

public class lab3 {
    public static void Account(int deposite, int withdraw) throws LessBalanceException {
        int min = 500;
        if (withdraw > min) {
            throw new LessBalanceException();
        }
        System.out.println("Remaining Balance is: " + (min - withdraw));
        System.out.println("Total Balance is: " + (min - withdraw + deposite));
    }

    public static void main(String[] args) {
        System.out.println("Enter the amount to be withdrawn and deposited: ");
        Scanner sc = new Scanner(System.in);
        int with = sc.nextInt();
        int dep = sc.nextInt();
        try {
            Account(dep, with);
        } catch (LessBalanceException e) {
            System.out.println(e.toString());
        }
    }
}