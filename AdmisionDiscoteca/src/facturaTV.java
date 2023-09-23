import java.util.Scanner;
public class facturaTV {

    public static void main(String []args){

        Scanner lector = new Scanner(System.in);
        int numCuenta, codCliente, numCanales, numConex;
        char codigoT;
        float cargProces, carXServiBasic, CanPrem, conxAdic;

        System.out.println("Ingrese su numero de cuenta: ");
        numCuenta = lector.nextInt();
        System.out.println("Ingrese su codigo de cliente: ");
        codCliente = lector.nextInt();

        System.out.println("Ingrese que tipo de servicio tiene: R.Clase residencial o N.Cliente de negocios.");
        codigoT = lector.next().charAt(0);
        switch(codigoT){
            case 'R','r'->{
                


            }

        }
        
    }
    
}
