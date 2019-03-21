/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author fernando
 */
public abstract class CelularPrototype {
    protected double valorCompra;
 
    public abstract String exibirInfo();
 
    public abstract CelularPrototype clonar();
 
    public double getValorCompra() {
        return valorCompra;
    }
 
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    
}
