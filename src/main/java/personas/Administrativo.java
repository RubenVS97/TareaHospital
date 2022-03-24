/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author ruben
 */
public class Administrativo extends Empleado{
    
    private Grupo grupo;
    
    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellido, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.grupo = grupo;
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario) {
        super(numeroSeguridadSocial, salario);
        this.grupo = grupo;
    }
    
    public void registrarDocumento(String nombreDoc){
        
        System.out.println("El documento lo ha administrado " + this.getApellido() + " " + this.getApellido() + " " + nombreDoc 
                + "" + nombreDoc.hashCode());
        
    }
    
    public double calcularIrpf(){
        if(this.grupo == grupo.C){
            
        }
        
        
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
