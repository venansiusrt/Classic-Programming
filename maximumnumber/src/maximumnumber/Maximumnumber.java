package maximumnumber;

import java.util.Scanner;
public class Maximumnumber {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int temp, number;
    System.out.print("Input : ");
    number=input.nextInt();
    temp=number;
    
    while (number!=-9999)
    {
        if (number>temp)
        {
            temp=number;
            System.out.print("Input : ");
            number=input.nextInt();
        }
        else
        {
            System.out.print("Input : ");
            number=input.nextInt();
        }
    }    
       
    System.out.println("\nInput terbesar Anda adalah "+temp);
    }
    
}
