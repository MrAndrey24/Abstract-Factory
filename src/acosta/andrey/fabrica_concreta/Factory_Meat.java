package acosta.andrey.fabrica_concreta;

import acosta.andrey.factory_Abstract.FoodAbstract;
import acosta.andrey.product_abstract.Food;
import acosta.andrey.product_concrect.meat.Meat;

public class Factory_Meat implements FoodAbstract {

    @Override
    public Food createFood() {
        Meat miCarnita = new Meat();
        miCarnita.get_info_food();

        return miCarnita;
    }
}


