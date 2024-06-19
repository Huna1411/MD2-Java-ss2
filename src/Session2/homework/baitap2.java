package Session2.homework;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số từ 0-9");
        int number=Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 0:
                System.out.println("số 0");
                break;
            case 1:
                System.out.println("số 1");
                break;
            case 2:
                System.out.println("số 2");
                break;
            case 3:
                System.out.println("số 3");
                break;
            case 4:
                System.out.println("số 4");
                break;
            case 5:
                System.out.println("số 5");
                break;
            case 6:
                System.out.println("số 6");
                break;
            case 7:
                System.out.println("số 7");
                break;
            case 8:
                System.out.println("số 8");
                break;
            default:
                System.out.println("số 9");
        }
    }
}
