/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author mooshahe
 */
public class SaveableDictionary {
    private HashMap<String,String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    
    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(word -> word.split(":"))
                    .forEach(parts -> {
                        this.dictionary.put(parts[0], parts[1]);
                        this.dictionary.put(parts[1], parts[0]);
                    });
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        try{
            PrintWriter writer = new PrintWriter(this.file);
            this.toSave(writer);
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public void toSave(PrintWriter writer) {
        ArrayList<String> saved = new ArrayList<>();
        this.dictionary.keySet().forEach(word -> {
            if (saved.contains(word)) {return;}
            saved.add(word);
            saved.add(this.dictionary.get(word));
            String paired = String.format("%s:%s", word, this.dictionary.get(word));
            writer.println(paired);
        });
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
        this.dictionary.putIfAbsent(translation, word);
    }
    
    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else {
            return null;
        }
    }
    
    public void print() {
        this.dictionary.keySet().forEach(key -> System.out.println(key));
    }
    
    public void delete(String word) {
        String translation = this.dictionary.get(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }
    
    
}
