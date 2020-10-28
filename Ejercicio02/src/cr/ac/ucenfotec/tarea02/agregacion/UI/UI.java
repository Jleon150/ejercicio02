package cr.ac.ucenfotec.tarea02.agregacion.UI;
import java.io.PrintStream;
import java.util.Scanner;

public class UI {
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("Elija una opcion");
        System.out.println("1:Registrar un Vehiculo ");
        System.out.println("2:Registar Motor");
        System.out.println("3:Listar Vehiculos y sus motores");
        System.out.println("4:Salir");
    }
    public int leerOpcion(){
        output.println("Su opcion es: ");
        return input.nextInt();
    }
}
