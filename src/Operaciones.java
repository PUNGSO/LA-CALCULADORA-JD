import java.util.Scanner;

public class Operaciones {

    float n1;
    float n2;

    Scanner Jd = new Scanner(System.in); 

    public void suma(){

        float sum = n1 + n2;
        System.out.println("Resultado de la suma es: " + sum);

    }

    public void resta(){

        float res = n1 - n2;
        System.out.println("Resultado de la resta es: " + res);
        
    }
    
    public void multiplicacion(){

        float mult = n1 * n2;
        System.out.println("Resultado de la multiplicacion es: " + mult);
        
    }

    public void division (){

        float div = n1 - n2;
        System.out.println("Resultado de la division es: " + div);
        
    }

    public void datos (){

        System.out.println("Ingrese el primer valor: ");
        n1 = Jd.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        n2 = Jd.nextInt();
    }
}
