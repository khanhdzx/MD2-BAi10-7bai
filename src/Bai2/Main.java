package Bai2;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> treemap = new TreeMap<>();
        System.out.println("Trước khi thêm phần tử : "+treemap);
        treemap.put("aaa",1);
        treemap.put("bbb",2);
        treemap.put("ccc",3);
        System.out.println("sau khi thêm phần tử : "+treemap);
        treemap.put("ddd",0);
        System.out.println("sau khi put tại vị trí 1 : "+treemap);
        treemap.put("aaa",0);
        System.out.println("sau khi put vào phần tử aaa có cùng key : "+treemap);
    }
}
