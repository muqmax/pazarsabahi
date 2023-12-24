package muqmax.src;

import java.io.*;
import java.util.Scanner;

public class mama {
    public static void main(String[] args) throws FileNotFoundException {
        char[][] map = new char[10][10];
        File file = new File("/Users/tugberkersoz/Documents/harita.txt");
        Scanner scanner = new Scanner(file);

        // Haritayı oku
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (scanner.hasNextInt()) {
                    map[i][j] = (char) (scanner.nextInt() + '0'); // ASCII dönüşümü
                }
            }
        }
        scanner.close();

        // Kullanıcıdan koordinatları al
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Koordinatları girin (örneğin: 4 5):");
            int row = userInput.nextInt();
            int col = userInput.nextInt();

            // Kontrol et ve değiştir
            floodFill(map, row, col);

            // Güncellenmiş haritayı yazdır
            printMap(map);
        }
    }

    public static void floodFill(char[][] map, int row, int col) {
        // Haritanın sınırlarını kontrol et
        if (row < 0 || row >= 10 || col < 0 || col >= 10) {
            return;
        }

        // Diğer koordinatlardaki 0 rakamlarını orijinal sayılara dönüştür
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (map[i][j] == '0') {
                    map[i][j] = (char) ('0' + (int) map[i][j]);
                }
            }
        }

        // Sadece seçilen koordinatı 'x' yap
        map[row][col] = 'x';
    }

    public static void printMap(char[][] map) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
