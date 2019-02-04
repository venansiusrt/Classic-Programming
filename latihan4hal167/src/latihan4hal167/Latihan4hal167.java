package latihan4hal167;
import java.util.Scanner;
public class Latihan4hal167 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int input=in.nextInt();
        
        int plus=0, neg=0; 
        int sumplus=0, sumneg=0;
        
        while (input==0)
        {
            System.out.println("Ulangi Inputan");
            System.out.print("Enter an integer, the input ends if it is 0: ");
            input=in.nextInt();
        }
        
        while(input!=0)
        {
            if (input>0)
            {
                plus++;
                sumplus=sumplus+input;
                input=in.nextInt(); 
            }
            else
            {
                neg++;
                sumneg=sumneg+input;
                input=in.nextInt();
            }
        }
    
        double ave=((double)sumplus+(double)sumneg)/((double)plus+(double)neg);
        System.out.println("The number of positives is "+plus);
        System.out.println("The number of negatives is "+neg);
        System.out.println("The total is "+(sumplus+sumneg));
        System.out.println("The average is "+ave);
    }   
}