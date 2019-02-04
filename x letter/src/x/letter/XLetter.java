package x.letter;
import java.util.Scanner;
public class XLetter {
    public static void main(String[] args) {
    Scanner letter= new Scanner (System.in);
        System.out.print("Input : ");
        int x = letter.nextInt();
    
    for (int i=0; i<=x; i++)
    {
        for (int c=1; c<=i; c++)
        {
            System.out.print(" ");
        }        
        for (int d=1; d<=x; d++)
        {
            System.out.print("*");
        }
        for (int e=x; e>i; e--)
        {
            System.out.print(" ");
        }
        for (int f=x; f>i; f--)
        {
            System.out.print(" ");
        }
        for (int g=1; g<=x; g++)
        {
            System.out.print("*");
        }    
        System.out.println("");
    }
    for (int i=1; i<=x; i++)
    {
        for (int c=x; c>=i+1; c--)
        {
            System.out.print(" ");
        }        
        for (int d=1; d<=x; d++)
        {
            System.out.print("*");
        }
        for (int e=1; e<=i; e++)
        {
            System.out.print(" ");
        }
        for (int f=1; f<=i; f++)
        {
            System.out.print(" ");
        }
        for (int g=1; g<=x; g++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
}