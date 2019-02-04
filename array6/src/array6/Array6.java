package array6;
import java.util.Scanner;
public class Array6 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int i=input.nextInt();
        int j=input.nextInt();
        int [][] matrix= new int [i][j];
        
        for (int baris=0;baris<i;baris++){
            for (int kolom=0; kolom<j; kolom++){
            matrix[baris][kolom]=input.nextInt();
            }
        }
        
        for (int baris=0;baris<i;baris++){
            for (int kolom=0; kolom<j; kolom++){
                System.out.print(matrix[baris][kolom]+" ");
            }
            System.out.println("");
        }
    }
}
