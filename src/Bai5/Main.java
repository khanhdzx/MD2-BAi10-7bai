package Bai5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi để kiểm tra :");
        Scanner scanner = new Scanner(System.in);
        String stringSc = scanner.nextLine();
        Stack stack = new Stack<>();
        for (int i = 0; i < stringSc.length(); i++) {
            stack.push(stringSc.charAt(i));
        }
      String testString = "";
        while (!stack.isEmpty()){
            testString = testString + stack.pop();
        }
        if (stringSc.equals(testString)){
            System.out.println("Là chuỗi đối xứng ");
        }
        else {
            System.out.println("Không là chuỗi đối xứng ");
        }
    }
}
