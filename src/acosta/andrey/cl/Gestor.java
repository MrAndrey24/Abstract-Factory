package acosta.andrey.cl;

import acosta.andrey.factory_Abstract.FoodAbstract;
import acosta.andrey.factory_concrect.Factory_Meat;
import acosta.andrey.factory_concrect.Factory_Pasta;
import acosta.andrey.factory_concrect.Factory_Salad;
import acosta.andrey.product_abstract.Food;

import java.util.ArrayList;

public class Gestor {

    private static final ArrayList<Food> T_FOODS = new ArrayList<>();


    public static String crearFabricaComidas(FoodAbstract fabrica) {
        Food objFood = fabrica.createFood();
        nuevaComida(objFood);
        return objFood.get_info_food();
    }

    private static void nuevaComida(Food pobjCoFood) {
        T_FOODS.add(pobjCoFood);
    }


    public static void leerOpcionPlatillo(int pOpcion) {
        FoodAbstract comidita;
        String foodName;
        switch (pOpcion) {
            case 1 -> {
                comidita = new Factory_Meat();
                foodName = "Beef";
            }
            case 2 -> {
                comidita = new Factory_Meat();
                foodName = "T-Bone";
            }
            case 3 -> {
                comidita = new Factory_Meat();
                foodName = "LardedMeat";
            }
            case 4 -> {
                comidita = new Factory_Pasta();
                foodName = "Spaghetti";
            }
            case 5 -> {
                comidita = new Factory_Pasta();
                foodName = "Lasagna";
            }
            case 6 -> {
                comidita = new Factory_Pasta();
                foodName = "Ravioles";
            }
            case 7 -> {
                comidita = new Factory_Salad();
                foodName = "Cesar";
            }
            case 8 -> {
                comidita = new Factory_Salad();
                foodName = "Capresse";
            }
            case 9 -> {
                comidita = new Factory_Salad();
                foodName = "Primavera";
            }
            default -> {
                return;
            }
        }
        System.out.println(crearFabricaComidas(comidita) + foodName);
    }


}
