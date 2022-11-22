package acosta.andrey.ui;

import acosta.andrey.cl.Gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    static PrintStream out = System.out;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // write your code here

        int opcion = -1;
        do {
            mostarMenu();
            opcion = leerOpcion();
            ejecutarAccion(opcion);
            // out.println();
        } while (opcion != 10);
    }

    public static void mostarMenu() {
        out.println("");
        out.println("-----------Menu------------");
        out.println("Seleccione su categoria de platillos de su preferencia...");
        out.println("----------------------------------------------------------------");
        out.println("Carnes");
        out.println("");
        out.println("1. Ternera");
        out.println("2. T-Bone");
        out.println("3. Carne mechada");
        out.println("");
        out.println("Pastas");
        out.println("");
        out.println("4. Espaguetis");
        out.println("5. Lasaña");
        out.println("6. Ravioles");
        out.println("");
        out.println("Ensaladas");
        out.println("");
        out.println("7. E.Cesar");
        out.println("8. E.Capresse");
        out.println("9. E.Primavera");
        out.println("");
        out.println("10. Salir");

        /*




         */


    }

    public static int leerOpcion() throws IOException {
        out.println("");
        out.println("Ingrese la opcion");
        out.println("");
        int opcion = Integer.parseInt(in.readLine());
        return opcion;
    }


    public static void ejecutarAccion(int pOpcion) throws IOException {

        switch (pOpcion) {
            case 1:

                Gestor.leerOpcionPlatillo(pOpcion);

                break;
            case 2:
                Gestor.leerOpcionPlatillo(pOpcion);

                break;

            case 3:
                Gestor.leerOpcionPlatillo(pOpcion);
                break;


            case 4:
                Gestor.leerOpcionPlatillo(pOpcion);

                break;

            case 5:
                Gestor.leerOpcionPlatillo(pOpcion);

                break;

            case 6:
                Gestor.leerOpcionPlatillo(pOpcion);

                break;

            case 7:
                Gestor.leerOpcionPlatillo(pOpcion);

                break;


            case 8:
                Gestor.leerOpcionPlatillo(pOpcion);

                break;

            case 9:
                Gestor.leerOpcionPlatillo(pOpcion);

                break;


        }
    }


}


