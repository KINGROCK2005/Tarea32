import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class acronims {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String palabra = "";
        String acronimo = "";
        boolean b = true;
        int n = 0;

        do {
            try {
                System.out.println("Ingrese 3 palabras una por una (SIN ESPACIOS)");
                palabra = x.nextLine();
                if (!palabra.contains(" ")) {
                    for (int i = 0; i < palabra.length() && i < 1; i++) {
                        acronimo += palabra.charAt(i);
                    }
                    n++;
                } else {
                    throw new Exception("No debe incluir espacios");
                }

                if (n >= 3) {
                    b = false;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (b);

        System.out.println(acronimo);

        x.close();
    }
}