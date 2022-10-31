import main.ListaPromedio;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static final Logger LOGGER= Logger.getLogger(Main.class);
    public static void main(String[] args) {
        ListaPromedio listaPromedioMayor5= null;
        ListaPromedio listaPromedioMayor10= null;
        ListaPromedio listaPromedioVacia= null;

        try {
            listaPromedioMayor5= new ListaPromedio(Arrays.asList(1,2,3,4,5,6));
            listaPromedioMayor10= new ListaPromedio(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
            listaPromedioVacia= new ListaPromedio(new ArrayList<>());

            System.out.println(listaPromedioMayor5.promedio());
            System.out.println(listaPromedioMayor10.promedio());
            System.out.println(listaPromedioVacia.promedio());
        } catch (Exception e) {
            LOGGER.error("La lista es igual a 0 ",e);
        }
    }
}