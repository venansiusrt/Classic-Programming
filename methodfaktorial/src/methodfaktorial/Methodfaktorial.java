package methodfaktorial;
import java.util.Scanner;
public class Methodfaktorial {
    public static void main(String[] args) {
        Scanner label= new Scanner (System.in);
        int a = label.nextInt();
        System.out.println(faktorial(a));
    }
    
    public static int faktorial (int bil){
        int i;
        if (bil==0||bil==1) return 1;
        else if (bil>1) return (bil*faktorial(bil-1));
        return 0;
    }   
}
