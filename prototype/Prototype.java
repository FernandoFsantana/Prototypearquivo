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
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    RedmiPrototype redmi = new RedmiPrototype(); 
    MotorolaPrototype motorola = new MotorolaPrototype();
 
    CelularPrototype redmiNovo = redmi.clonar();
    redmiNovo.setValorCompra(27900.0);
    CelularPrototype redmiUsado = redmi.clonar();
    redmiUsado.setValorCompra(21000.0);
    
    
    CelularPrototype motorolanovo = motorola.clonar();
    motorolanovo.setValorCompra(50000.0);
    CelularPrototype motorolausado = motorola.clonar();
    motorolausado.setValorCompra(40000.0);
 
    System.out.println(redmiNovo.exibirInfo());
    System.out.println(redmiUsado.exibirInfo());
    
    
        System.out.println(motorolanovo.exibirInfo());
        System.out.println(motorolausado.exibirInfo());
        
        
    }
    
}
