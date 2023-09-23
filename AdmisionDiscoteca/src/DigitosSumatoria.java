import java.util.Scanner;

public class DigitosSumatoria {

    public static void main(String []args){

        Scanner lector= new Scanner(System.in);
        int numero, suma = 0, intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese los digitos: ");
            numero = lector.nextInt();

            if (numero <= 0) {
                System.out.println("Ingreso de valor inválido. Intentos restantes: " + (--intentos));
                if (intentos == 0) {
                    System.out.println("Se han agotado los intentos. Saliendo del programa.");
                    break;
                }
            } else {
                 while (numero > 0) {
                int digito = numero % 10;
                System.out.print(digito + " ");
                numero = numero / 10;
                suma += digito;

             }System.out.println("Su resultado es: " + suma); 
            }
        }lector.close();
    }       
}

