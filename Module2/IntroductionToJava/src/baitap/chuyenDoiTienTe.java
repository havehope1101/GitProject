package baitap;

import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("nhap vao so tien USD ");
        int tien = scanner.nextInt();
        System.out.println("quy doi ra VND la: " + tien*rate + "VND");
    }
}
