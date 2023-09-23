import java.util.Scanner;

public class DiscotecaPe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Ingrese su género (M/F): ");
        char genero = sc.nextLine().charAt(0);

        if (edad < 18) {
            System.out.println("Lo siento, eres menor de 18 años y no puedes entrar.");
            } else if (edad >= 18) {
            if (genero == 'M') {
                System.out.print("¿Porta armas? (Sí/No): ");
                String respuestaArmas = sc.nextLine();
                if (respuestaArmas.equalsIgnoreCase("Sí")) {
                    System.out.println("Lo siento, no puedes entrar debido a que portas armas.");
                } else {
                    if (edad >= 20) {
                        System.out.println("¡Bienvenido! Puedes entrar y consumir bebidas alcohólicas.");
                    } else {
                        System.out.println("Bienvenido, puedes entrar, pero no puedes consumir bebidas alcohólicas.");
                    }
                }
            } else if (genero == 'F') {
                if (edad >= 20) {
                    System.out.println("¡Bienvenida! Puedes entrar y consumir bebidas alcohólicas.");
                } else {
                    System.out.println("Bienvenida, puedes entrar, pero no puedes consumir bebidas alcohólicas.");
                }
            } else {
                System.out.println("Género no válido. Ingrese 'M' o 'F'.");
            }
        }sc.close();
    }
}