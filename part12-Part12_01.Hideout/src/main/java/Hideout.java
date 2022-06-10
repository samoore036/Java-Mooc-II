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
public class Hideout<T> {
    private ArrayList<T> hideout = new ArrayList<>();
    
    public void putIntoHideout(T toHide) {
        if (this.hideout.size() == 1) {
            this.takeFromHideout();
            this.hideout.add(toHide);
        } else {
            this.hideout.add(toHide);
        }
    }
    
    public T takeFromHideout() {
        if (this.hideout.isEmpty()) {
            return null;
        } else {
            T object = this.hideout.get(0);
            this.hideout.removeAll(this.hideout);
            return object;
        }
    }
    
    public boolean isInHideout() {
        if (this.hideout.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
