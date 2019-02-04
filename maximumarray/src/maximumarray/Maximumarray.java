package maximumarray;
import java.util.Scanner;

public class Maximumarray {
    
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.print("Baris : ");
        int baris= in.nextInt();
        System.out.print("Kolom : ");
        int kolom= in.nextInt();
        int[][] matriks= baca(baris,kolom);
        System.out.println("");
        tulis(matriks);
        System.out.println("");
        maxbaris(matriks);
    }
    
    public static int[][] baca(int row, int column){
        int [][] p= new int [row][column];
        Scanner scan= new Scanner (System.in);
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print("Masukkan elemen baris "+(i+1)+" kolom "+(j+1)+" : ");
                p[i][j]=scan.nextInt();
            }
        }
        System.out.println("");
        return p;
    }
    
    public static void maxbaris(int[][] array){
    int terbesar=0;
        int temp;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length-1; j++){    
            if (array[i][j]>=array[i][j+1])
                    temp=array[i][j];
                else
                    temp=array[i][j+1];
                
                if (i==0)
                    terbesar=temp;
                else {
                        if (temp>terbesar)
                            terbesar=temp;    
                     }
            }
        System.out.println("Elemen terbesar pada baris "+(i+1)+" = "+terbesar);
        terbesar=0;
        }
    }
    
    public static void tulis (int[][] net){
        for (int i=0; i<net.length; i++){
            for (int j=0; j<net[0].length; j++){
                System.out.print(net[i][j]+" ");
            }
        System.out.println("");
        }
    }
    
    
}
