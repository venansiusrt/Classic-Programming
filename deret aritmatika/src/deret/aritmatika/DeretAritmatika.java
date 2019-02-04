package deret.aritmatika;

import java.util.Scanner;
public class DeretAritmatika {
    public static void main(String[] args) {
        Scanner label=new Scanner(System.in);
        System.out.print("Input First Term : ");
        int suku1=label.nextInt();
        System.out.print("Input Difference of the Series : ");
        double beda=label.nextInt();
        System.out.print("Input Many Terms : ");
        double un=label.nextInt();
        
        double jumlah=0;
        int i;
        double mean;
        
        System.out.print("Your term is ");
        for (i=1; i<=un; i++){
            jumlah=jumlah+suku1;
            System.out.print(suku1+" ");
            suku1=(int)(suku1+beda);
        }
        
        mean=jumlah/un;
        System.out.println("\nMean value is "+(mean));
    }
    
}
