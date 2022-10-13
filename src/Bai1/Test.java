package Bai1;
import java.util.Scanner;
import java.util.Stack;

public class  Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<>();
        System.out.println("Nhập vào chuỗi");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i)+" ");
        }
        System.out.println("Chuỗi đảo ngược");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(stackChuoi.pop()+"");
        }
    }


}
