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
public class Cliente  extends Persona{
    protected boolean Tarjeta;
    protected String Pago;
    
    public Cliente(int Edad, String Sexo) {
    }

    public Cliente() {
    }
     public void Tarjeta(String string) {
        System.out.println("Tarjeta: 4524550");
    }

    public void Pago(String string) {
        System.out.println("Pago: puntual");
        
    }

    @Override
    public void Edad(int Edad) {
        System.out.println("Edad: 25");
    
    }
    @Override
    public void Sexo(String Sexo) {
        System.out.println("Sexo: Masculino");
    }

    public void Edad(String string) {
        System.out.println("Edad: 25");
    }
    
}
