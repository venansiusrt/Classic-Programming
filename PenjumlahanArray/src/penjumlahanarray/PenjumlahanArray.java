package penjumlahanarray;
import java.util.Scanner;
public class PenjumlahanArray {
    public static void main(String[] args) {
        Scanner baca = new Scanner (System.in);
        System.out.print("Banyak Baris : ");
        int baris= baca.nextInt();
        System.out.print("Banyak Kolom : ");
        int kolom= baca.nextInt();
        
        System.out.println("===================");
        int[][] array1= inputArray(baris, kolom);
        System.out.println("===================");
        int[][] array2= inputArray(baris, kolom);
        System.out.println("===================");
        
        outputArray(array1); 
        System.out.println("");
        outputArray(array2); 
        System.out.println("===================");
        
        int[][]jumlah =jumlah(array1,array2);
        System.out.println("Hasil Penjumlahan Array diatas adalah : ");
        outputArray(jumlah);
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
    
    public static int[][] jumlah (int[][] array1, int[][] array2){
        int[][] total= new int [array1.length][array1[0].length];
        for (int i=0; i< array1.length; i++){
            for (int j=0; j< array1[0].length; j++){
                total[i][j]=array1[i][j]+array2[i][j];
            }
        }
        return total;
    }
}