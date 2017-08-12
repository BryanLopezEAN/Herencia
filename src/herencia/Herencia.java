/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Lopez Avila
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari");
        ferrari.start();
        ferrari.running();
        ferrari.showInfo();
        ferrari.stop();
        
        System.out.println("-------------------------------------------------");
        
        Train tr = new Train();
        tr.start();
        tr.destination();
        tr.stop();
    }
    
}
