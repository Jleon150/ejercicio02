package cr.ac.ucenfotec.tarea02.agregacion.bl.logica;

import cr.ac.ucenfotec.tarea02.agregacion.bl.entidades.Motor;
import cr.ac.ucenfotec.tarea02.agregacion.bl.entidades.Vehiculo;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestor {
    public ArrayList<Motor> motores = new ArrayList<>(10);
    public ArrayList<Vehiculo> vehiculos = new ArrayList<>(10);
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    public void agregarMotor(String mserie, int mnumCilindros) {
        Motor nuevo = new Motor(mserie, mnumCilindros);
        if (motores.contains(nuevo)) {
            System.out.println("El motor ya existe, no se agregara");
        } else {
            System.out.println("El motor no existe, Motor registrado ");
            motores.add(nuevo);
            System.out.println("Elija : \n 1 : Asignar a Vehiculo \n 2 : No asginar ");
            int opcion = input.nextInt();
            if (opcion == 1) {
                int numLista = 0;
                System.out.println("Lista de Vehiculos");
                for (int i = 0; i <vehiculos.size() ; i++) {
                    System.out.println(i + "--->" + vehiculos.get(i).getMnumSerie());
                    System.out.println("Seleccione un numero de la lista ");
                    numLista = input.nextInt();

                }
                asginarMotor(numLista,nuevo);
            }

        }
    }

    public void agregarVehiculo(String mnumSerie, String mmarca) {
        Vehiculo nuevov = new Vehiculo(mnumSerie, mmarca);
        if (vehiculos.contains(nuevov)) {
            System.out.println("El vehiculo ya existe, no se agregara");

        } else {
            System.out.println("El Vehiculo no existe, Vehiculo registrado ");
            vehiculos.add(nuevov);
        }
    }
        public ArrayList<Vehiculo> listarVehiculo () {
            return this.vehiculos;
        }
        public ArrayList<Motor> listarMotor () {
            return this.motores;
        }
        public void asginarMotor ( int numLista, Motor nuevo){
            vehiculos.get(numLista).asignarMotor(nuevo);

        }
    }



