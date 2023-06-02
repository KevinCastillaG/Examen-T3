/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author kevin
 */
public class Ropa extends Producto{

    private String talla;
    private String tipoTela;
    /**
     * @return the talla
     */
    public String getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * @return the tipoTela
     */
    public String getTipoTela() {
        return tipoTela;
    }

    /**
     * @param tipoTela the tipoTela to set
     */
    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }
    

    public Ropa(String nombre, double precio, String talla, String tipoTela) {
        super(nombre, precio);
        this.talla = talla;
        this.tipoTela = tipoTela;
    }
    
}
