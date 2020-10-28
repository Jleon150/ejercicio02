package cr.ac.ucenfotec.tarea02.agregacion.controlador;

import cr.ac.ucenfotec.tarea02.agregacion.UI.UI;
import cr.ac.ucenfotec.tarea02.agregacion.bl.entidades.Motor;
import cr.ac.ucenfotec.tarea02.agregacion.bl.entidades.Vehiculo;
import cr.ac.ucenfotec.tarea02.agregacion.bl.logica.Gestor;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do{
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);

        }while(opcion!=4);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registarVehiculo();
                System.out.println("Digite cualquier tecla para continuar");
                String b = input.next();
                break;
            case 2:
                registrarMotor();
                System.out.println("Digite cualquier tecla para continuar");
                String d = input.next();
                break;
            case 3:
                System.out.println("Listas de Vehiculos y sus motores");
                listarVehiculosMotores();
                System.out.println("Digite cualquier tecla para continuar");
                String c = input.next();
                break;
            case 4:
                System.out.println("Opcion Salir");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }

    private void listarVehiculosMotores() {
        ArrayList<Vehiculo> listaCom = gestor.listarVehiculo();
        for (int i = 0; i < listaCom.size(); i++) {
            System.out.println(listaCom.get(i).toString());
        }
    }

    private void registrarMotor() {
        System.out.println("Registrando un motor");
        System.out.println("Ingrese el numero de serie");
        String serie = input.next();
        System.out.println("Ingrese el numero de cilindros");
        int mnumCilindros = input.nextInt();
        gestor.agregarMotor(serie, mnumCilindros);
    }

    private void registarVehiculo() {
        System.out.println("Registrando un vehiculo");
        System.out.println("Numero de Serie");
        String mnumSerie = input.next();
        System.out.println("Marca");
        String mmarca= input.next();
        gestor.agregarVehiculo(mnumSerie,mmarca);
    }
}
