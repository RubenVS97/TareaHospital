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
public class Medico extends Empleado {

    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellido, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.especialidad = especialidad;
    }

    public Medico(String especialidad, String numeroSeguridadSocial, double salario) {
        super(numeroSeguridadSocial, salario);
        this.especialidad = especialidad;
    }

    public Medico(String especialidad) {
        this.especialidad = especialidad;
    }

    public Medico() {
    }

    public void renovarNif(LocalDate fechaSolicitud) {
        System.out.println(this.getNif().renovar(fechaSolicitud));
    }

    public void tratarPaciente(Paciente paciente, String medicina) {

        System.out.println("El médico " + this.getApellido() + " ha mandado al paciente " + paciente.getApellido() + " la medicina" + medicina);
    }

    public double calcularIRPF() {
        if (especialidad.equalsIgnoreCase("cirugia")) {
            this.setSalario(this.getSalario() * 0.25);
        } else {
            this.setSalario(this.getSalario() * 0.235);
        }
        return this.getSalario();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
