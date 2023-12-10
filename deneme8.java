import java.util.Scanner;
public class deneme8
{

    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();
        int faktoriyel = 1;

        while (sayi >= 1)
        {
            faktoriyel = faktoriyel * sayi;
            System.out.println("Faktoriyel" + faktoriyel + "Sayı" + sayi);
            sayi--;

        }
        System.out.println("Faktöriyel" + faktoriyel);
    }
}