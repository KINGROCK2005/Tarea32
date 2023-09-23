import java.util.Scanner;

public class CajaRosquilla{

    public static void main(String []args){

        int galletas, cajasNecesarias = 1, cajas = 24,contenedoresNecesarios, contenedores = 75;
        Scanner lector = new Scanner(System.in);
        int cajasSobrantes, intentos = 3 ;
        

        while (intentos > 0) {
            System.out.print("Ingrese el número de galletas total: ");
            galletas = lector.nextInt();

            if (galletas <= 0) {
                System.out.println("Ingreso de valor inválido. Intentos restantes: " + (--intentos));
                if (intentos == 0) {
                    System.out.println("Se han agotado los intentos. Saliendo del programa.");
                    break;
                }
            } else {

        cajasNecesarias = galletas / cajas;
        contenedoresNecesarios = (  cajasNecesarias/ contenedores) + 1;

        System.out.println("La cantidad necesaria de cajas es: " + cajasNecesarias);
        System.out.println("la cantidad necesaria de contenedores es: " + contenedoresNecesarios);
        
        int galletasSobrante = galletas % cajas;
        
        if(galletasSobrante <= 16){          
        cajasSobrantes = cajasNecesarias + 1 - (cajasNecesarias);
        }else{
            cajasSobrantes = 0;
        }
        System.out.println("Las galletas sobrantes fueron: " + galletasSobrante);
        System.out.println("Las cajas sobrantes fueron: " + cajasSobrantes);
        
    }

        }lector.close();
    }
}
