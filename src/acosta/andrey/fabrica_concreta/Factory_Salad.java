package acosta.andrey.fabrica_concreta;

import acosta.andrey.fabrica_Abstracta.FoodAbstract;
import acosta.andrey.producto_abstracto.Food;
import acosta.andrey.producto_concreto.ensalada.Salad;

public class Factory_Salad implements FoodAbstract {
    @Override
    public Food createFood() {
        Salad miEnsaladita = new Salad();
        miEnsaladita.get_info_food();

        return miEnsaladita;
    }
}
