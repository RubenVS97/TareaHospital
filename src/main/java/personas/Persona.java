/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;

/**
 *
 * @author ruben
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private Nif nif;

    public Persona(String nombre, String apellido, Nif nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }

    public Persona() {
    }

    public abstract void renovarNif(LocalDate fechaSolicitud);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

}
