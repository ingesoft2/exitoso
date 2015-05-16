/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author NathalieAyalaSantana
 * Ejercicio en clase
 * 15 de Mayo de 2015
 */
public class Administrador 
{
    int tamano;
    int[] arreglo;

    public Administrador() 
    {
        tamano=0;
        this.arreglo = new int[100];
    }
    
    public void add(int num)
    {
        arreglo[tamano]=num;
        tamano++;
    }
    
    public int size()
    {
        return tamano;
    }
    
    public boolean isEmpty()
    {
        if(tamano==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int get(int pos)
    {
        return arreglo[pos];
         
    }
    
    public void remove(int pos)
    {
        arreglo[pos-1]=arreglo[tamano];
        arreglo[tamano]=0;
        tamano--;
    }
    
    
    
}
