package dollarchar;
import java.util.Scanner;
public class Dollarchar {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int banyak= input.nextInt();
    int array[]= new int[banyak];
    int isi;
    int index=0, i=0, max=0;
    do
    {
        isi=input.nextInt();
        array[i]=isi;
        i++;
    }
    while ((isi>0)&&(i<=array.length));
    
    for (int j=0; j<i-1; j++){
        if (j==0)
            max=array[j];
        else
            if(array[j]<=array[j+1])
            {max=array[j+1];
                index=j+1;}
            else
            {max=array[j];
                index=j;}
    }
        System.out.print(max+" "+index);
    }
}
