package deret.bilangan;

import java.util.Scanner;
public class DeretBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("n      : ");
        int n = input.nextInt();
        
        int i=0;
        int jumlah = 0;
        
        while (n>i) 
        {
            i++;
            jumlah=jumlah+i;
        }
        
        System.out.println("Jumlah "+n+" bilangan asli pertama adalah "+jumlah);
    }
    
}
