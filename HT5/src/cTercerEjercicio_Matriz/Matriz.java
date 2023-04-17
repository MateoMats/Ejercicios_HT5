package cTercerEjercicio_Matriz;
import java.util.Random;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int m = scanner.nextInt();
        
        int[][] matriz = new int[n][m];
        
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(999) + 1;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
