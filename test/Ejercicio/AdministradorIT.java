/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NathalieAyalaSantana
 */
public class AdministradorIT {
    
    public AdministradorIT() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Administrador.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Administrador A = new Administrador();
        A.add(77);
        assertTrue(A.get(0)==77);
    }

    /**
     * Test of size method, of class Administrador.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Administrador A = new Administrador();
        assertTrue(A.size()==0);
    }

    /**
     * Test of isEmpty method, of class Administrador.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Administrador A = new Administrador();
        assertTrue(A.isEmpty()==true);
    }

    /**
     * Test of get method, of class Administrador.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Administrador A = new Administrador();
        A.add(77);
        assertTrue(A.get(0)==77);
    }

    /**
     * Test of remove method, of class Administrador.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Administrador A = new Administrador();
        A.add(77);
        A.add(99);
        A.add(25);
        A.add(33);
        A.remove(2);
        assertTrue(A.size()==3 && A.get(3)==33);
    }
    
}
