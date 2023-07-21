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
        } while (opcion != 10);
    }

    public static void mostarMenu() {
        out.println();
        out.println("-----------Menu------------");
        out.println("Seleccione su categoria de platillos de su preferencia...");
        out.println("----------------------------------------------------------------");
        out.println("Carnes");
        out.println();
        out.println("1. Ternera");
        out.println("2. T-Bone");
        out.println("3. Carne mechada");
        out.println();
        out.println("Pastas");
        out.println();
        out.println("4. Espaguetis");
        out.println("5. Lasaña");
        out.println("6. Ravioles");
        out.println();
        out.println("Ensaladas");
        out.println();
        out.println("7. E.Cesar");
        out.println("8. E.Capresse");
        out.println("9. E.Primavera");
        out.println();
        out.println("10. Salir");


    }

    public static int leerOpcion() throws IOException {
        out.println();
        out.println("Ingrese la opcion");
        out.println();
        return Integer.parseInt(in.readLine());
    }


    public static void ejecutarAccion(int pOpcion) throws IOException {
        Gestor.leerOpcionPlatillo(pOpcion);
    }


}


