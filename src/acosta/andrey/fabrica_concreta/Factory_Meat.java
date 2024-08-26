package acosta.andrey.fabrica_concreta;

import acosta.andrey.fabrica_Abstracta.FoodAbstract;
import acosta.andrey.producto_abstracto.Food;
import acosta.andrey.producto_concreto.carne.Meat;

public class Factory_Meat implements FoodAbstract {

    @Override
    public Food createFood() {
        Meat miCarnita = new Meat();
        miCarnita.get_info_food();

        return miCarnita;
    }
}


