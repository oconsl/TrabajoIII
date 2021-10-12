/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author Otros
 */
public class Alumno {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private String cx;
    
    public Alumno(int dni,String apellidos,String nombres,String clave,String cx) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cx = cx;
    }
    
    public void mostrar(){
        System.out.println("Apellidos y nombres: " + apellidos + ", " + nombres + "\n DNI: " + dni + "\n Clave: " + clave + "\n CX: " + cx);
    }
    
    public void asignarDni(int dni){
        this.dni = dni;
    }
    
    public void asignarApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public void asignarNombres(String nombres){
        this.nombres = nombres;
    }
    
    public void asignarClave(String clave){
        this.clave = clave;
    }
    
    public void asignarCx(String cx){
        this.cx = cx;
    }
    
    public int verDni(){
        return dni;
    }
    
    public String verNombres(){
        return nombres;
    }
    
    public String verApellidos(){
        return apellidos;
    }
    
    public String verClave(){
        return clave;
    }
    
    public String verCx(){
        return cx;
    }
}