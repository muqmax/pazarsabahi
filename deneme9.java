import java.util.Scanner;
public class deneme9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int toplam=0;

        do{
            toplam += sayi % 10;
            sayi=sayi/10;
            System.out.println("Toplam ="+ toplam +"Sayı"+sayi);


        }
        while (sayi >0);
        System.out.println("Toplan"+toplam);

    }
}