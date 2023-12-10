import java.util.Scanner;
public class deneme11 {
    public static void main(String[] args){
        while(true){
            Scanner scan=new Scanner(System.in);
            String s;
            System.out.println("karakter gir moruk");
            s =scan.nextLine();
            if(s.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            System.out.println("Karakteri"+s);
        }
    }
}
