package j.option.pane;
import javax.swing.JOptionPane;
public class jopstionpane {  
    public static void main(String[] args) {
    String a = JOptionPane.showInputDialog ("Masukkan nama anda : ",null);
    JOptionPane.showMessageDialog (null, "Nama anda adalah "+a);
    String x = JOptionPane.showInputDialog ("Masukkan nilai x : ",null);
    int b = Integer.parseInt(x);
    String y = JOptionPane.showInputDialog ("Masukkan nilai y : ",null);
    int c = Integer.parseInt(y);
    JOptionPane.showMessageDialog (null, "Jumlah nilai (x+y) adalah "+(b+c));
    }
}