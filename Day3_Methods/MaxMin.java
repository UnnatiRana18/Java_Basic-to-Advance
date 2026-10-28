import java.util.*;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


public class MaxMin {

    public void Max(int a, int b , int c ){
        if(a>b && a>c){
            System.out.println("greater is:"+a);
        }else if(b>a && b>c){
            System.out.println("Greatest is :"+b);
        }else
            System.out.println("Greatest is "+c);
    }

    public void Min(int a, int b,int c ){
        if(a<b && a<c){
            System.out.println("lowest is"+a);
        }else if(b<a && b<c){
            System.out.println("lowest is"+b);
        }else{
            System.out.println("lowest is"+c);
        }
    }

    public  void main(String[] args){
        Scanner kbrd= new Scanner(System.in);

        int num1 = kbrd.nextInt();
        int num2= kbrd.nextInt();
        int num3 = kbrd.nextInt();

        Max(num1,num2,num3);
        Min(num1,num3,num3);


    }
    
}
