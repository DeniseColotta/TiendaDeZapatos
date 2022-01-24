package interfaces;

import model.ParDeZapatos;

import java.util.ArrayList;

public interface iCrudZapatos {

    public ArrayList<ParDeZapatos> populate();

    public ArrayList<ParDeZapatos> agregarParDeZapatos( ArrayList<ParDeZapatos> zapatos, ParDeZapatos botasNuevas);
    public ArrayList<ParDeZapatos> buscarTalleZapatos(ArrayList <ParDeZapatos> zapatos, int talle);

    public ArrayList<ParDeZapatos> actualizarModeloDeZapatos(String modelo, ArrayList<ParDeZapatos> zapatos, String nuevoNombre);

    public ArrayList<ParDeZapatos> borrarZapatos(String modelo, ArrayList<ParDeZapatos> zapatos);
    public ArrayList<ParDeZapatos>borrarZapatosPorModelo(String modelo, ArrayList<ParDeZapatos> zapatos, ArrayList<ParDeZapatos>zapatosPorModelos);


}
