package Session2.homework;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số đầu trong Chuỗi ");
        int start=sc.nextInt();
        System.out.println("Nhập số cuối trong Chuỗi");
        int end=sc.nextInt();
        int sum=0;
        for(int i=start; i<=end; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum + " Là tổng giá trị các số chẵn từ"+ start + "đến "+ end);
    }
}
