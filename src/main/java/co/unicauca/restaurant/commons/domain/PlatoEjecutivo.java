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
public class PlatoEjecutivo extends Plato {

    private DiaEnum diaSemana;
    /**
     * una preparacion de tipo entrada
     */
    private String entrada;
    /**
     * una preparacion de tipo principio
     */
    private String principio;
    /**
     * una preparacion de tipo carne, pollo, res etc
     */
    private String proteina;
    /**
     * una preparacion de tipo bebida
     */
    private String bebida;

    private int menuId;

    public PlatoEjecutivo() {
    }

    /**
     * constructor parametrizado para crear un plato
     *
     * @param id
     * @param entrada
     * @param principio
     * @param descripcion
     * @param dia
     * @param proteina
     * @param bebida
     * @param nombre el nombre que tendra el plato
     * @param precio el precio que tendra el plato
     * @param menuId el id del menu al que pertenece
     */
    public PlatoEjecutivo(int id, String nombre, double precio, String descripcion, DiaEnum dia, String entrada, String principio, String proteina, String bebida, int menuId) {
        super(id, nombre, precio, descripcion);
        this.diaSemana = dia;
        this.entrada = entrada;
        this.principio = principio;
        this.proteina = proteina;
        this.bebida = bebida;
        this.menuId = menuId;
    }

    public DiaEnum getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaEnum diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getPrincipio() {
        return principio;
    }

    public void setPrincipio(String principio) {
        this.principio = principio;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
}
