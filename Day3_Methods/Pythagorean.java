import java.util.*;

public class Pythagorean {
    static int power(int num,int exp){
        int result= 1;
        for(int i=0;i<exp;i++){
            result=result*num;
        }
        return result;
    }
    static void pythagoras(int a , int b, int c){
        if(a>b && a>c){
            int sum= power(b,2)+power(c,2);
            if(power(a,2)==sum){
                System.out.println("yes, pythagoras");
            } else
            System.out.println("not a pythagorean triplet");
            
        }else if(b>a && b>c){
            int sum =power(a,2)+power(c,2);
            if(power(b,2)==sum){
                System.out.println("yes,pythagoras");
            } else
            System.out.println("not a pythagorean triplet");
            
        }else{
            int sum = power(a,2)+power(b,2);
            if(power(c,2)==sum){
                System.out.println("yes pythagoras");
            } else
            System.out.println("not a pythagorean triplet");
        }
       
        

    }

    public static void main(String[] args){
        Scanner kbrd = new Scanner(System.in);

        System.out.println("enter the side");
        int num1=kbrd.nextInt();

        System.out.println("enter the side");
        int num2=kbrd.nextInt();

        System.out.println("enter the side");
        int num3=kbrd.nextInt();

        pythagoras(num1,num2,num3);

    }
    
}
