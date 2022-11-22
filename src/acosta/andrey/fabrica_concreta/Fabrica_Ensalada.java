package acosta.andrey.fabrica_concreta;

import acosta.andrey.fabrica_Abstracta.ComidaAbstracta;
import acosta.andrey.producto_abstracto.Comida;
import acosta.andrey.producto_concreto.carne.Carne;
import acosta.andrey.producto_concreto.ensalada.Ensalada;

public class Fabrica_Ensalada implements ComidaAbstracta {
    @Override
    public Comida crearComida() {
        Ensalada miEnsaladita = new Ensalada();
        miEnsaladita.obtener_info_comida();

        return miEnsaladita;
    }
}
