import java.util.*;

public class Sum {
    static int Sum_N(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    
    public static void main(String[] args){
        Scanner kbrd = new Scanner(System.in);

        System.out.println("eneter number");

        int num=kbrd.nextInt();
        System.out.println(Sum_N(num));
    }
}
