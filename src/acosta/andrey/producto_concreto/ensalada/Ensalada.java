package acosta.andrey.producto_concreto.ensalada;

import acosta.andrey.producto_abstracto.Comida;

public class Ensalada implements Comida {
    private  static final String TIPO = "Ensalada";


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
