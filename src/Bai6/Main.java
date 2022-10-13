package Bai6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kiểm tra dấu ngoặc trong biểu thức :");
        Scanner scanner = new Scanner(System.in);
        String testString = scanner.nextLine();
        boolean answer = studentList(testString);
        if (answer){
            System.out.println("Đúng");
        }
        else {
            System.out.println("Sai");
        }
    }

    public static boolean studentList(String string) {
        Stack<Character> stack = new Stack<>();
        for (char bracket :
                string.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            }
            if (bracket == ')'){
                if (stack.isEmpty()){
                    stack.push(bracket);
                }
                if (stack.lastElement()=='('){
                    stack.pop();
                }
            }
            if (bracket == '}'){
                if (stack.isEmpty()){
                    stack.push(bracket);
                }
                if (stack.lastElement()=='{'){
                    stack.pop();
                }
            }
            if (bracket == ']'){
                if (stack.isEmpty()){
                    stack.push(bracket);
                }
                if (stack.lastElement()=='['){
                    stack.pop();
                }
            }
        }return stack.isEmpty();
    }
}
