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
        int option;
        do {
            showMenu();
            option = readOption();
            executeAction(option);
        } while (option != 10);
    }

    public static void showMenu() {
        out.println("""
        \n-----------Menu------------
        Select your preferred dish category...
        ----------------------------------------------------------------
        Meats
        \n1. Beef
        2. T-Bone
        3. Shredded meat
        \nPastas
        \n4. Spaghetti
        5. Lasagna
        6. Ravioli
        \nSalads
        \n7. Caesar Salad
        8. Caprese Salad
        9. Spring Salad
        \n10. Exit
    """);
    }

    public static int readOption() throws IOException {
        out.println("\nEnter the option: \n");
        return Integer.parseInt(in.readLine());
    }

    public static void executeAction(int pOption) throws IOException {
        Gestor.leerOpcionPlatillo(pOption);
    }


}


