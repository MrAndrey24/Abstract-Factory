package acosta.andrey.factory_concrect;

import acosta.andrey.factory_Abstract.FoodAbstract;
import acosta.andrey.product_abstract.Food;
import acosta.andrey.product_concrect.pasta.Pasta;

public class Factory_Pasta implements FoodAbstract {


    @Override
    public Food createFood() {
        Pasta miPastita = new Pasta();
        miPastita.get_info_food();

        return miPastita;
    }

}
