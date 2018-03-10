/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_lab6;

/**
 *
 * @author KATHERINE
 */
public class Comidas extends Productos{
    //Comida: contiene qué tipo de comida (donuts, sándwich, etc.).
    private String tipo_comida;

    public Comidas() {
    }

    public Comidas(String tipo_comida, double precio_costo, double precio_venta, String nombre) {
        super(precio_costo, precio_venta, nombre);
        this.tipo_comida = tipo_comida;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    @Override
    public String toString() {
        return tipo_comida;
    }
    
}
