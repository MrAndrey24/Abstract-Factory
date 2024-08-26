package acosta.andrey.producto_concreto.ensalada;

import acosta.andrey.producto_abstracto.Food;

public class Salad implements Food {
    private  static final String TIPO = "Ensalada";


    public  String getTipo(){
        return TIPO;
    }

    @Override
    public String get_info_food() {
        return " El platillo de tipo " + getTipo()  + " que  ordeno esta aqui " + "y es  " ;
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
