package Modelo;

import Vista.*;

public class Articulo {
    private String nombre;
    private double precioUnitario;

    public Articulo(String nombre, double precioUnitario) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}