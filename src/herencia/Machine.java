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
public class Machine {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void start(){
        System.out.println("El sistema se ha encendido");
    }
    
    public void stop(){
        System.out.println("El sistema se ha apagado");
    }
}
