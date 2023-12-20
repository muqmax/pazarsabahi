package pazarsabahi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class deneme16 {

    public static void main(String[] args) throws IOException {

        // Dosya yolunu ayarlayın
        // Dosya yolunu belirtin
        String dosyaYolu = "/Users/tugberkersoz/Documents/harita.txt";

        // Dosyayı açın
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Scanner scanner = new Scanner(fis);

        // Haritanın boyutunu al
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Haritayı bir dizi olarak oluştur
        int[][] map = new int[rows][cols];

        // Haritayı doldur
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        // Dosyayı kapat
        fis.close();

        // Haritayı ekrana bastırın
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
