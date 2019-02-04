package sumdigits;
import java.util.Scanner;
public class Sumdigits {

       
    public static int sumDigits(long n){
        double a=1;
        int sam=0;
        while (n/(int)Math.pow(10,a)!=0){
            a++;
        }
        for (double i=1;i<=a;i++){
            int angka = ((int)n%10);
            n=n/10;
            sam += angka;
        }
        return sam;
    }
        
    public static void main(String[] args) {
    Scanner mput=new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int builangan=mput.nextInt();
        
        System.out.println("Jumlah dari semua digit angka tersebut adalah : "+sumDigits(builangan));
    }
    
}
