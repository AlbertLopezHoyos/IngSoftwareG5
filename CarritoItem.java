package Modelo;

import Vista.*;

public class CarritoItem {
    private Articulo articulo;
    private int cantidad;

    public CarritoItem(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return cantidad * articulo.getPrecioUnitario();
    }
}