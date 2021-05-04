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
public  abstract class Persona {
protected String Edad;
protected int Sexo;

    public abstract void Edad(int Edad);
    public abstract void Sexo(String Sexo);

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public int getSexo() {
        return Sexo;
    }

    public void setSexo(int Sexo) {
        this.Sexo = Sexo;
    }

    
    

}
