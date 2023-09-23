import java.util.Scanner;
public class KheBanproQ {
    public static void main(String []args){

        int  numCuenta;
        float saldoMinimo, saldoActual, saldoNuevo;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de su cuenta bancaria. ");
        numCuenta = lector.nextInt();
        System.out.println("Ingrese que tipo su cuenta: ");
        System.out.println("Si es de ahorro toque s/S");
        System.out.println("Si es de cheque toque c/C");

        char opc = lector.next().charAt(0);
        switch(opc){
            case 's', 'S' ->{
                System.out.println("Introduzca el saldo minimo que se debe mantener: ");
                saldoMinimo = lector.nextFloat();
                if (saldoMinimo <= 0){
                    System.out.println("Numero invalido. Vuelva a intentarlo");
                }
                System.out.println("Introduzca su saldo actual:");
                saldoActual = lector.nextFloat();

                if(saldoActual < saldoMinimo)
                    {
                    saldoNuevo = saldoActual + 10;
                    System.out.println(numCuenta + " C. -Cuenta de ahorro \nSaldo actual ingresado: " + saldoActual + " U$ \nSu nuevo Saldo es: " + saldoNuevo + " U$. ");

                }else if(saldoActual > saldoMinimo){
                    saldoNuevo = (float) (saldoActual + (saldoActual * 0.04));
                    System.out.println(numCuenta + " C. -Cuenta de ahorro \nSaldo actual ingresado: " + saldoActual + " U$ \nSu nuevo Saldo es: " + saldoNuevo + " U$. ");
                    }else{

                    }
                
            }   
        
            case 'c', 'C' ->{    
                System.out.println("Introduzca el saldo minimo que se debe mantener: ");
                saldoMinimo = lector.nextFloat();
                    if (saldoMinimo <= 0){
                    System.out.println("Numero invalido. Vuelva a intentarlo");
                    }
                     System.out.println("Introduzca su saldo actual:");
                    saldoActual = lector.nextFloat();

                    if(saldoActual < saldoMinimo){
                    saldoNuevo = saldoActual + 25;
                    System.out.println(numCuenta + " C. -Cuenta de ahorro \nSaldo actual ingresado: " + saldoActual + " U$ \nSu nuevo saldo es: " + saldoNuevo + " U$. ");

                    }else if(saldoActual >= saldoMinimo + 5000){
                    saldoNuevo = (float) (saldoActual + (saldoActual * 0.03));
                    System.out.println(numCuenta + " C. -Cuenta de ahorro \nSaldo actual ingresado: " + saldoActual + " U$ \nSs nuevo Saldo es: " + saldoNuevo + " U$. ");

                    }else if(saldoActual >= saldoMinimo){
                        saldoNuevo = (float) (saldoActual + (saldoActual * 0.05));  
                        System.out.println(numCuenta + " C. -Cuenta de ahorro \nSaldo actual ingresado: " + saldoActual + " U$ \nSu nuevo Saldo es: " + saldoNuevo + " U$. ");
                    }

            }    
               default ->{
                    
                }
        }lector.close();
    }
}

