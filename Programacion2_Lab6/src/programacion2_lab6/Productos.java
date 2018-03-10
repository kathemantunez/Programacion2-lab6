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
public class Productos {
//   1.	Producto: Este posee el precio de costo, precio de venta (este ya incluye el ISV) y el nombre. Los productos pueden ser:
//a.	Bebida: contiene el estado (Caliente, Helado, etc.), tamaño y tipo (café, té verde, etc.).
//b.	Comida: contiene qué tipo de comida (donuts, sándwich, etc.).
    
    private double precio_costo;
    private double precio_venta;//IVS
    private String nombre;

    public Productos() {
    }

    public Productos(double precio_costo, double precio_venta, String nombre) {
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.nombre = nombre;
    }

    public double getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(double precio_costo) {
        this.precio_costo = precio_costo;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productos{" + "precio_costo=" + precio_costo + ", precio_venta=" + precio_venta + ", nombre=" + nombre + '}';
    }
    
    public double IVS(double venta){
         double impuesto=0, subtotal=0;
         subtotal=venta*1.15;
         
         
        return subtotal;
    }
    public double impuesto(double subtotal){
        double imp=subtotal*0.15;
        return imp;
    }
    
    

}
