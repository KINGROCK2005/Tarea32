import java.util.Scanner;
public class facturaCell {
    public static void main(String []args){

        Scanner lector = new Scanner(System.in);
        int numCuenta, llamMint, min, minDay, minNight;
        float minExt, minDayEx, minNightEx;
        char opc;
        System.out.println("Buenas tardes mi estimado cliente.");
        System.out.println("Ingrese su numero de cuenta: ");
        numCuenta = lector.nextInt();
            System.out.print("Que tipo de servicio tiene usted?: ");
             System.out.print("A.Servicio Regular B.Servicio Premium: ");
        opc= lector.next().charAt(0);

        switch(opc){
            case 'A','a'->{

            System.out.println("Ha ingresado al servicio regular.");
            System.out.println("Cuantos minutos de llamada ha tenido?");
             llamMint = lector.nextInt();
            while(llamMint <=0){
                System.out.println("No puede ingresar numeros negativos ni cero. Intente denuevo");
               llamMint = lector.nextInt();
            }
                if(llamMint <= 50){
                    System.out.println("Su cantidad de minutos usados ha sido de: " + llamMint + " por lo tanto no pagara nada. Muchas gracias por usar nuestro servicio");
                }else if(llamMint > 50){
                    System.out.println("Introduzca cuentos minutos extras ha ocupado: ");
                    min =lector.nextInt();
                    minExt = (min *(float) (0.20));
                    System.out.println("Su cuenta es: " + numCuenta + "\nSu cantidad de minutos usados ha sido de: " +  min + ". Asi que debera de pagar: " + minExt + " U$. Muchas gracias por usar nuestros servicios.");
                }
            }
                
            case 'B','b'->{
                System.out.println("Ha ingresado al servicio premium.");
            System.out.println("Cuantos minutos de llamada ha tenido en el dia?");
             minDay = lector.nextInt();
            while(minDay <=0){
                System.out.println("No puede ingresar numeros negativos ni cero. Intente denuevo");
               minDay = lector.nextInt();
            }
                 if(minDay <= 75){
                     System.out.println("Su cantidad de minutos usados en el dia ha sido de: " + minDay+ " por lo tanto no pagara nada. Muchas gracias por usar nuestro servicio");
                }else  if(minDay > 75){
                    System.out.println("Introduzca cuentos minutos extras ha ocupado: ");
                    min =lector.nextInt();
                    minExt = (min * (float)(0.25));
                minDayEx = minExt;
                
                System.out.println("Cuantos minutos de llamada ha tenido en la noche?");
             minNight = lector.nextInt();
            while(minNight <=0){
                System.out.println("No puede ingresar numeros negativos ni cero. Intente denuevo");
               minNight = lector.nextInt();
            }
                if(minDayEx + minNight<= 75){
                    System.out.println("Su cantidad de minutos usados en el dia y la noche han sido de: " + minDay + " y "+ minNight + " por lo tanto no pagara nada. Muchas gracias por usar nuestro servicio");
                }else if(minDayEx + minNight> 75){
                    System.out.println("Introduzca cuentos minutos extras ha ocupado: ");
                    min =lector.nextInt();
                    minNightEx = (min * (float)(0.25));
                        float minTot = minDayEx + minNightEx;
                        System.out.println("Su cuenta es: " + numCuenta  +"\nSu cantidad de minutos usados en el dia ha sido de: " +  minDayEx + " U$ y en la noche han sido de: " + minNightEx + " U$. \nAsi que debera de pagar: " + minTot + " U$. Muchas gracias por usar nuestros servicios.");
                }   
            } lector.close();
                       
            }
        
        }

    }
    
}
