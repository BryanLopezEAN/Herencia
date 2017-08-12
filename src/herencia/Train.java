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
public class Train extends Machine{
    
    public void destination(){
        System.out.println("Nos dirigimos a Londres");
    }

    @Override
    public void start() {
        super.start();
    }
    
    @Override
    public void stop() {
        super.stop();
    }
    
}
