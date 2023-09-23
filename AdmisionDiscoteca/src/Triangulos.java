import java.util.Scanner;

public class Triangulos{

    public static void main(String []args){

        float hipotenusa, catetomayor, catetomenor;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la hipotenusa");
        hipotenusa = lector.nextInt();
        System.out.println("Ingrese el cateto mayor");
        catetomayor= lector.nextInt();
        System.out.println("Ingrese el cateto menor");
        catetomenor= lector.nextInt();

        if(hipotenusa == catetomayor && catetomayor == catetomenor){
            System.out.println("Es un Triangulo Equilatero");
        }
        if(catetomayor == catetomenor && catetomayor != hipotenusa && catetomenor != hipotenusa){
            System.out.println("Es un Triangulo Isosceles");
        }
        if(hipotenusa != catetomayor && hipotenusa != catetomenor && catetomayor != catetomenor){
            System.out.println("Es un Triangulo Escaleno");
        }
        if((hipotenusa * hipotenusa) == (catetomayor * catetomayor) + (catetomenor * catetomenor)){
            System.out.println("Es un Triangulo Rectangulo");
        }lector.close();

    }

}