
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (obj instanceof Item) {
            if (this.name.equals(((Item) obj).getName())) {
                return true;
            }
        } 
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
