/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexitosa;

/**
 *
 * @author NathalieAyalaSantana
 */
public class Usuario 
{
    private String nombre;
    private String apellidos;
    private String identificacion;
    private String email;
    private String celular;

    public Usuario(String nombre, String apellidos, String identificacion, String email, String celular) 
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
    }

    public Usuario() 
    {
        this.nombre = "";
        this.apellidos = "";
        this.identificacion = "";
        this.email = "";
        this.celular = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    
    
    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }
    
    
    
}

