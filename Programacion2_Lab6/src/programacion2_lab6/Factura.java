/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_lab6;

import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class Factura {
//    : Este contiene la lista de productos, correo electrónico, nombre del
//            cliente, RTN, CAI y fecha. Aquí deberán ir el método de impresión de la factura en un archivo de texto.
    private ArrayList<Productos> productos=new ArrayList();
    private String correo;
    private String nombre_cliente;
    private String RTN;
    private String CAI;
    private String fecha;

    public Factura(String correo, String nombre_cliente, String RTN, String CAI, String fecha) {
        this.correo = correo;
        this.nombre_cliente = nombre_cliente;
        this.RTN = RTN;
        this.CAI = CAI;
        this.fecha = fecha;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getCAI() {
        return CAI;
    }

    public void setCAI(String CAI) {
        this.CAI = CAI;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Factura{" + "productos=" + productos + ", correo=" + correo + ", nombre_cliente=" + nombre_cliente + ", RTN=" + RTN + ", CAI=" + CAI + ", fecha=" + fecha + '}';
    }

    public Factura() {
    }
    public String facturita(String Productos,double subtotal,double impuestos, double total){
        String fact="Factura \n"
                  + "Dunkin Donuts\n"
                  + "CAI:"+CAI+"\n"
                  + "RTN:"+RTN+"\n"
                  + "Fecha:"+fecha+"\n"
                  +"Correo:"+correo+"\n"
                  +"Cliente:"+nombre_cliente+"\n"
                  +"Productos\n"+Productos+"\n"
                  +"Sub total:"+subtotal+"\n"
                   + "Impuesto:"+impuestos+"\n"
                           + "total:"+total;
        return fact;
    }
      
}
