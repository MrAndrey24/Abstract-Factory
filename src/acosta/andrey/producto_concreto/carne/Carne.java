package acosta.andrey.producto_concreto.carne;

import acosta.andrey.producto_abstracto.Comida;

public class Carne implements Comida {
    private  static final String TIPO = "Carne";


    public  String getTipo(){
        return TIPO;
    }


    @Override
    public String obtener_info_comida() {
        return " El platillo de tipo " + getTipo()  + " que  ordeno esta aqui " + " y es " ;

    }

    @Override
    public String tipo() {
        return null;
    }

}
