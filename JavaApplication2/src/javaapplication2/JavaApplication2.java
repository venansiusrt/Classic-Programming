package javaapplication2;

import java.util.Scanner;
public class JavaApplication2 {
    public static void main(String[] args) {
    
        Scanner x = new Scanner(System.in);
        System.out.print("Nama\t\t: "); // "\t" untuk memberi tab
        String nama =x.next();
        System.out.print("Usia\t\t: ");
        int usia= x.nextInt();
        System.out.print("Alamat\t\t: ");
        String alamat = x.next();
        
     
        System.out.println("\nNama Anda adalah   : "+nama);  // "\n" untuk memberi enter 1 baris
        System.out.println("Usia Anda adalah   : "+usia);
        System.out.println("Alamat Anda adalah : "+alamat);
    }
    
}
