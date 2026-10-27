import java.util.*;
public class PermuatComb{
    public static void main(String[] args){
        Scanner kbrd=new Scanner (System.in);

        System.out.println("enter the totol number of items");
            int n=kbrd.nextInt();

        System.out.println("enter the number of arrangements");
        int r = kbrd.nextInt();

        int nfact=1;
        int rfact=1;
        int nrFact=1;

        for(int i=n;i>1;i--){
            nfact=nfact*i;
        }

        for(int i=r;i>1;i--){
            rfact=rfact*i;
        }
        for(int i =n-r;i>1;i--){
            nrFact=nrFact*i;
        }

        int permutation = nfact / nrFact;
        int Combination = nfact/(rfact*nrFact);
        System.out.println("Permutation="+permutation + "\nCombination="+ Combination);


        
    }
    
}
