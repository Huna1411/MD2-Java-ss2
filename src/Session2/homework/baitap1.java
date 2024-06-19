package Session2.homework;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + "Chia hết cho cả 3 và 5");
        }else {
            System.out.println(number + "Không chia hết cho 3 và 5");
        }
    }
}
