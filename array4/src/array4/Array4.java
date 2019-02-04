package array4;
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.print("Banyak data yang diinputkan : ");
        int nData=input.nextInt();
        int[] dataku= new int [nData];
        
        for (int i=0; i<dataku.length;i++){
            System.out.print("Masukkan data ke "+i+": ");
            dataku[i] =input.nextInt();
        }
        System.out.println("");
        for (int i=0; i<dataku.length;i++){
        System.out.println("Isi data ke "+i+": "+dataku[i]);
        }
        
        System.out.println("");
        int jumlah=0;
        for (int i=0; i<dataku.length;i++){
        jumlah+=dataku[i];
        }
        
        double rata2=(double)jumlah/dataku.length;
        System.out.println("Jumlah bilangan dalam array adalah "+jumlah);
        System.out.println("Rataan bilangan dalam array adalah "+rata2);
        
        int jumbil=0;
        for (int i=1; i<dataku.length; i++){
            if (dataku[i]>rata2)
            jumbil++;
        }
        System.out.println("Banyak bilangan diatas rata-rata : "+jumbil);
    }   
}