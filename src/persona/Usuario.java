/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author fatii
 */
public class Usuario extends Persona {

    private boolean cuenta;
    private int Telefono;

    public Usuario(boolean cuenta, int Telefono) {
        this.cuenta = cuenta;
        this.Telefono = Telefono;
    }

    public Usuario() {
    }

    public static void Edad(String string) {
                System.out.println("Edad: 19");

    }

    public boolean getCuenta() {
        return cuenta;
    }

    public void setCuenta(boolean Cuenta) {
        System.out.println("Cuenta: 452");
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        System.out.println("Telefono");
    }

    @Override
    public void Edad(int Edad) {
        System.out.println("Edad: 19");
    }

    @Override
    public void Sexo(String Sexo) {
        System.out.println("Sexo: Femenino");
    }

    public void getCuenta(String string) {
        
    }

    public void getSexo(String femenino) {
        
    }

    public void getEdad(String string) {
      
    }

    public void Cuenta(String string) {
        System.out.println("Cuenta: 452");
    }

    public void Telefono(String string) {
        System.out.println("Telefono: 4761097093");
        
    }

}
