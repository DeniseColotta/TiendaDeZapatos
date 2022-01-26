package interfaces.implementacion;

import interfaces.iCrudClientes;
import model.Clientes;
import model.ParDeZapatos;

import java.util.ArrayList;

//comentario
public class CrudClientes implements iCrudClientes {
    @Override
    public ArrayList<Clientes> populate() {
        ArrayList<Clientes>clientes=new ArrayList<>();
        ParDeZapatos botas1 = new ParDeZapatos(38, "negro", "Botas Largas", 1000, true);
        ParDeZapatos botas2 = new ParDeZapatos(40, "blanco", "Botas con Plataforma", 2000, false);
        ParDeZapatos botas3 = new ParDeZapatos(36, "suela", "Botas bajas", 1500, true);

        Clientes c1=new Clientes("Daniela","Lopez", 444444,"danilopez@gmail.com",botas1, "tarjeta de crédito","San Martin 666");
        Clientes c2=new Clientes("Maria","Perez", 55555,"Mperez@gmail.com",botas2, "Efectivo","Rivadavia 654");
        Clientes c3=new Clientes("Daniela","Lopez", 444444,"danilopez@gmail.com",botas3, "Efectivo","Echeverria 556");
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);


        return clientes;
    }

    @Override
    public ArrayList<Clientes> agregarClientes() {
        return null;
    }

    @Override
    public ArrayList<Clientes> BuscarFormaDePago() {
        return null;
    }
}
