import java.util.Scanner;
public class App {
    public static byte edad, arma;
    public static char sexo ;
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
            //System.out.println("Usted porta arma? 1.Si 2.No");
            // arma = lector.nextByte();

        System.out.println("Cual es su edad?.");
        edad = lector.nextByte();

        if(edad < 18){
            System.out.println("Usted no puede pasar adentro.");
        }
        else if ( edad > 18){
            System.out.println("Cual es su sexo? f/m.");
            sexo = lector.next().charAt(0);
            }
            else if(sexo == 'f'){
                System.out.println("Jovencita usted puede pasar.");
            }else {
                System.out.println("Broder podes pasar!");
                }
                System.out.println("Usted porta armas? ");
                arma = lector.nextByte();
                if(edad < 21 || arma == 1 || sexo == 'f'){
                System.out.println("Jovncita usted puede pasar adentro e ingerir bebidas alcoholica.");
                 }else{
                System.out.println("Broder podes pasar! y ponerte bolo");
             
        }  
        
    }

}
