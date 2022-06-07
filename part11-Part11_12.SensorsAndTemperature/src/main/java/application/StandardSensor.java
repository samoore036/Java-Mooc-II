/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author mooshahe
 */
public class StandardSensor implements Sensor{
    final private boolean isOn = true;
    private int temperature;
    
    public StandardSensor(int temp) {
        this.temperature = temp;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        
    }

    @Override
    public void setOff() {
        
    }

    @Override
    public int read() {
        return this.temperature;
    }
    
}
