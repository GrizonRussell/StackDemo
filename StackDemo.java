import java.util.*;
import java.io.*;

public class StackDemo {

    public static void main(String args[]) {

        Stack<String> stack = new Stack<String>();

        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        System.out.println("Initial Stack: " + stack);

        System.out.println("The element at the top of the" + " stack is: " + stack.peek());

        System.out.println("Final Stack: " + stack);
    }
}