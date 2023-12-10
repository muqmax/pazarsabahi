import java.util.Scanner;
public class deneme7 {

    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        int bakiye=100;
        int islem;

        System.out.println("1: Bakiye Görüntüleme");
        System.out.println("2.Para Yatırma");
        System.out.println("3.Para Çekme");
        System.out.println("4.Sistemden Çıkış");
    islem=scan.nextInt();

    switch(islem){
        case 1:
            System.out.println("Bakiyemiz:"+bakiye+"tldir.");
            break;
        case 2:
            System.out.println("Ne kadar yatıracaksınız?");
            int miktar=scan.nextInt();
            bakiye+= miktar;
            System.out.println("Bakiyemiz"+bakiye+"tl dir");
            break;
        case 3:
            System.out.println("Nekadar  Çekeceksiniz");
             miktar=scan.nextInt();
            bakiye-=miktar;
            System.out.println("Bakiyeniz"+bakiye+"tldir.");
            break;
        case 4:
            System.out.println("sistemden çıkılabilir");
            break;
        default:
            System.out.println("Geçersiz İşlem");
            break;




    }

    }
}