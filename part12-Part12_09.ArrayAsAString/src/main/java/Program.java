
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] matrix = {
            {1},
            {2,2},
            {3,3,3},
            {4,4,4,4}
        };
        System.out.println(arrayAsString(matrix));
        
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int[] i : array) {
            for (int j : i) {
                sb.append(j);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
