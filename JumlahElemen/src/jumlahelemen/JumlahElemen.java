package jumlahelemen;
import java.util.Scanner;
public class JumlahElemen {
    public static void main(String[] args) {
        Scanner baca = new Scanner (System.in);
        System.out.print("Banyak Baris : ");
        int baris= baca.nextInt();
        System.out.print("Banyak Kolom : ");
        int kolom= baca.nextInt();
        System.out.print("Parameter    : ");
        int bil= baca.nextInt();
        System.out.println("===================");
        int[][] array= inputArray(baris, kolom);
        System.out.println("===================");
        outputArray(array);
        System.out.println("Jumlah seluruh elemen array adalah "+jumlahElemen(array));
        System.out.println("Rata-rata dari jumlah elemen adalah "+ratarata(array));
        System.out.println("Terdapat "+banyakElemenKurangDari(array, bil)+" elemen dibawah parameter");
    }
    
    public static int[][] inputArray (int baris, int kolom){
        int[][] kapling= new int[baris][kolom];
        Scanner baca= new Scanner (System.in);
        for (int i=0; i< baris; i++){
            for (int j=0; j< kolom; j++){
                System.out.print("Baris "+(i+1)+" kolom "+(j+1)+" : ");
                kapling[i][j]=baca.nextInt();
            }
        }
        return kapling;
    }
    
    public static void outputArray (int[][] array){
        for (int i=0; i< array.length; i++){
            for (int j=0; j< array[0].length; j++){
                System.out.print(array[i][j]+" ");
            }
        System.out.println("");
        }
    }
    
    public static int jumlahElemen (int[][] array){
        int a=0;
        int[][] jumlahElemen= new int [array.length][array[0].length];
        for (int i=0; i<array.length; i++){
            for(int j=0; j< array[0].length; j++){
                a=a+array[i][j];
            }
        }
        return a;
    }
    
    public static double ratarata (int[][] array){
        int a=jumlahElemen(array);
        double b=(array.length)*(array[0].length);
        return (a/b);
    }
    
    public static int banyakElemenKurangDari(int[][] array, int bil){
        int a=0;
        for (int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if (array[i][j]<bil){
                    a++;
                }
            }
        }
        return a;
    }
}