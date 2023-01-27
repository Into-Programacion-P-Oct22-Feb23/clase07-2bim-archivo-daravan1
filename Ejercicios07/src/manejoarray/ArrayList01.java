/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // creación de un ArrayList
        ArrayList<Integer> arreglo = new ArrayList<>();

        arreglo.add(10);
        arreglo.add(20);
        arreglo.add(30);
        arreglo.add(40);
        arreglo.add(50);
        arreglo.add(60);
        arreglo.add(1000);
        arreglo.add(2000);
        arreglo.add(3000);

        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(arreglo.get(i));
        }

        System.out.println("----------------------------------");

        ArrayList<Double> arreglo3 = new ArrayList<>();

        arreglo3.add(10.2);
        arreglo3.add(11.2);
        arreglo3.add(12.2);
        arreglo3.add(13.2);

        for (int i = 0; i < arreglo3.size(); i++) {
            System.out.println(arreglo3.get(i));
        }

        System.out.println("----------------------------------");
        ArrayList<String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        String pais;
        int opcion;
        while (bandera) {
            System.out.println("Ingrese el nombre de un pais");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Ingrese 1 para terminar");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 1) {
                bandera = false;
            }
        }
        System.out.println("Los nombres de los paises son:");
        for (int i = 0; i < arreglo2.size(); i++) {
            System.out.println(arreglo2.get(i));
        }
        /*
        ArrayList <String> arreglo2 = new ArrayList<>();
        
        ArrayList <Boolean> arreglo4 = new ArrayList<>();
         */
    }
}
