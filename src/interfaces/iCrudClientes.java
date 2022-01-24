package interfaces;

import model.Clientes;
import model.ParDeZapatos;

import java.util.ArrayList;

public interface iCrudClientes {

    public ArrayList<Clientes> populate();
    public ArrayList<Clientes> agregarClientes();
    public ArrayList<Clientes> BuscarFormaDePago();
}
