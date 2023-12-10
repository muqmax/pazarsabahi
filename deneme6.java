import java.util.Scanner;
public class deneme6 {

    public static void main(String[]args){

        String kul_adı="tugberk";
        String pw="123";

        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanıcı Adı ");
        String syskul_adı=scan.nextLine();
        System.out.println("Parola:");
        String syspw=scan.nextLine();


        if(!(kul_adı.equals(syskul_adı))&&!(pw.equals(syspw))){
    System.out.println("Kullanıcı ve parola yanlış kardeşim düzgün gir lan");
        }
        else if((kul_adı.equals(syskul_adı))&&!(pw.equals(syspw))){
            System.out.println("parola yanlış kardeşim düzgün gir bak oglumm");
        }
        else if(!(kul_adı.equals(syskul_adı))&& (pw.equals(syspw))){
            System.out.println("Kullanıcı adı yanlış kardeşim düzgün gir lan");
        }
        else if((kul_adı.equals(syskul_adı))&& (pw.equals(syspw))){
            System.out.println("Kullanıcı adı Paralo Doğru");
        }
    }
}