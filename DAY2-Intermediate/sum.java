
/* Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
*/
import java.util.*;
public class sum {
    public static void main(String[] args){
        Scanner kbrd = new Scanner(System.in);

        int NegSum=0;
        int EvenSum=0;
        int OddSum=0;

        while(true){
            int input =kbrd.nextInt();

            if(input==0){
                break;
            }

            if(input<0){
                NegSum+=input;
            }
            else if(input%2==0){
                EvenSum+=input;
            }
            else{
                OddSum+=input;
            }
        }

        System.out.println("SUM OF NEGATIVE NUM"+NegSum);
        System.out.println("SUM OF EVEN POSITIVE NUMS"+EvenSum);
        System.out.println("Sum of ODD POSITIVE NUM"+OddSum);



    }
    
}
