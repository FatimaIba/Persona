
import persona.Administrador;
import persona.Cliente;
import persona.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fatii
 */
public class Main {
    public static void main(String[] args){
    Usuario usuario = new Usuario();
    Usuario.Edad("19");
    usuario.Sexo("Femenino");
    usuario.Cuenta("452");
    usuario.Telefono("4761097093");
    
    System.out.println("-----------------");
    
    Cliente cliente = new Cliente();
    cliente.Edad("25");
    cliente.Sexo("Masculino");
    cliente.Pago("Puntual");
    cliente.Tarjeta("4524550");
    
     System.out.println("-----------------");
    Administrador administrador = new Administrador();
    administrador.Edad("54");
    administrador.Sexo("Femenino");
    administrador.correo("laura2121@gmail.com");
    administrador.Especialidad("Administrador de Mercados");
    
    
    
    }
}
