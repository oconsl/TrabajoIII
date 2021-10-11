/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Profesor;

/**
 *
 * @author Otros
 */
public class MiembroEnGrupo {
    private Profesor profesor;
    private Grupo grupo;
    private Rol rol;
    
    public MiembroEnGrupo(Profesor profesor, Grupo grupo, Rol rol){
        this.profesor = profesor;
        this.grupo = grupo;
        this.rol = rol;
    }
    
    public void asignarProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    
    public void asignarGrupo(Grupo grupo){
        this.grupo = grupo;
    }
    
    public void asignarRol(Rol rol){
        this.rol = rol;
    }
    
    public Profesor verProfesor(){
        return profesor;
    }
    
    public Grupo verGrupo(){
        return grupo;
    }
    
    public Rol verRol(){
        return rol;
    }
}
