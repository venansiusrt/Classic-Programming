package array7;
import java.util.Scanner;
public class Array7 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int [][] matrix= new int [4][3]; //4 menyatakan baris, 3 menyatakan kolom
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print("Masukkan bilangan pada baris ke "+(i+1)+" dan kolom ke "+(j+1)+" : ");
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.println("");
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
        System.out.println("");
        }
    }   
}
