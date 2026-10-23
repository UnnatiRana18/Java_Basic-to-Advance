/*Subtract the Product and Sum of Digits of an Integer */
import java.util.*;
public class Q1{
    public static void main(String[] args){
        Scanner kbrd = new Scanner(System.in);

        int Integer =kbrd.nextInt();

        int product=1;
        int sum=0;

        while(Integer>0){
            int Digit = Integer%10;

            product=product*Digit;
            sum=sum+Digit;

            Integer /=10;
            

        }
        int results = product-sum;
        System.out.print(results);

    }
}