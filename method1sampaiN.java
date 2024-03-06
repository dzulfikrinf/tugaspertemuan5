package tugaspertemuan5;
import java.util.Scanner;

public class method1sampaiN {
    public static void satuSampaiN(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i + 1);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan N : ");
        int n = input.nextInt();
        satuSampaiN(n);
    }
}
