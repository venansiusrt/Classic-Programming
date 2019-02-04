package array.transpose;
import java.util.Scanner;
public class ArrayTranspose {
    public static void main(String[] args) {
        Scanner baca= new Scanner (System.in);
        System.out.print("Baris : ");
        int baris= baca.nextInt();
        System.out.print("Kolom : ");
        int kolom= baca.nextInt();
        int [][] kapling = matrix (baris, kolom);
        output(kapling);
        System.out.println("=================");
        output(transpose(kapling));
    }
    
    public static int[][] transpose(int [][] kapling){
    int[][] transpose= new int [kapling[0].length][kapling.length];
    for (int i=0; i<kapling[0].length; i++){
            for (int j=0; j<kapling.length; j++){
                transpose[i][j]=kapling[j][i];
            }
        }
    return transpose;
    }
    
    public static int[][] matrix(int row, int column){
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
    
    public static void output (int[][] net){
        for (int i=0; i<net.length; i++){
            for (int j=0; j<net[i].length; j++){
                System.out.print(net[i][j]+" ");
            }
        System.out.println("");
        }
    }
}
