

public class MainProgram {

    public static void main(String[] args) {
        //you can test the program here
        Herd h = new Herd();
        h.addToHerd(new Organism(57,66));
        h.addToHerd(new Organism(73,56));
        h.addToHerd(new Organism(46,52));
        h.addToHerd(new Organism(19,107));
        System.out.println(h);
    }
}
