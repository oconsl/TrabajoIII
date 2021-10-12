/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author Otros
 */
public class Publicacion {
    private String titulo;
    private MiembroEnGrupo miembroEnGrupo;
    private LocalDate fechaPublicacion;
    private Tipo tipo;
    private Idioma idioma;
    private Lugar lugar;
    private List<PalabraClave> palabrasClave;
    private String enlace;
    private String resumen;
    
    public Publicacion(String titulo,MiembroEnGrupo miembroEnGrupo,LocalDate fechaPublicacion,Tipo tipo,Idioma idioma, Lugar lugar, List<PalabraClave> palabrasClave, String enlace, String resumen) {
        this.titulo = titulo;
        this.miembroEnGrupo = miembroEnGrupo;
        this.fechaPublicacion = fechaPublicacion;
        this.tipo = tipo;
        this.idioma = idioma;
        this.lugar = lugar;
        this.palabrasClave = palabrasClave;
        this.enlace = enlace;
        this.resumen = resumen;
    }
    
    public void asignarTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void asignarMiembroEnGrupo(MiembroEnGrupo miembroEnGrupo){
        this.miembroEnGrupo = miembroEnGrupo;
    }
    
    public void asignarFecha(LocalDate fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public void asignarTipo(Tipo tipo){
        this.tipo = tipo;
    }
    
    public void asignarIdioma(Idioma idioma){
        this.idioma = idioma;
    }
    
    public void asignarLugar(Lugar lugar){
        this.lugar = lugar;
    }
    
    public void asignarPalabras(ArrayList<PalabraClave> palabrasClave){
        this.palabrasClave = palabrasClave;
    }
    
    public void asignarEnlace(String enlace){
        this.enlace = enlace;
    }
        
    public void asignarResumen(String resumen){
        this.resumen = resumen;
    }    
    
    public String verTitulo(){
        return titulo;
    }
    
    public MiembroEnGrupo verMiembroEnGrupo(){
        return miembroEnGrupo;
    }
    
    public LocalDate verFecha(){
        return fechaPublicacion;
    }
    
    public Tipo verTipo(){
        return tipo;
    }
    
    public Idioma verIdioma(){
        return idioma;
    }
    
    public Lugar verLugar(){
        return lugar;
    }
    
    public List<PalabraClave> verPalabrasClave(){
        return palabrasClave;
    }
    
    public String verEnlace(){
        return enlace;
    }
    
    public String verResumen(){
        return resumen;
    }
    
    public void mostrar(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + miembroEnGrupo.verProfesor().verApellidos() + ", " + miembroEnGrupo.verProfesor().verNombres());
        System.out.println("Grupo: " + miembroEnGrupo.verGrupo().verNombre());
        System.out.println("Rol: " + miembroEnGrupo.verRol());
        System.out.println("Fecha de publicación: " + fechaPublicacion);
        System.out.println("Tipo: " + tipo);
        System.out.println("Idioma: " + idioma);
        System.out.println("Lugar: " + lugar);
        System.out.println("Palabras claves");
        System.out.println("---------------");
        for(PalabraClave pc : palabrasClave)
            System.out.println("\t" + pc);
        System.out.println("Enlace: " + enlace);
        System.out.println("Resumen: " + resumen);
        
    }
}
