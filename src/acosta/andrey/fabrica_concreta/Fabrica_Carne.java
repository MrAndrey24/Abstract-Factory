package acosta.andrey.fabrica_concreta;

import acosta.andrey.fabrica_Abstracta.ComidaAbstracta;
import acosta.andrey.producto_abstracto.Comida;
import acosta.andrey.producto_concreto.carne.Carne;

public class Fabrica_Carne implements ComidaAbstracta {

    @Override
    public Comida crearComida() {
        Carne miCarnita = new Carne();
        miCarnita.obtener_info_comida();

        return miCarnita;
    }
}


