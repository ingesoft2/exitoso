/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexitosa;

import java.util.Vector;

import javax.swing.JOptionPane;

import usuario.GestorUsuario;
import usuario.Usuario;

/**
 *
 * @author NathalieAyalaSantana
 */
public class PracticaExitosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hola
        //Soy Nats desde un branch diferente al master
    }
    
    
    private Vector<Usuario> usuarios;
	private String nombre;
	private String apellidos;
	private String identificacion;
	private String email;
	private String celular;	

	
	//jkskskhusd
	


	public GestorUsuario() 
	{
		this.crearUsuario();
		this.EliminarUsuario();
	}

	public static void main(String[] args) 
	{
		new GestorUsuario();
	}
	
	
	public void crearUsuario()
	{
		nombre = JOptionPane.showInputDialog("ingrese el nombre");
		apellidos = JOptionPane.showInputDialog("ingrese el apellidos");
		identificacion = JOptionPane.showInputDialog("ingrese el identificacion");
		email = JOptionPane.showInputDialog("ingrese el email");
		celular = JOptionPane.showInputDialog("ingrese el celular");
		usuarios = new Vector<Usuario>();
		Usuario u = new Usuario(nombre, apellidos, identificacion, email, celular);
		
		usuarios.add(u);
		System.out.println(usuarios.get(0));
		
	}
	
	
	
	// se eliminar el usuario buscando el usuario 
	public void EliminarUsuario()
	{
		identificacion = JOptionPane.showInputDialog("ingrese la identificacin");

		for(int i = 0; i < usuarios.size(); i++)
		{
			if(usuarios.get(i).getIdentificacion().equals(identificacion))
			{
				usuarios.remove(i);
				usuarios.get(i);
			}
		}
		
	}

    
}
