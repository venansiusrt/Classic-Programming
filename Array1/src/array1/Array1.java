package array1;
public class Array1 {
    public static void main(String[] args) {
    int [] value=new int[5];
    for(int i=1; i<5;i++){
        value[i]=i+value[i-1];
        System.out.println(value[i]);
    }
    
    value[0]=value[1]+value[4];
    System.out.println(value[0]);
    
    int sum=0;
    for (int j=0; j<value.length; j++){
        sum+= value[j];
    }
    double mean= (double) sum/value.length;
    System.out.println("Mean "+mean);
    System.out.println("Many numbers :"+value.length);
    //<tipe data>[]<nama array>=new<spasi><tipe data>[banyak isi].
    //[] : 1 dimensi, [][] : 2 dimensi.
    //index array dimulai dari 0. Jika banyak isi array 10, maka artinya index mulai dari 0-9.
    }
}
