import java.util.*;

public class RaizCuadratica{
    public static void main(String []args){

        double a, b, c ;
        Scanner lector =new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        a = lector.nextFloat();
        System.out.print("Ingrese el valor de b: ");
        b = lector.nextFloat();
        System.out.print("Ingrese el valor de c: ");
        c = lector.nextFloat();

        double discr = Math.pow(b , 2) - 4 *(a * c);
        double  x1, x2, xr, xi;

        if(discr == 0){
        x1 = (-b)/(2 * a);
        System.out.println("Su resultado es:");
        System.out.println("Solo tiene una raiz. " + 1);
        } else if(discr< 0){
            System.out.println("Su resultado es:");
            xr =  (- b) / (2 * a);
            xi =  (Math.sqrt(-discr) / (2 * a));
            System.out.println("Tiene 2 raices distintas. ");
            System.out.println("La raiz real es: " + xr);
            System.out.println("La raiz imaginaria es: " + xi);
        } else if(discr > 0){
            System.out.println("Su resultado es:");
            x1 =((- b + Math.sqrt(discr))/( 2 * a));
            x2 =((- b - Math.sqrt(discr))/( 2 * a));
            System.out.println("Tiene 2 raices reales. ");
            System.out.println("El valor de x1 es: " + x1);
            System.out.println("El valor de x2 es: " + x2);

        }lector.close();
    }
}