package tugasPertemuan5;
import java.util.Scanner;

public class MethodKubus {
    public static boolean kubus(int[] sisi){
        for(int i = 1; i < sisi.length; i++){
            if(sisi[i] != sisi[0]){
                return false;
            }
        }
        return true; 
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] sisi = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.print("Masukkan Sisi ke-" + (i+1) + ": ");
            sisi[i] = input.nextInt();
        }
        
        boolean hasil = kubus(sisi);
        
        if(hasil) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
