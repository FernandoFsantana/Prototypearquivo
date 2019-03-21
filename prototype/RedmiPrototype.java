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
public class RedmiPrototype extends CelularPrototype{
    
    
    
    protected RedmiPrototype(RedmiPrototype redmiPrototype) {
        this.valorCompra = redmiPrototype.getValorCompra();
    }

   
    public RedmiPrototype() {
        valorCompra = 0.0;
    }
    



    @Override
    public String exibirInfo() {
        return "Modelo: Redmi\nxiaome: xiaomi\n" + "Valor: R$"
                + getValorCompra();
    }

    @Override
    public CelularPrototype clonar() {
        return new RedmiPrototype(this);
    }
    
}
