package factorof;
import java.util.Scanner;
public class FactorOf {
    public static void main(String[] args) {
        Scanner my = new Scanner (System.in);
        int[] arr = new int[100000000];
        System.out.print("Input : ");
        int inputnya = my.nextInt();
        System.out.println("--------------------------------------");
        int pembagiPositif=0, index=0;
        for (int i=1; i<=inputnya; i++){
            if (inputnya%i==0){
                pembagiPositif++;
                System.out.println(i);
                if(primeChecker(i)=="PRIME"){
                    arr[index]=i;
                    index++;
                }
            }
        }
        System.out.println("Pembagi Positif ada : "+pembagiPositif);
        System.out.println("--------------------------------------");
        for (int k=0; k<index; k++){
            System.out.println(arr[k]);
        }
        System.out.println("Faktor Prima ada : "+index);
        }
    public static String primeChecker(long i){
        String check = null;
        int counter = 1;
        if (i<=counter)
            check = "NON-PRIME";
        else 
        {
            do {
                counter++;
            } while(i%counter!=0);
        
            if (i==counter)
            {
                check = "PRIME";
            }
            else
            {
                check = "NON-PRIME";
            }
        }
        return check;
    }
}