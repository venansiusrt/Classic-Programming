package printprime;
import java.util.Scanner;
public class Printprime {
    public static void main(String[] args) {
        Scanner label= new Scanner (System.in);
        System.out.print("Input parameter : ");
        int parameter=label.nextInt();
        int prime=2;
        int i=1;
        while (prime<parameter){
            while(prime%i!=0){
            i++;
            }
        
            if (prime%i==0 && prime==i)
                System.out.println(prime+" ");
        
        prime++;    
        }
    }
    
}
