/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.modelos;

/**
 *
 * @author Otros
 */
public class Idioma {
    private String nombre;
    
    public Idioma(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    public void asignarNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String verNombre(){
        return nombre;
    }
}
