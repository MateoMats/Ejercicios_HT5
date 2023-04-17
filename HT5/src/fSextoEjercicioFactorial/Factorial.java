package fSextoEjercicioFactorial;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero para calcular su factorial: ");
        int dato = scanner.nextInt();
        int factorial = calcularFactorial(dato);
        System.out.println(dato + "! = " + factorial);
    }

    public static int calcularFactorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

