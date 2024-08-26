package acosta.andrey.fabrica_concreta;

import acosta.andrey.fabrica_Abstracta.FoodAbstract;
import acosta.andrey.producto_abstracto.Food;
import acosta.andrey.producto_concreto.pasta.Pasta;

public class Factory_Pasta implements FoodAbstract {


    @Override
    public Food createFood() {
        Pasta miPastita = new Pasta();
        miPastita.get_info_food();

        return miPastita;
    }

}
