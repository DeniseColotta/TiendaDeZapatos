package model;

public class ParDeZapatos {
    private int talle;
    private String color;
    private String modelo;
    private int precio;
    private boolean disponible;



    public ParDeZapatos() {
    }

    public ParDeZapatos(int talle, String color, String modelo, int precio, boolean disponible) {
        this.talle = talle;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.disponible=disponible;

    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isdisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponibilidad) {
        this.disponible = disponibilidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ParDeZapatos{" +
                "talle=" + talle +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
               " disponible: " + disponible+
                '}';
    }
}
