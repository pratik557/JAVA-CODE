import java.util.*;

class Stack {
    int arr[] = new int[10];
    int top = -1;

    void Empty() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("It is not empty");
        }
    }

    void push(int data) {
        if (top == 10) {
            System.out.println("Overflow");
        } else {
            top = top + 1;
            arr[top] = data;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return 0;
        } else {
            int x;
            x = arr[top];
            top = top - 1;
            return x;
        }
    }

    int TOP() {
        return arr[top];
    }

    void display() {
        int ret;
        ret = pop();
        System.out.println(ret);
    }
}

class Main {
    public static void main(String args[]) {
        Stack st = new Stack();
        Scanner myobj = new Scanner(System.in);
        int ch, data, chek = 0;
        int k = 1;

        while (k == 1) {
            System.out.println("Enter your choice\n1.Push\n2.Pop\n3.Display\n4.exit");
            ch = myobj.nextInt();
            switch (ch) {
            case 1: {
                System.out.println("enter your data");
                data = myobj.nextInt();
                st.push(data);
                break;
            }
            case 2: {
                st.pop();
                break;
            }
            case 3: {
                st.display();
                break;
            }
            case 4: {
                k = 2;
            }
            default: {
                System.out.println("Invalid choice exit");
                break;
            }
            }
        }
    }
}