import java.util.*;

/*Input a number and print all the factors of that number (use loops). */

public class Q2 {
    public static void main(String[] args){
        Scanner kbrd = new Scanner(System.in);
        int Num=kbrd.nextInt();
        int i=1;

        while(i <= Num/2){
            if(Num%i==0){
                System.out.println(i);
            }
            i++;
        }



    }
    
}