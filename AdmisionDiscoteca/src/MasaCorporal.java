import java.util.Scanner;
public class MasaCorporal {
    /*Fórmula de la grasa corporal para mujeres:
✓ A1 = (Peso corporal x 0.732) + 8.987
✓ A2 = Medida de la muñeca (en el punto más amplio) / 3.140
✓ A3 = Medida de la cintura (en el ombligo) x 0.157
✓ A4 = Medida de la cadera (en el punto más amplio) x 0.249
✓ A5 = Medida del antebrazo (en el punto más amplio) x 0.434
✓ B = A1 + A2 – A3 – A4 + A5
✓ Grasa corporal = peso corporal – B
✓ Porcentaje de grasa corporal = grasa corporal x 100 / peso
corporal
Fórmula de la grasa corporal para hombres:
✓ A1 = (Peso corporal x 1.082) + 94.42
✓ A2 = Medida de la cintura x 4.15
✓ B = A1 – A2
✓ Grasa corporal = peso corporal – B
✓ Porcentaje de grasa corporal = grasa corporal x 100 / peso
corporal
Escriba un programa para calcular la grasa corporal */


    public static void main(String []args){

        Scanner lector = new Scanner(System.in);
        float a1, a2, a3, a4, a5, b, pesoCorp, grasaCorp, porcGrasaCorp, medMuñec, medCint, medCad, medAnte;

        System.out.println("A que sexo pertenece usted? f/m");
        char sex = lector.next().charAt(0);
        switch(sex){
            case 'f','F' ->{
                System.out.println("Ingrese su peso corporal: ");
                pesoCorp = lector.nextInt();
                int numero, suma = 0, intentos = 3, intentos1 = 3, intentos2 = 3, intentos3 = 3;

                    while (intentos > 0) {
                        System.out.println("Ingrese la medida de su muñeca (en el punto mas amplio): ");
                        medMuñec = lector.nextInt();
                    if (medMuñec <= 0) {
                        System.out.println("Ingreso de valor inválido. Intentos restantes: " + (--intentos));
                        if (intentos == 0) {
                            System.out.println("Se han agotado los intentos. Saliendo del programa.");
                            break;
                            }
                        } else {
                while (intentos1 > 0) {
                        System.out.println("Ingrese la medida de su cintura (en el ombligo): ");
                medCint = lector.nextInt();
                        if (medCint <= 0) {
                            System.out.println("Ingreso de valor inválido. Intentos restantes: " + (--intentos1));
                            if (intentos1 == 0) {
                                System.out.println("Se han agotado los intentos. Saliendo del programa.");
                                break;
                                }
                             } else {
                    
                    while (intentos2 > 0) {
                       System.out.println("Ingrese la medida de su cadera (en el punto mas amplio): ");
                medCad = lector.nextInt();
                        if (medCad <= 0) {
                            System.out.println("Ingreso de valor inválido. Intentos restantes: " + (--intentos2));
                            if (intentos2 == 0) {
                                System.out.println("Se han agotado los intentos. Saliendo del programa.");
                                break;
                                }
                             } else {
                
                while (intentos3 > 0) {
                       System.out.println("Ingrese la medida de su antebrazo (en el punto mas amplio): ");
                medAnte = lector.nextInt();
                        if (medCad <= 0) {
                            System.out.println("Ingreso de valor inválido. Intentos restantes: " + (--intentos3));
                            if (intentos3 == 0) {
                                System.out.println("Se han agotado los intentos. Saliendo del programa.");
                                break;
                                }
                             } else {
                
                
                a1 = (float)((pesoCorp * 0.732) + 8.987);
                a2 = (float) (medMuñec / 3.140);
                a3 = (float) (medCint * 0.157);
                a4 = (float) (medCad * 0.249);
                a5 = (float) (medAnte * 0.434);
                b = a1 + a2 - a3 - a4 + a5;
                grasaCorp = pesoCorp - b;
                porcGrasaCorp = grasaCorp * 100 / pesoCorp;

                System.out.println("Su grasa corporal es de: " + grasaCorp + " kgl.");
                System.out.println("Su porcentaje de grasa es de: " + porcGrasaCorp + " kgl.");
                                    }
                                }
                            }
                        } 
                    }
                }
            }            
        }  
    }

            case 'm','M' ->{
                int intento4 = 3, intento5 = 3;
                while (intento4 > 0) {
                       System.out.println("Ingrese su peso corporal: ");
                pesoCorp = lector.nextInt();
                        if (pesoCorp <= 0) {
                            System.out.println("Ingreso de valor inválido. Intentos restantes: " + (--intento4));
                            if (intento4 == 0) {
                                System.out.println("Se han agotado los intentos. Saliendo del programa.");
                                break;
                                }
                             } else {

                        while (intento5 > 0) {
                       System.out.println("Ingrese la medida de su muñeca (en le punto mas amplio): ");
                medMuñec = lector.nextInt();
                        if (pesoCorp <= 0) {
                            System.out.println("Ingreso de valor inválido. Intentos restantes: " + (--intento5));
                            if (intento5 == 0) {
                                System.out.println("Se han agotado los intentos. Saliendo del programa.");
                                break;
                                }
                             } else {
                
                
                a1 =(float) ((pesoCorp * 1.082) + 94.42);  
                a2 =(float) (medMuñec * 4.15);
                b = a1 - a2;
                grasaCorp = pesoCorp - b;
                porcGrasaCorp = grasaCorp * 100 / pesoCorp;
                System.out.println("Su grasa corporal es de: " + grasaCorp + " klg.");
                System.out.println("Su porcentaje de grasa es de: " + porcGrasaCorp + "klg." );
                             }
                           }
                    } 
                }
         
        }
    }lector.close();
    
    }
}
