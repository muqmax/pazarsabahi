import java.util.Scanner;
public class deneme5 {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int note = scan.nextInt();
        if(note>70)
        {
            System.out.println("Dersten geçtin");
        }
        else if(note>65)
        {
            System.out.println("dersten kaldınız");

        }
        else {
            System.out.println("sıctınız");
        }
    }
}