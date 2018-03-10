/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author KATHERINE
 */
public class Ventas {
//    4.	Ventas: Contiene el total de la venta de una factura y fecha de la venta.
    private double total_venta;
    private String fecha;

    public Ventas() {
    }

    public Ventas(double total_venta, String fecha) {
        this.total_venta = total_venta;
        this.fecha = fecha;
    }

   

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

    @Override
    public String toString() {
        return "Ventas{" + "total_venta=" + total_venta + ", fecha=" + fecha + '}';
    }
    
     public void guardar(String texto) throws IOException{
           File archivo=null;
           FileWriter fw=null;//este es el canal
           BufferedWriter bw=null;
           try {
            archivo=new File("./ventas.txt");
            //Salida txt en el home de la aplicacion
            fw=new FileWriter(archivo,true);//si el archivo no existe se crEa. si existe hay dos opciones-: sobreescribirlo o agregarlo
            //si es false crea un override, si quiero eliminar lo pongo en falso
            bw =new BufferedWriter(fw);
           
            //Esto lo escribe en el archivo
            bw.write(texto);
            bw.write("\n");
            //pasar de la ram a la rom
            bw.flush();//pasa el contenido del buffer de la ram a la memoria rom
            
        } catch (Exception e) {
        }
           bw.close();
           fw.close();
     }
//       
}
