package aPrimerEjercicio_SimulacionLogin;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "Mateo"; 
        String password = "maxmax"; 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de usuario: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Ingrese la contrasena: ");
        String inputPassword = scanner.nextLine();
        
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Inicio de sesion ha sido comenzado correctamente");
        } else {
            System.out.println("Error inicio de sesion");
        }
    }
}
