import java.util.Scanner;
public class Enmarcado {
    public static void main(String []args){
        float longitud, ancho,costoMarco, areaTotal, costoColor, costoTotal;
        float costoVidrio, costoCarton, costoCoronas;
        int  coronas;
        String color;

        Scanner lector= new Scanner(System.in);

        System.out.println("De que color desea su cuadro?: ");
        color = lector.nextLine();
        System.out.println("Ingrese la longitud del cuadro en pulgadas: ");
        longitud = lector.nextFloat();
        System.out.println("Ingrese el ancho del cuadro en pulgadas: ");
        ancho = lector.nextFloat();
        areaTotal = (float)((longitud  * ancho)* 0.10);

        System.out.println("Que tipo de marco desea comprar? \nMarco regular toque r/R \nMarco lujoso toque l/L");
        char  opc = lector.next().charAt(0);
        
        switch(opc){
            case'r', 'R' ->{
                
                System.out.println("Cuantas coronas desea en el cuadro? ");
                coronas =lector.nextInt();
                
                costoCoronas = (float) (coronas * 0.35);
                costoColor = (float)(0.10);
                costoMarco =(float) (areaTotal * (0.15));
                costoCarton =(float) (areaTotal * 0.02);
                costoVidrio =(float) (areaTotal * 0.07);

                costoTotal = (costoColor + costoCoronas + costoMarco + costoCarton + costoVidrio);
                System.out.println("Su marco sera de color " + color + " y su precio sera de: " + costoTotal + " U$.");
            }

             case'l', 'L' ->{
                
                System.out.println("Cuantas coronas desea en el cuadro? ");
                coronas =lector.nextInt();
                
                costoCoronas = (float) (coronas * 0.35);
                costoColor = (float)(0.10);
                costoMarco =(float) (areaTotal * (0.25));
                costoCarton =(float) (areaTotal * 0.02);
                costoVidrio =(float) (areaTotal * 0.07);

                costoTotal = (costoColor + costoCoronas + costoMarco + costoCarton + costoVidrio);
                System.out.println("Su marco sera de color " + color + " y su precio sera de: " + costoTotal + " U$.");
            }

        }lector.close();

    }
    
}
