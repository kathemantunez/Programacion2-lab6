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
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author KATHERINE
 */
public class Inventario {
    private ArrayList<Productos> productos=new ArrayList();
    private File direccion_archvo;

    public Inventario() {
    }

    public Inventario(File direccion_archvo) {
        this.direccion_archvo = direccion_archvo;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos.add(productos);
    }

    public File getDireccion_archvo() {
        return direccion_archvo;
    }

    public void setDireccion_archvo(File direccion_archvo) {
        this.direccion_archvo = direccion_archvo;
    }

    @Override
    public String toString() {
        return "Inventario{" + "productos=" + productos ;
    }
    public void Abrir(){
        
    }
    public void guardar(String texto) throws IOException{
          File archivo=null;
           FileWriter fw=null;//este es el canal
           BufferedWriter bw=null;
           try {
            archivo=new File("./inventario.txt");
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

