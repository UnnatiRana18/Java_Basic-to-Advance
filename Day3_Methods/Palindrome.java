import java.util.*;
//Write a function to find if a number is a palindrome or not. Take number as parameter.

public class Palindrome {
    static void palindrome(int n){
        int a=0;
        int num=n;
        while(num>0){
            int digit=num%10;
            a=digit+a*10;
            num=num/10;
        }
        if(a==n){
            System.out.println("this is a palindrome");
        }else
            System.out.println("this is not a palindrome");
    }
    public void main(String[] args){
        Scanner kbrd = new Scanner(System.in);
        int num=kbrd.nextInt();

        palindrome(num);
    }
    
}
