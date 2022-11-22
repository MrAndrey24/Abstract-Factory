package acosta.andrey.fabrica_concreta;

import acosta.andrey.fabrica_Abstracta.ComidaAbstracta;
import acosta.andrey.producto_abstracto.Comida;
import acosta.andrey.producto_concreto.carne.Carne;
import acosta.andrey.producto_concreto.pasta.Pasta;

public class Fabrica_Pasta implements ComidaAbstracta {


    @Override
    public Comida crearComida() {
        Pasta miPastita = new Pasta();
        miPastita.obtener_info_comida();

        return miPastita;
    }

}
