package triangle;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner name=new Scanner (System.in);
        int tri=name.nextInt();
        tri=2*tri;
        int tro=(tri/2);   
        for (int i=1; i<=tri; i++)
        {
            for (int k=tri-2; k>=i; k--)
            {
                k--;
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
            i++;
        }
        for (int f=1; f<tro; f++)
        {
            for(int g=1; g<=f; g++)
            {
                System.out.print(" ");
            }
            for (int h=tro; h>f;h--)
            {
                System.out.print("*");
            }
            for (int k=tro-1; k>f; k--)
            {
                System.out.print("*");
            }    
        System.out.println("");
        }
    }
}
