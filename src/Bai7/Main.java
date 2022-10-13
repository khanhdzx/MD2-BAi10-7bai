package Bai7;

import java.util.Queue;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Queue<NhanSu> Nam = new LinkedList<>();
        Queue<NhanSu> NU = new LinkedList<>();
        List<NhanSu> nhanSus = new ArrayList<>();
        nhanSus.add(new NhanSu("khánh", "Nam", 2003));
        nhanSus.add(new NhanSu("tuấn", "Nam", 1995));
        nhanSus.add(new NhanSu("thoa", "Nữ", 1999));
        nhanSus.add(new NhanSu("mai", "Nữ", 2004));
        nhanSus.add(new NhanSu("tuyến", "Nam", 1992));
        for (NhanSu s :
                nhanSus) {
            if (s.getGenDer() == "Nữ") {
                NU.add(s);
            }
            if (s.getGenDer() == "Nam") {
                Nam.add(s);
            }

        }
        System.out.println(Nam);
        System.out.println(NU);
    }
}
