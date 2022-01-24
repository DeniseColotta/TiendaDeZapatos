package interfaces.implementacion;

import interfaces.iCrudZapatos;
import model.ParDeZapatos;

import java.util.ArrayList;

public class CrudZapatos implements iCrudZapatos {

    ArrayList<ParDeZapatos> zapatos = new ArrayList<>();


    @Override
    public ArrayList<ParDeZapatos> populate() {
        ParDeZapatos botas1 = new ParDeZapatos(38, "negro", "Botas Largas", 3000, true);
        ParDeZapatos botas2 = new ParDeZapatos(40, "blanco", "Botas con Plataforma", 2000, false);
        ParDeZapatos botas3 = new ParDeZapatos(36, "suela", "Botas bajas", 2500, true);
        ParDeZapatos sandalias1 = new ParDeZapatos(39, "negro", "Sandalias de cuero", 3500, true);
        ParDeZapatos sandalias2= new ParDeZapatos(41, "blanco", "Sandalias con taco", 2000, false);
        ParDeZapatos sandalias3= new ParDeZapatos(36, "suela", "Sandalias chatitas", 1500, true);
        ParDeZapatos zapatillas1 = new ParDeZapatos(38, "negro", "zapatillas de cuero", 3500, true);
        ParDeZapatos zapatillas2 = new ParDeZapatos(38, "blanco", "zapatillas de lona", 2000, false);
        ParDeZapatos zapatillas3= new ParDeZapatos(37, "suela", "zapatillas con brillos", 3000, true);
        zapatos.add(botas1);
        zapatos.add(botas2);
        zapatos.add(botas3);
        zapatos.add(sandalias1);
        zapatos.add(sandalias2);
        zapatos.add(sandalias3);
        zapatos.add(zapatillas1);
        zapatos.add(zapatillas2);
        zapatos.add(zapatillas3);

        return zapatos;
    }

    @Override
    public ArrayList<ParDeZapatos> agregarParDeZapatos(ArrayList<ParDeZapatos> zapatos, ParDeZapatos nuevoPar) {
        zapatos.add(nuevoPar);
        return zapatos;
    }

    @Override
    public ArrayList<ParDeZapatos> buscarTalleZapatos(ArrayList<ParDeZapatos> zapatos, int talle) {
        ArrayList<ParDeZapatos> zapatosPorTalle = new ArrayList<>();

        for (ParDeZapatos z : zapatos) {
            if (z.getTalle() == talle && z.isdisponible()) {
                zapatosPorTalle.add(z);
            }

        }

        return zapatosPorTalle;
    }

    @Override
    public ArrayList<ParDeZapatos> actualizarModeloDeZapatos(String modelo, ArrayList<ParDeZapatos> zapatos, String nuevoNombre) {

        for (ParDeZapatos m : zapatos) {
            if (m.getModelo().equals(modelo)) {
                m.setModelo(nuevoNombre);
            }
        }
        return zapatos;
    }



    @Override
    public ArrayList<ParDeZapatos> borrarZapatos(String modelo, ArrayList<ParDeZapatos> zapatos) {
        ParDeZapatos zapatos1=null;

        for (ParDeZapatos b : zapatos) {
            if (b.getModelo().equals(modelo)){
                zapatos1=b;

            }
        }
        zapatos.remove(zapatos1);
        return zapatos;
    }
    public ArrayList<ParDeZapatos>borrarZapatosPorModelo(String modelo, ArrayList<ParDeZapatos> zapatos, ArrayList<ParDeZapatos>zapatosPorModelos){
        ArrayList<ParDeZapatos>zapatosPorModelo=new ArrayList<>();

        for(ParDeZapatos m: zapatos) {
            if (m.getModelo().equals(modelo)) {

                zapatosPorModelo.add(m);

            }
        }
            zapatos.removeAll(zapatosPorModelo);
            return zapatos;
        }

}

