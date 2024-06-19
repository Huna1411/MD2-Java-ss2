package Session2.homework;

public class baitap5 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if(Integer(i)){
                System.out.println(i + "Là số nguyên tố");
            }
        }
    }
    public static boolean Integer(int number){
        if (number == 2 || number == 3 ) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
