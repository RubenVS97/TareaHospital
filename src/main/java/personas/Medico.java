/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author ruben
 */
public class Medico extends Empleado{
    
    private String especialidad;
    
    public void tratarPaciente(Paciente paciente, String medicina){
        System.out.println("El médico " + this.getApellido() + " ha mandado al paciente " + paciente.getApellido() + " la medicina" + medicina);
    }
    
    public double calcularIRPF(){
        if(especialidad.equalsIgnoreCase("cirugía")){
            this.setSalario(this.getSalario()*0.25);
        }else{
            this.setSalario(this.getSalario()*0.235);
        }
        return this.getSalario();
    }
    
}
