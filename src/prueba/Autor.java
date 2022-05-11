
package prueba;

import java.time.LocalDate;

public class Autor {
    private int autor;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;

    public Autor() {}
    
    public Autor(String apellido, String nombre, LocalDate fechaNac) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public getAutor(){
        return autor;
    }

    public void setAutor(int Autor) {
        this.Autor = idAutor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Datos del Autor\napellido=" + apellido + ", nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
    }
    
}
