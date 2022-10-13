package Bai2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String input = scanner.nextLine();
        String[] list = input.toLowerCase().split(" ");

        for (int i = 0; i < list.length; i++) {
            if(treeMap.containsKey(list[i])){
                treeMap.put( list[i], (treeMap.get(list[i])+1) );
            }else {
                treeMap.put(list[i],1);
            }
        }
        System.out.println("Số lần xuất hiện của từ trong chuỗi : " + treeMap);
    }
}
