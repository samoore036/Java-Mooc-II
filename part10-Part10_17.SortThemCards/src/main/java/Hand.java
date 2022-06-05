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
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand = new ArrayList<>();
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        this.hand.forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue);
        Collections.sort(this.hand, comparator);            
    }
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);
        Collections.sort(this.hand,comparator);
    }

    @Override
    public int compareTo(Hand hand) {
        int thisHand = this.hand.stream()
                .mapToInt(c -> c.getValue())
                .sum();
        int otherHand = hand.hand.stream()
                .mapToInt(c -> c.getValue())
                .sum();
        return thisHand - otherHand;
    }
    
    
}
