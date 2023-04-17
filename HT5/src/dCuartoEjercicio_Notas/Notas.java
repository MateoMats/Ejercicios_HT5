package dCuartoEjercicio_Notas;
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
       double total1, total2, total3, Gtotal;
          
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la nota de su primer parcial: ");   
        int nota1 = scanner.nextInt();
        System.out.println("Ingrese la nota de su segundo parcial: : "); /* Parcial 1 y 2 equivalen al 20%*/
        int nota2 = scanner.nextInt();
        System.out.println("Ingrese la nota de su tercer parcial: "); /* Parcial 3 equivalen al 30%*/
        int nota3 = scanner.nextInt();
        System.out.println("Ingrese la nota de su cuarto parcial: "); /* Por ende el utlimo es 50%*/
        int nota4 = scanner.nextInt();
        
        total1 = ((nota1+nota2)/2)*0.20;
        total2 = nota3*0.30;
        total3= nota4*0.50;
        Gtotal = total1+total2+total3;
        
        if (Gtotal >=85&&Gtotal<=100){
            System.out.println("Su promedio es excelente, con un punteo de: "+Gtotal);
            
        }
        else if(Gtotal>=80&&Gtotal<=84){
        System.out.println("Su promedio es muy bueno, con un punteo de: "+Gtotal);
     }
        else if(Gtotal>=70&&Gtotal<=79){
        System.out.println("Su promedio es bueno, con un punteo de: "+Gtotal);    
        }
        else if(Gtotal>=60&&Gtotal<=69){
        System.out.println("Su promedio es regular, con un punteo de: "+Gtotal);    
        }
        else{
        System.out.println("Debe repetir el curso porque su promedio es: "+Gtotal); 
        }
   }
}
