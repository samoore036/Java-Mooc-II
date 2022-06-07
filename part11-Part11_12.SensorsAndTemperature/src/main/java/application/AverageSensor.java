/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mooshahe
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> control = new ArrayList<>();
    private ArrayList<Integer> readings = new ArrayList<>();
    
    public void addSensor(Sensor toAdd) {
        control.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        int count = 0;
        for (Sensor s : this.control) {
            if (s.isOn() == true) {
                count++;
            }
        }
        if (count == control.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setOn() {
        for (Sensor s : this.control) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s : this.control) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (this.isOn() == false || this.control.isEmpty()) {
            throw new IllegalStateException("The sensor is either off or no sensors have been added.");
        } else {
            double avg = this.control.stream().mapToInt(sensor -> sensor.read())
                    .average().getAsDouble();
            this.readings.add((int)avg);
            return (int) avg;
        }
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
}
