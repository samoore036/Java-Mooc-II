/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mooshahe
 */
import java.util.ArrayList;
import java.util.OptionalDouble;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.removeAll(this.history);
    }
    
    public double maxValue() {
        double max = this.history.stream()
                .mapToDouble(i -> i)
                .max()
                .getAsDouble();
        return max;
    }
    
    public double minValue() {
        double min = this.history.stream() 
                .mapToDouble(i -> i)
                .min()
                .getAsDouble();
        return min;
    }
    
    public double average() {
        double avg = this.history.stream()
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        return avg;
    }
    
    public String toString() {
        return this.history.toString();
    }
}
