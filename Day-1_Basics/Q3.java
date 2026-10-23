
/*Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop) */
import java.util.*;
public class Q3 {
    public static void main(String[] args){
        Scanner kbrd = new Scanner(System.in);
        
        int sum =0;
        while(true){
            int userinput = kbrd.nextInt();

            if(userinput==0){
                break;
            }
            sum +=userinput ;
        }
        System.out.println("sum:"+sum);
        kbrd.close();
    }
}