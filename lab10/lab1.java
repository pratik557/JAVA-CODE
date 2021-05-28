/*Q1. Write a program to create user defined exceptions
called HrsException, MinException and SecException. Create a class Time which contains data members
hours, minutes, seconds and throw the user defined
exceptions if hours (>24 & <0),minutes(>60 &<0),seconds(>60 & <0).*/

import java.util.*;

public class lab1 {
    public static void Time(int hours, int mins, int secs) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException();
        } else if (mins < 0 || mins > 60) {
            throw new MinException();
        } else if (secs < 0 || secs > 60) {
            throw new SecException();
        }
        System.out.println("The valid time is: " + hours + " hrs " + mins + " mins " + secs + " secs ");
    }

    public static void main(String[] args) {
        System.out.println("Enter the hours, minute and seconds:");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        try {
            Time(hour, minute, second);
        } catch (HrsException e) {
            System.out.println(e.getMessage());
        } catch (MinException e) {
            System.out.println(e.getString());
        } catch (SecException e) {
            System.out.println(e.toString());
        }
    }
}

class HrsException extends Exception {
    public String getMessage() {
        return "Invalid Hours!!";
    }

}

class MinException extends Exception {
    public String getString() {
        return "Invalid minutes!!";
    }
}

class SecException extends Exception {
    public String toString() {
        return "Invalid Seconds!!";
    }
}