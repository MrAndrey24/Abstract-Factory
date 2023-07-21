package acosta.andrey.cl;

import acosta.andrey.fabrica_Abstracta.ComidaAbstracta;
import acosta.andrey.fabrica_concreta.Fabrica_Carne;
import acosta.andrey.fabrica_concreta.Fabrica_Ensalada;
import acosta.andrey.fabrica_concreta.Fabrica_Pasta;
import acosta.andrey.producto_abstracto.Comida;

import java.util.ArrayList;
import java.util.Objects;

public class Gestor {

    private static final ArrayList<Comida> tComidas = new ArrayList<>();


    public static String crearFabricaComidas(ComidaAbstracta fabrica) {
        Comida objComida = fabrica.crearComida();
        nuevaComida(objComida);
        return objComida.obtener_info_comida();
    }

    private static void nuevaComida(Comida pobjCoComida) {
        tComidas.add(pobjCoComida);
    }

    public static String informacionComida() {
        String datos = "";
        for (Comida tComida : tComidas) {
            datos = tComida.obtener_info_comida() + "\n";
        }
        return datos;
    }

    public static String infoCarne() {
        String datos = "";

        for (Comida tComida : tComidas) {
            if (Objects.equals(tComida.tipo(), "Carne"))
                datos = tComida.obtener_info_comida() + "\n";

        }
        return datos;

    }

    public static String infoPasta() {
        String datos = "";

        for (Comida tComida : tComidas) {
            if (Objects.equals(tComida.tipo(), "Pasta"))
                datos = tComida.obtener_info_comida() + "\n";

        }
        return datos;

    }

    public static String infoEnsalada() {
        String datos = "";

        for (Comida tComida : tComidas) {
            if (Objects.equals(tComida.tipo(), "Ensalada"))
                datos = tComida.obtener_info_comida() + "\n";

        }
        return datos;

    }

    public static void leerOpcionPlatillo(int pOpcion) {
        ComidaAbstracta comidita;
        switch (pOpcion) {
            case 1 -> {
                String ter = "Ternera";
                comidita = new Fabrica_Carne();
                System.out.println(crearFabricaComidas(comidita) + ter);
            }
            case 2 -> {
                String tbo = "T-Bone";
                comidita = new Fabrica_Carne();
                System.out.println(crearFabricaComidas(comidita) + tbo);
            }
            case 3 -> {
                String mechada = "Carne mechada";
                comidita = new Fabrica_Carne();
                System.out.println(crearFabricaComidas(comidita) + mechada);
            }
            case 4 -> {
                String espa = "Espaguetis";
                comidita = new Fabrica_Pasta();
                System.out.println(crearFabricaComidas(comidita) + espa);
            }
            case 5 -> {
                String lasann = "Lasaña";
                comidita = new Fabrica_Pasta();
                System.out.println(crearFabricaComidas(comidita) + lasann);
            }
            case 6 -> {
                String raviour = "Ravioles";
                comidita = new Fabrica_Pasta();
                System.out.println(crearFabricaComidas(comidita) + raviour);
            }
            case 7 -> {
                String cesar = " Cesar ";
                comidita = new Fabrica_Ensalada();
                System.out.println(crearFabricaComidas(comidita) + cesar);
            }
            case 8 -> {
                String capre = "Capresse";
                comidita = new Fabrica_Ensalada();
                System.out.println(crearFabricaComidas(comidita) + capre);
            }
            case 9 -> {
                String primave = "Primavera";
                comidita = new Fabrica_Ensalada();
                System.out.println(crearFabricaComidas(comidita) + primave);
            }
            default -> {
            }
        }

    }


}
