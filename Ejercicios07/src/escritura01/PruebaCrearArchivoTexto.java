package escritura01;

import java.util.Scanner;

public class PruebaCrearArchivoTexto {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        boolean bandera = true;
        String opcion;

        while (bandera) {

            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese su apellido");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese su edad");

            int edad = entrada.nextInt();
            cadenaFinal = String.format("%s%s %s %d\n", cadenaFinal, nombre,
                    apellido, edad);
            entrada.nextLine();
            System.out.println("Ingrese 'x' para salir");
            opcion = entrada.nextLine();
            if (opcion.equals("x")) {
                bandera = false;
            }

        }
        CrearArchivoTexto.agregarRegistros(cadenaFinal);

    } // fin de main
} // fin de la clase PruebaCrearArchivoTexto

/**
 * ************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y * Pearson Education,
 * Inc. Todos los derechos reservados. *
 * ***********************************************************************
 */
