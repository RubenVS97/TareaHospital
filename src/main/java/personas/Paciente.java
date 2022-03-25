/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author ruben
 */
public class Paciente extends Persona {

    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellido, Nif nif) {
        super(nombre, apellido, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente() {
    }

    public void renovarNif(LocalDate fechaSolicitud) {
        System.out.println(this.getNif().renovar(fechaSolicitud));
    }

    public void tomarMedicina() {
        Random r = new Random();
        String resultado = r.nextBoolean() ? "el paciente se ha curado" : "el paciente no se ha curado";
        System.out.println(resultado);
    }

}
