import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] map = new int[10][10];
        File file = new File("/Users/tugberkersoz/Documents/harita.txt");
        Scanner scanner = new Scanner(file);

        // Haritayı oku
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (scanner.hasNextInt()) {
                    map[i][j] = scanner.nextInt();
                }
            }
        }
        scanner.close();

        // Kullanıcıdan koordinatları al
        Scanner userInput = new Scanner(System.in);
        System.out.println("Koordinatları girin (örneğin: 4 5):");
        int row = userInput.nextInt();
        int col = userInput.nextInt();

        // Kontrol et ve değiştir
        checkAndReplace(map, row, col, map[row][col]);

        // Güncellenmiş haritayı yazdır
        printMap(map);
    }

    public static void checkAndReplace(int[][] map, int row, int col, int num) {
        if (row < 0 || row >= 10 || col < 0 || col >= 10 || map[row][col] != num) {
            return;
        }

        map[row][col] = 'X'; // X karakteri ASCII'de 88'dir

        // 4 yönlü kontrol
        checkAndReplace(map, row - 1, col, num); // Yukarı
        checkAndReplace(map, row, col + 1, num); // Sağ
        checkAndReplace(map, row + 1, col, num); // Aşağı
        checkAndReplace(map, row, col - 1, num); // Sol
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
