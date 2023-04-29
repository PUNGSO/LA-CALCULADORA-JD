import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello JD, Wellcome to Java!");

        int op;
        Operaciones J = new Operaciones();

        Scanner JD = new Scanner(System.in);

        do{
         
        System.out.println(":::::::::::::::::::::");    
        System.out.println("SELECCIONE UNA OPCION");

        op = JD.nextInt();

        switch(op){
            case 1:
            J.datos();
            J.suma();

            break;

            case 2:
            J.datos();
            J.resta();
            break;

            case 3:
            J.datos();
            J.multiplicacion();
            break;

            case 4:
            J.datos();
            J.division();
            break;

            case 5:
            System.exit(0);
            default:
            System.out.println("X-OPCION INCORRECTA-X");
             
            }

        }while(op !=5);

    }
}
