/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_lab6;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class Ingresos {
//    5.	Ingresos:
//    Contiene una lista de las ventas y la dirección del archivo. Aquí deberán ir los métodos correspondientes de abrir y guardar archivos.
    private ArrayList<Ventas> ventas=new ArrayList();
    private File direccion_archivo;

    public Ingresos(File direccion_archivo) {
        this.direccion_archivo = direccion_archivo;
    }

    public Ingresos() {
    }

    public ArrayList<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(Ventas ventas) {
        this.ventas.add(ventas);
    }

    public File getDireccion_archivo() {
        return direccion_archivo;
    }

    public void setDireccion_archivo(File direccion_archivo) {
        this.direccion_archivo = direccion_archivo;
    }

    @Override
    public String toString() {
        return "Ingresos{" + "ventas=" + ventas + ", direccion_archivo=" + direccion_archivo + '}';
    }
    
    
}
