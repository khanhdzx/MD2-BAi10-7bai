package Bai4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackSoDu = new Stack<>();
        System.out.println("Nhập số thập phân cần chuyển : ");
        int x = scanner.nextInt();
        while (x>0 ){
            int soDu = x% 2;
            stackSoDu.push(soDu);
            x/=2;
        }
        System.out.println("Số nhị phân cần chuyển là : ");
        while (!(stackSoDu.isEmpty())){
            int n = stackSoDu.size();
            for (int i = 0; i <n ; i++) {
                System.out.print(stackSoDu.pop());
            }
        }
    }
}
