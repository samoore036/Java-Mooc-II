
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x = 0;
        int y = 0;
        if (size %2 != 0) {
            x = square.getWidth()/2;
            square.placeValue(x, y, 1);
            for (int i = 2; i <= size*size; i++) {
                int currentRow = x;
                int currentColumn = y;
                x += 1;
                y -= 1;
                if (x >= square.getWidth()) {
                    x = 0;
                }
                if (y < 0) {
                    y = square.getHeight()-1;
                }
                if (square.readValue(x, y) > 0) {
                    y = currentColumn+1;
                    x = currentRow;
                }
                square.placeValue(x, y, i);  
            }
        }
    return square; 
    }
}
    //square size 3
    //{8,1,6} 1 = 0,1/ 6 = 0,2/ 8 = 0,0
    //{3,5,7} 3 = 1,0/ 5 = 1,1/ 7 = 1,2 
    //{4,9,2} 2 = 2,2/ 4 = 2,0/ 9 = 2,1
    //(0,1),(2,2),(1,0),(2,0),(1,1),(0,2),(1,2),(0,0),(2,1)
