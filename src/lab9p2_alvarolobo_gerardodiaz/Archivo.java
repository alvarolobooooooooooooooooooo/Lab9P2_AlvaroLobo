
package lab9p2_alvarolobo_gerardodiaz;

import java.util.Random;

public class Archivo {
   private String nombre;
   private String link;
   private String extension;
   private int tamano;

    public Archivo(String nombre, String link, String extension, int tamano) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", link=" + link + ", extension=" + extension + ", tamano=" + tamano + '}';
    }
    
    
    
    
    public String generarLink(){
        Random r = new Random();
        int random = 10000 + r.nextInt(99999);
        link = "dive.google.com/"+random;
        return link;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
