package array5;
import java.util.Scanner;
public class Array5 {
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner (System.in);
        System.out.print("Input ukuran Array : ");
        int ukuran=in.nextInt();
        int[] data1;
        data1= array1(ukuran); //data1 menampung array dari method array1
        bacaarray(data1);
    }
    
    public static int[] array1(int ukuran){
        
        int [] kapling = new int [ukuran];
        Scanner input= new Scanner (System.in);
        
        for (int i=0; i<ukuran; i++){
            System.out.print("Masukkan elemen ke "+i+" : ");
            kapling[i]=input.nextInt();
        }
        
        return kapling;
    }
    
    public static void bacaarray(int[] arrayku){
        for (int j=0; j<arrayku.length; j++){
        System.out.println(arrayku[j]);
        }
    }
}