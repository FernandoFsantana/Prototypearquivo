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
public class MotorolaPrototype extends CelularPrototype{

    
    protected MotorolaPrototype(MotorolaPrototype motorolaPrototype) {
        this.valorCompra = motorolaPrototype.getValorCompra();
    }

   
    public MotorolaPrototype() {
        valorCompra = 0.0;
    }
    
    @Override
    public String exibirInfo() {
              return "Modelo: moto G\n Motorola: Moto g\n" + "Valor: R$"
                + getValorCompra();
    }

    @Override
    public CelularPrototype clonar() {
            return new MotorolaPrototype(this); 
    }
    
}
