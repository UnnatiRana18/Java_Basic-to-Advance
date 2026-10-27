import java.util.*;

public class Factorial{
    public static void main(String[] args){
        Scanner kbrd = new Scanner(System.in);

        int num=kbrd.nextInt();
        int fact=1;

        for(int i =num;i>1;i--){
            fact=fact*i;
        }
        System.out.println("factorial:"+fact);


    }
}