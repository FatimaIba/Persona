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
public class Administrador extends Persona {

    protected String correo;
    protected String Especialidad;

    public Administrador(int Edad, String Sexo) {

    }

    public Administrador() {
    }

    public void correo(String string) {
        System.out.println("Correo: laura2121@gmail.com");
    }

    public void Especialidad(String string) {
        System.out.println("Especialidad:  Administrador de Mercados");
    }

    @Override
    public void Edad(int Edad) {
        System.out.println("Edad: 54");
    }

    @Override
    public void Sexo(String Sexo) {
        System.out.println("Sexo: Masculino");
    }

    public void Edad(String string) {
        System.out.println("Edad: 54");
    }

}
