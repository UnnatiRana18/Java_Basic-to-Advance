import java.util.*;

public class LCM{
    public static void main(String[] args){
        Scanner kbrd =new Scanner(System.in);

        int num1= kbrd.nextInt();
        int num2=kbrd.nextInt();

        int divisor=2;
        int lcm=1;

        while(num1>1 || num2>1){
            if(num1%divisor==0  || num2 % divisor ==0){
                lcm =lcm*divisor;

                if(num1%divisor==0){
                    num1=num1/divisor;
                }
                 if(num2%divisor==0){
                    num2=num2/divisor;
                }
            }else
                divisor++;
        }
        System.out.println("LCM="+lcm);
    }

}