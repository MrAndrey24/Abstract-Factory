package acosta.andrey.product_concrect.salad;

import acosta.andrey.product_abstract.Food;

public class Salad implements Food {
    private  static final String TIPO = "Ensalada";


    public  String getTipo(){
        return TIPO;
    }

    @Override
    public String get_info_food() {
        return "The dish of type " + getTipo() + " that you ordered is here and it is ";
    }

    @Override
    public String getType() {
        return "";
    }

    @Override
    public String type() {
        return "";
    }
}
