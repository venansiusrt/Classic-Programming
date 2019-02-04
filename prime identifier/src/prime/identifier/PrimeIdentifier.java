package prime.identifier;
import java.util.Scanner;
public class PrimeIdentifier {
    public static void main(String[] args) {
    Scanner prime= new Scanner (System.in);
    System.out.print("Input a number : ");
    int bil = prime.nextInt();
    
    int i=1;
    
    if (bil<=i)
        System.out.println(bil+" bukan bilangan prima");
    else 
    {
        do
        {
            i++;
        }
        while(bil%i!=0);
        
        if (bil%i==0 && bil==i)
        {
            System.out.println(bil+" adalah bilangan prima");
        }
        else
        {
            System.out.println(bil+" bukan bilangan prima");
        }
    }
}
}