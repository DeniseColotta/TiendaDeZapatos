package main;

import interfaces.implementacion.CrudClientes;
import interfaces.implementacion.CrudZapatos;
import model.Clientes;
import model.ParDeZapatos;

import java.util.ArrayList;

public class MainCrud {
    public static void main(String[] args) {
        CrudZapatos crudZapatos= new CrudZapatos();
        ArrayList<ParDeZapatos> zapatos=crudZapatos.populate();
        System.out.println(zapatos);

        CrudClientes crudClientes=new CrudClientes();
        ArrayList<Clientes> clientes=crudClientes.populate();
        System.out.println(clientes);

        ParDeZapatos botasNuevas=new ParDeZapatos(37,"suela","Botas bajas",1800, true);
        ArrayList<ParDeZapatos>zapatosAgregados=crudZapatos.agregarParDeZapatos(zapatos,botasNuevas);
        System.out.println(zapatosAgregados);

        ArrayList<ParDeZapatos>zapatosPorTalle=crudZapatos.buscarTalleZapatos(zapatosAgregados, 38);
        System.out.println(zapatosPorTalle);

        ArrayList<ParDeZapatos>zapatosActualizados=crudZapatos.actualizarModeloDeZapatos("Botas bajas",zapatosAgregados, "Botas de caña baja");
        System.out.println(zapatosActualizados);

        ArrayList<ParDeZapatos>zapatosDespuesDeBorrar=crudZapatos.borrarZapatos("Botas con Plataforma", zapatos);
        System.out.println(zapatosDespuesDeBorrar);

        ArrayList<ParDeZapatos>zapatosPorModelo=new ArrayList<>();
        ArrayList<ParDeZapatos>borrarZapatosPorModelo=crudZapatos.borrarZapatosPorModelo("Botas con Plataforma", zapatos, zapatosPorModelo );
        System.out.println(borrarZapatosPorModelo);
    }
}
