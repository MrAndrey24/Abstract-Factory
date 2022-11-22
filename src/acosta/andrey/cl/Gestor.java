package acosta.andrey.cl;

import acosta.andrey.fabrica_Abstracta.ComidaAbstracta;
import acosta.andrey.fabrica_concreta.Fabrica_Carne;
import acosta.andrey.fabrica_concreta.Fabrica_Ensalada;
import acosta.andrey.fabrica_concreta.Fabrica_Pasta;
import acosta.andrey.producto_abstracto.Comida;

import java.util.ArrayList;

public class Gestor {

    private static ArrayList<Comida> tComidas = new ArrayList<>();


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
        for (int i = 0; i < tComidas.size(); i++) {
            datos = tComidas.get(i).obtener_info_comida() + "\n";
        }
        return datos;
    }

    public static String infoCarne() {
        String datos = "";

        for (int i = 0; i < tComidas.size(); i++) {
            if (tComidas.get(i).tipo() == "Carne")
                datos = tComidas.get(i).obtener_info_comida() + "\n";

        }
        return datos;

    }

    public static String infoPasta() {
        String datos = "";

        for (int i = 0; i < tComidas.size(); i++) {
            if (tComidas.get(i).tipo() == "Pasta")
                datos = tComidas.get(i).obtener_info_comida() + "\n";

        }
        return datos;

    }

    public static String infoEnsalada() {
        String datos = "";

        for (int i = 0; i < tComidas.size(); i++) {
            if (tComidas.get(i).tipo() == "Ensalada")
                datos = tComidas.get(i).obtener_info_comida() + "\n";

        }
        return datos;

    }

    public static void leerOpcionPlatillo(int pOpcion) {
        ComidaAbstracta comidita;
        switch (pOpcion) {
            case 1:
                String ter = "Ternera";
                comidita = new Fabrica_Carne();
                System.out.println(crearFabricaComidas(comidita) + ter);
                break;

            case 2:
                String tbo = "T-Bone";
                comidita = new Fabrica_Carne();
                System.out.println(crearFabricaComidas(comidita) + tbo);
                break;
            case 3:

                String mechada = "Carne mechada";
                comidita = new Fabrica_Carne();
                System.out.println(crearFabricaComidas(comidita) + mechada);
                break;

            case 4:
                String espa = "Espaguetis";
                comidita = new Fabrica_Pasta();
                System.out.println(crearFabricaComidas(comidita) + espa);

                break;
            case 5:
                String lasann = "Lasaña";
                comidita = new Fabrica_Pasta();
                System.out.println(crearFabricaComidas(comidita) + lasann);

                break;
            case 6:
                String raviour = "Ravioles";
                comidita = new Fabrica_Pasta();
                System.out.println(crearFabricaComidas(comidita) + raviour);

                break;

            case 7:
                String cesar = " Cesar ";
                comidita = new Fabrica_Ensalada();
                System.out.println(crearFabricaComidas(comidita) + cesar);


                break;

            case 8:
                String capre = "Capresse";
                comidita = new Fabrica_Ensalada();
                System.out.println(crearFabricaComidas(comidita) + capre);


                break;
            case 9:
                String primave = "Primavera";
                comidita = new Fabrica_Ensalada();
                System.out.println(crearFabricaComidas(comidita) + primave);

                break;

            default:
                break;
        }

    }


}
