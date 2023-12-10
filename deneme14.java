import java.util.Scanner;
public class deneme14 {

        public static int ucilecarp ( int a){
            return a * 3;
        }
        public static int ikitopla ( int a){
            return a + 2;
        }
        public static int dortcıkart ( int a){
            return a - 4;
        }
        public static void main(String[]args) {
            System.out.println("sonuc   " + dortcıkart(ikitopla(ucilecarp(2))));
        }
        }

