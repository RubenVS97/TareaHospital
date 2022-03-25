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
public class Administrativo extends Empleado {

    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellido, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.grupo = grupo;
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario) {
        super(numeroSeguridadSocial, salario);
        this.grupo = grupo;
    }

    @Override
    public void renovarNif(LocalDate fechaSolicitud) {
        System.out.println(this.getNif().renovar(fechaSolicitud));
    }

    public void registrarDocumento(String nombreDoc) {

        System.out.println("El documento lo ha administrado " + this.getApellido() + " " + this.getApellido() + " " + nombreDoc
                + "" + nombreDoc.hashCode());

    }

    public double calcularIRPF() {
        double resultado = 0;
        if (this.grupo == grupo.C) {
            this.setSalario(this.getSalario() * 0.175);
        } else if (this.grupo == grupo.D) {
            this.setSalario(this.getSalario() * 0.18);
        } else {
            this.setSalario(this.getSalario() * 0.185);
        }

        return this.getSalario();
    }

    public Administrativo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

}
