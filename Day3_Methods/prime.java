import java.util.*;

public class prime {

    static void prime_num(int start,int end){
        for (int i = start; i <= end; i++) {

            int count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0 && i >= 2) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        Scanner kbrd= new Scanner(System.in);

        int num1=kbrd.nextInt();
        int num2=kbrd.nextInt();

        if(num1>num2){
            prime_num(num2, num1);
        }else
            prime_num(num1, num2);
    }
    
}
