/*HCF Of Two Numbers Program */
import java.util.*;

public class HCF {
    public static void main(String[] args){
        Scanner kbrd = new Scanner (System.in);

        int num1 = kbrd.nextInt();
        int num2=kbrd.nextInt();


        if (num1 == 0 || num2 == 0){
            System.out.println("HCF=0");
        }
        else if(num1==num2){
            System.out.println("HCF="+num1);
        }
        else{
        int min = (num1 < num2) ? num1 : num2;
        int res=0;
        for(int i =1;i<min/2;i++){
            if(num1 % i == 0 && num2 % i == 0){
                 res=i;
            }

        }
         System.out.println("HCF="+res);
    }
   
    }
    
}
