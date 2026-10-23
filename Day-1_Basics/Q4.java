 /*Take integer inputs till the user enters 0 and print the largest number from all. */
import java.util.*;
public class Q4 {
    public static void main(String[] args){
        Scanner kbrd = new Scanner(System.in);
        int max = 1;
        
        while(true){
            int userinput = kbrd.nextInt();
            
            if(userinput>max){
                max=userinput;
            }
             if(userinput==0){
                break;
            }
            
        }
        System.out.println("largest:"+max);
        kbrd.close();
    }
} 
