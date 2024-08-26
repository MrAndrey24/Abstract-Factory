package acosta.andrey.fabrica_concreta;

import acosta.andrey.factory_Abstract.FoodAbstract;
import acosta.andrey.product_abstract.Food;
import acosta.andrey.product_concrect.salad.Salad;

public class Factory_Salad implements FoodAbstract {
    @Override
    public Food createFood() {
        Salad miEnsaladita = new Salad();
        miEnsaladita.get_info_food();

        return miEnsaladita;
    }
}
