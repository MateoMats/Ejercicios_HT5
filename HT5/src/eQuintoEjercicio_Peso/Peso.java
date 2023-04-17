package eQuintoEjercicio_Peso;
import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int entre9y10 = 0;
        int mas10 = 0;
        int menos9 = 0;
        int total = 0;
        double peso;
        
        do {
            System.out.print("Ingrese el peso de la pieza (0 para terminar): ");
            peso = scanner.nextDouble();
            if (peso > 0) {
                total++;
                if (peso >= 9.8 && peso <= 10.2) {
                    entre9y10++;
                } else if (peso > 10.2) {
                    mas10++;
                } else {
                    menos9++;
                }
            }
        } while (peso != 0);
        
        System.out.println("Cantidad de piezas con peso entre 9.8 Kg. y 10.2 Kg.: " + entre9y10);
        System.out.println("Cantidad de piezas con peso mayor a 10.2 Kg.: " + mas10);
        System.out.println("Cantidad de piezas con peso menor a 9.8 Kg.: " + menos9);
        System.out.println("Total de piezas procesadas: " + total);
    }
}
