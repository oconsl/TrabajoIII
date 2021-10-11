/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;
import autores.modelos.Alumno;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import idiomas.modelos.Idioma;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import grupos.vistas.VentanaAMGrupo;
import idiomas.vistas.VentanaAIdioma;
import lugares.vistas.VentanaALugar;
import palabrasclaves.vistas.VentanaAPalabraClave;
import tipos.vistas.VentanaATipo;
/**
 *
 * @author Otros
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        /*ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Idioma> idiomas = new ArrayList<>();
        ArrayList<Lugar> lugares = new ArrayList<>();
        ArrayList<PalabraClave> palabrasclaves = new ArrayList<>();
        ArrayList<Tipo> tipos = new ArrayList<>();
        ArrayList<Grupo> grupos = new ArrayList<>();
        
        Alumno alumno1 = new Alumno(39111222,"Perez","Agustin","1234","1501111");
        Alumno alumno2 = new Alumno(40333222,"Lopez","Lucas","0002","1504422");
        Alumno alumno3 = new Alumno(39444222,"Gerez","Pablo","1233","1503333");
        Alumno alumno4 = new Alumno(40555222,"Rodriguez","Federico","0000","1402223");
        Alumno alumno5 = new Alumno(38111444,"Martinez","Jose","4444","1409921");
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);

        Profesor profesor1 = new Profesor(22000333,"Dominguez","Fernando","1112","JTP");
        Profesor profesor2 = new Profesor(21432756,"Paez","Maximiliano","4442","ADG");
        Profesor profesor3 = new Profesor(22645212,"Diaz","Santiago","3003","Adjunto");
        Profesor profesor4 = new Profesor(24333112,"Cardozo","Juan","4414","Titular");
        Profesor profesor5 = new Profesor(18888444,"Martel","Lucas","9993","Asociado");
        profesores.add(profesor1);
        profesores.add(profesor2);
        profesores.add(profesor3);
        profesores.add(profesor4);
        profesores.add(profesor5);
        
        Idioma idioma1 = new Idioma("Frances");
        Idioma idioma2 = new Idioma("Ingles");
        Idioma idioma3 = new Idioma("Español");
        Idioma idioma4 = new Idioma("Portugues");
        Idioma idioma5 = new Idioma("Aleman");
        idiomas.add(idioma1);
        idiomas.add(idioma2);
        idiomas.add(idioma3);
        idiomas.add(idioma4);
        idiomas.add(idioma5);
        
        Lugar lugar1 = new Lugar("Facultad");
        Lugar lugar2 = new Lugar("Congreso");
        Lugar lugar3 = new Lugar("Libro");
        Lugar lugar4 = new Lugar("Revista cientifica");
        Lugar lugar5 = new Lugar("Internet");
        lugares.add(lugar1);
        lugares.add(lugar2);
        lugares.add(lugar3);
        lugares.add(lugar4);
        lugares.add(lugar5);
        
        PalabraClave palabraClave1 = new PalabraClave("Electronica");
        PalabraClave palabraClave2 = new PalabraClave("Progrmacion");
        PalabraClave palabraClave3 = new PalabraClave("Sintaxis");
        PalabraClave palabraClave4 = new PalabraClave("Tecnologia");
        PalabraClave palabraClave5 = new PalabraClave("Futuro");
        palabrasclaves.add(palabraClave1);
        palabrasclaves.add(palabraClave2);
        palabrasclaves.add(palabraClave3);
        palabrasclaves.add(palabraClave4);
        palabrasclaves.add(palabraClave5);
        
        Tipo tipo1 = new Tipo("Libro");
        Tipo tipo2 = new Tipo("Trabajo de congreso");
        Tipo tipo3 = new Tipo("Pasantia");
        Tipo tipo4 = new Tipo("Tesis");
        Tipo tipo5 = new Tipo("Capitulo de libro");
        tipos.add(tipo1);
        tipos.add(tipo2);
        tipos.add(tipo3);
        tipos.add(tipo4);
        tipos.add(tipo5);
        
        Grupo grupo1 = new Grupo("A","Descripcion grupo 1");
        Grupo grupo2 = new Grupo("B","Descripcion grupo 2");
        Grupo grupo3 = new Grupo("C","Descripcion grupo 3");
        Grupo grupo4 = new Grupo("D","Descripcion grupo 4");
        Grupo grupo5 = new Grupo("E","Descripcion grupo 5");
        grupos.add(grupo1);
        grupos.add(grupo2);
        grupos.add(grupo3);
        grupos.add(grupo4);
        grupos.add(grupo5);
        
        for(Alumno a : alumnos)
            a.mostrar();
        
        for(Profesor p : profesores)
            p.mostrar();
        
        for(Idioma i : idiomas)
            System.out.println(i);
        
        for(Lugar l : lugares)
            System.out.println(l);
        
        for(PalabraClave pc : palabrasclaves)
            System.out.println(pc);
        
        for(Tipo t : tipos)
            System.out.println(t);
        
        for(Grupo g : grupos)
            g.mostrar();
        
        //Modificaciones leves
        alumno3.asignarDni(1000000000);
        profesor1.asignarCargo("AQUI SE MODIFICO EL CARGO");
        tipo4.asignarNombre("SOY UN NUEVO TIPO");
        
        for(Alumno a : alumnos)
            a.mostrar();
        
        for(Profesor p : profesores)
            p.mostrar();
        
        for(Idioma i : idiomas)
            System.out.println(i);
        
        for(Lugar l : lugares)
            System.out.println(l);
        
        for(PalabraClave pc : palabrasclaves)
            System.out.println(pc);
        
        for(Tipo t : tipos)
            System.out.println(t);
        
        for(Grupo g : grupos)
            g.mostrar();*/
        VentanaAMGrupo ventanaGrupo = new VentanaAMGrupo(null); //se instancia la ventana
        ventanaGrupo.setLocationRelativeTo(null); //se centra la ventana
        ventanaGrupo.setVisible(true); //se hace visible la ventana
        
        VentanaAMAlumno ventanaAlumno = new VentanaAMAlumno(null); //se instancia la ventana
        ventanaAlumno.setLocationRelativeTo(null); //se centra la ventana
        ventanaAlumno.setVisible(true); //se hace visible la ventana
        
        VentanaAMProfesor ventanaProfesor = new VentanaAMProfesor(null); //se instancia la ventana
        ventanaProfesor.setLocationRelativeTo(null); //se centra la ventana
        ventanaProfesor.setVisible(true); //se hace visible la ventana        
        
        VentanaAIdioma ventanaIdioma = new VentanaAIdioma(null); //se instancia la ventana
        ventanaIdioma.setLocationRelativeTo(null); //se centra la ventana
        ventanaIdioma.setVisible(true); //se hace visible la ventana                
        
        VentanaALugar ventanaLugar = new VentanaALugar(null); //se instancia la ventana
        ventanaLugar.setLocationRelativeTo(null); //se centra la ventana
        ventanaLugar.setVisible(true); //se hace visible la ventana                        
        
        VentanaAPalabraClave ventanaPalabraClave = new VentanaAPalabraClave(null); //se instancia la ventana
        ventanaPalabraClave.setLocationRelativeTo(null); //se centra la ventana
        ventanaPalabraClave.setVisible(true); //se hace visible la ventana                                
        
        VentanaATipo ventanaTipo = new VentanaATipo(null); //se instancia la ventana
        ventanaTipo.setLocationRelativeTo(null); //se centra la ventana
        ventanaTipo.setVisible(true); //se hace visible la ventana   

    }
}
