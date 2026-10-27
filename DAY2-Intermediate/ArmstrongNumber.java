import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner kbrd = new Scanner(System.in);

            int userinput= kbrd.nextInt();
            int num = userinput;
            int temp = num;
            int count = 0;
            int result=0;

            while(temp!=0){
                temp=temp/10;
                count ++;
            }
            //System.out.println(count);
            while(num!=0){
                int digit = num%10;
                int ex=1;
            
                for(int i=0;i<count;i++){
                    ex=ex*digit;
                }
                result=result+ex;
                num=num/10;
            }
            System.out.println(result);

        if(userinput==result){
            System.out.println("it is an armstrong num");
        }else
            System.out.println("not an armstrong number");

    }
    
}
