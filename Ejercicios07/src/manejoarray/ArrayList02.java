/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

/**
 *
 * @author UTPL
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);
    }

    public static ArrayList<String> obtenerDatos() {
        boolean bandera = true;
        String pais;
        int opcion;
        ArrayList<String> arreglo3 = new ArrayList<>();
        while (bandera) {
            System.out.println("Ingrese el nombre de un pais");
            pais = entrada.nextLine();
            arreglo3.add(pais);
            System.out.println("Ingrese 1 para terminar");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 1) {
                bandera = false;
            }
        }
        return arreglo3;
    }

    public static String obtenerCadenaFinal(ArrayList<String> a) {
        String cadena = "";
        for (int i = 0; i < a.size(); i++) {
            cadena = String.format("%s%s\n", cadena, a.get(i));
        }
        return cadena;
    }

}
