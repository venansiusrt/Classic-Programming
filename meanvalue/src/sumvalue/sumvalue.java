package sumvalue;

import java.util.Scanner;
public class sumvalue {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        long a,b;
        long jumlah=0;
        
        do
        {
            System.out.print("Input a number, end this by input 0 : ");
            a = input.nextLong();
            jumlah=jumlah+a;
        }
        while (a!=0);
        System.out.println("Sum of your Input : "+jumlah);
    }
    
}
