// import java.util.Scanner;

// public class Prueba{

//     public static void main(String[] args) {

//         int galletas, cajasNecesarias = 1, cajas = 24, contenedoresNecesarios, contenedores = 75;
//         Scanner lector = new Scanner(System.in);
//         int cajasSobrantes;
//         int intentos = 3;

//         while (intentos > 0) {
//             System.out.print("Ingrese el número de galletas total: ");
//             galletas = lector.nextInt();

//             if (galletas <= 0) {
//                 System.out.println("Ingreso de valor inválido. Intentos restantes: " + (--intentos));
//                 if (intentos == 0) {
//                     System.out.println("Se han agotado los intentos. Saliendo del programa.");
//                     break;
//                 }
//             } else {
//                 cajasNecesarias = galletas / cajas;
//                 contenedoresNecesarios = (cajasNecesarias / contenedores) + 1;

//                 System.out.println("La cantidad necesaria de cajas es: " + cajasNecesarias);
//                 System.out.println("La cantidad necesaria de contenedores es: " + contenedoresNecesarios);

//                 int galletasSobrante = galletas % cajas;

//                 if (galletasSobrante <= 16) {
//                     cajasSobrantes = cajasNecesarias + 1 - (cajasNecesarias);
//                 } else {
//                     cajasSobrantes = 0;
//                 }
//                 System.out.println("Las galletas sobrantes fueron: " + galletasSobrante);
//                 System.out.println("Las cajas sobrantes fueron: " + cajasSobrantes);

//                 break; // Sal del bucle si la entrada es válida
//             }
//         }

//         lector.close();
//     }
// }

// import java.util.Scanner;

// public class Prueba {

//     public static void main(String []args){

//         Scanner lector= new Scanner(System.in);
//         int numero, suma = 0, intentos = 3;
//         while (intentos > 0) {
//             System.out.print("Ingrese los digitos: ");
//             numero = lector.nextInt();

//             if (numero <= 0) {
//                 System.out.println("Ingreso de valor inválido. Intentos restantes: " + (--intentos));
//                 if (intentos == 0) {
//                     System.out.println("Se han agotado los intentos. Saliendo del programa.");
//                     break;
//                 }
//             } else {

//         // System.out.println("Ingrese los digitos: ");
//         // numero = lector.nextInt();
        
//              while (numero > 0) {
//                 int digito = numero % 10;
//                 System.out.print(digito + " ");
//                 numero = numero / 10;
//                  suma += digito;

//                  }System.out.println("Su resultado es: " + suma); 
//             }
//         }lector.close();
//     }
           
// }

