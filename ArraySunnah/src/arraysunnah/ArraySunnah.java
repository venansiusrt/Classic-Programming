package arraysunnah;
import java.util.Scanner;
public class ArraySunnah {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input baris array 1: ");
        int baris= scan.nextInt();
        System.out.print("Input kolom array 1: ");
        int kolom= scan.nextInt();
        
        System.out.print("Input baris array 2: ");
        int baris2= scan.nextInt();
        System.out.print("Input kolom array 2: ");
        int kolom2= scan.nextInt();
        
        int[][] net= matrix(baris,kolom);
        int[][] net2= matrix(baris2,kolom2);
        
        output(net);
        System.out.println("");
        output(net2);
        System.out.println("");
       
        if ((net.length==net2.length)&&(net[0].length==net2[0].length))
            output(sum(net,net2));
        else 
            System.out.print("Tidak bisa dijumlahkan");
            
        System.out.println("");
        
        if ((net.length==net2.length)&&(net[0].length==net2[0].length))
            output(substract(net,net2));
        else 
            System.out.print("Tidak bisa dikurangkan");
        
        System.out.println("");
        
        if (net[0].length==net2.length)
            output(multiply(net,net2));
        else 
            System.out.print("Tidak bisa dikalikan");
    }
    
    public static int[][] sum (int[][] array1, int[][] array2){
        int[][] jumlah= new int[array1.length][array1[0].length];
            for (int i=0; i<array1.length; i++){
                for (int j=0; j<array1[i].length; j++){
                    jumlah[i][j]=array1[i][j]+array2[i][j];
                }
            }
        
        return jumlah;
    }
    
    public static int[][] substract (int[][] array1, int[][] array2){
        int[][] selisih= new int[array1.length][array1[0].length];
        for (int i=0; i<array1.length; i++){
            for (int j=0; j<array1[i].length; j++){
                selisih[i][j]=array1[i][j]-array2[i][j];
            }
        }
        return selisih;
    }
    
    public static int[][] multiply (int[][] array1, int[][] array2){
        int[][] perkalian= new int[array1.length][array2[0].length];
        for (int i=0; i<array1.length; i++){
            for (int j=0; j<array2[0].length; j++){
                for (int k=0; k<array2.length; k++){
                    perkalian [i][j]=perkalian[i][j]+(array1[i][k]*array2[k][j]);
                }
            }    
        }
        return perkalian;
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