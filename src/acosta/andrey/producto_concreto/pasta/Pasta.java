package acosta.andrey.producto_concreto.pasta;

import acosta.andrey.producto_abstracto.Comida;

public class Pasta implements Comida {
    private  static final String TIPO = "Pasta";


    public  String getTipo(){
        return TIPO;
    }
    @Override
    public String obtener_info_comida() {
        return " El platillo de tipo " + getTipo()  + " que  ordeno esta aqui " + "y es  " ;
    }

    @Override
    public String tipo() {
        return null;
    }
}
