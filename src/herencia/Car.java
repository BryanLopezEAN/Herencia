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
public class Car extends Machine{
    private String type;
    
    public Car(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        super.start();
    }
    
    public void running(){
        System.out.println("El auto se encuentra en movimiento");
    }
    
    public void showInfo(){
        setName(type);
        System.out.println("El nombre del auto es: " + getName());
    }

    @Override
    public void stop() {
        super.stop();
    }
    
    
}
