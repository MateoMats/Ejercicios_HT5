package bSegundoEjercicio_Operaciones;
import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        
        int sum, mul;
          
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese dos digitos los cuales se sumaran: ");
        System.out.println("Ingrese el primer digito: ");
        int var1 = scanner.nextInt();
        System.out.println("Ingrese el segundo digito: ");
        int var2 = scanner.nextInt();
        
        System.out.println("Ingrese dos digitos los cuales se multiplicaran: ");
        System.out.println("Ingrese el tercer digito: ");
        int var3 = scanner.nextInt();
        System.out.println("Ingrese el cuarto digito: ");
        int var4 = scanner.nextInt();
        
        sum = var1 + var2;
        mul = var3 * var4;
        
        System.out.println("El total de los dos primeros digitos es: "+sum);
        System.out.println("El resultado de los ultimos dos digitos es: "+mul);  
    }
}