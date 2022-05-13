package institucion.main;

import institucion.controlador.AlumnoData;
import institucion.controlador.Conexion;
import institucion.modelo.Alumno;
import institucion.modelo.Inscripcion;
import institucion.modelo.Materia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
    ///Probando la clase alumno
        Alumno a1= new Alumno(1, "Nieves", "Antonieta", LocalDate.of(2001,8,19), true);
        Alumno a2= new Alumno(2,"Bardor", "Federico", LocalDate.of(1995,12,15), true);
        Alumno a3= new Alumno(3,"Josefina","Marta",LocalDate.of(1993, 9, 27),false);
        Alumno a4= new Alumno(4,"Galeano","Eduardo",LocalDate.of(1657,5,23),true);
        Alumno a5= new Alumno(5,"Riquelme","Luciano",LocalDate.of(1993, 10, 19),false);
        
        Materia m1= new Materia(1, "Laboratorio 1", 1, true);
        Materia m2= new Materia("Programacion WEB 2", 2, false);
        Materia m3= new Materia();
        Materia m4= new Materia();
        Materia m5= new Materia();
        
        Inscripcion in= new Inscripcion();
        in.setNota(10);
        System.out.println(in.toString());
       
        
        /*
        try {
            Conexion conexion= new Conexion(); // Permite la interaccion de las clases data con la base de datos
            AlumnoData alumnoData= new AlumnoData(conexion);
            Alumno alumno= new Alumno("Aldoñas","Nepumoceno",LocalDate.of(1989,11,31),false);
            
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Falla en la Conexion. Intentelo mas tarde"+e.getMessage());
            
        }
        */



    }
    
}
