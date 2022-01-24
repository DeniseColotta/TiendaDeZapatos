package model;

import java.util.ArrayList;

public class Clientes extends Persona{
    private ParDeZapatos articulosComprados;
    private String formaDePago;
    private String direccionDeEnvio;

    public Clientes() {
    }

    public Clientes(ParDeZapatos articulosComprados, String formaDePago, String direccionDeEnvio) {
        this.articulosComprados = articulosComprados;
        this.formaDePago = formaDePago;
        this.direccionDeEnvio = direccionDeEnvio;
    }

    public Clientes(String nombre, String apellido, int dni, String mail, ParDeZapatos articulosComprados, String formaDePago, String direccionDeEnvio) {
        super(nombre, apellido, dni, mail);
        this.articulosComprados = articulosComprados;
        this.formaDePago = formaDePago;
        this.direccionDeEnvio = direccionDeEnvio;
    }



    public ParDeZapatos getArticulosComprados() {
        return articulosComprados;
    }

    public void setArticulosComprados(ParDeZapatos articulosComprados) {
        this.articulosComprados = articulosComprados;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public String getDireccionDeEnvio() {
        return direccionDeEnvio;
    }

    public void setDireccionDeEnvio(String direccionDeEnvio) {
        this.direccionDeEnvio = direccionDeEnvio;
    }

    @Override
    public String toString() {
        return "Clientes:" + " " + getNombre()+ " "+  getApellido()+ " mail: " + getMail()+ "  dni "+  getDni()+
                "  articulosComprados: " + articulosComprados + '\'' +
                ", formaDePago='" + formaDePago + '\'' +
                ", direccionDeEnvio='" + direccionDeEnvio + '\'' ;
    }
}
