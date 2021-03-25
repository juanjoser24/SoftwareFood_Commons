/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.commons.domain;

/**
 *
 * @author braia
 */
public class Restaurant {

    private String nombre;
    private int nit;

    public Restaurant() {
    }

    public Restaurant(String nombre, int nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

}
