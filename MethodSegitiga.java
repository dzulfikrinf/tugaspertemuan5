package tugaspertemuan5;
import java.util.Scanner;

public class MethodSegitiga {
    static void ceksegitiga(int a, int b, int c){
        if (a <= b && b <= c) {
            if (a * a + b * b == c * c) {
                System.out.println("Segitiga siku-siku.");
            } else if (a * a + b * b < c * c) {
                System.out.println("Segitiga tumpul.");
            } else {
                System.out.println("Segitiga lancip.");
            }              
        } else {
            System.out.println("Input salah, silakan coba lagi.");
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi a: ");
        int a = input.nextInt();
        System.out.print("Masukkan panjang sisi b: ");
        int b = input.nextInt();
        System.out.print("Masukkan panjang sisi c: ");
        int c = input.nextInt();
        
        ceksegitiga(a, b, c);
    }
}
