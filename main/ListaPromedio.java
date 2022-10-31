package main;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListaPromedio {
    private static final Logger LOGGER= Logger.getLogger(ListaPromedio.class);

    private List<Integer> listaEnteros= new ArrayList<>();

    public ListaPromedio(List<Integer> listaEnteros) throws Exception {
        this.listaEnteros = listaEnteros;

        if(listaEnteros.size()>5){
            LOGGER.info("La longitud de la lista es mayor a 5");

        }
        if(listaEnteros.size()>10){
            LOGGER.info(("La longitud de la lista es mayor a 10"));

        }
        if(listaEnteros.size()==0){
            throw new Exception();
        }
    }

    public int promedio(){
        int sum=0;
        for(Integer entero: listaEnteros){
            sum += entero;
        }
        int promedio= sum/listaEnteros.size();
        LOGGER.info("El promedio de la lista es :"+promedio);
        return promedio;
    }

    public List<Integer> getListaEnteros() {
        return listaEnteros;
    }

    public void setListaEnteros(List<Integer> listaEnteros) {
        this.listaEnteros = listaEnteros;
    }
}
