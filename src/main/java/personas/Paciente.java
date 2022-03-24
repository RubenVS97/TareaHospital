/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author ruben
 */
public class Paciente extends Persona{
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
    
    public void tomarMedicina(){
        
    }
    
}
