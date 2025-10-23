package looping2;

public class ForLoopNested {

    public String getGrid(int max) {
        StringBuilder sb = new StringBuilder();

        for (int row = 1; row <= max; row++) {
            for(int col = 1; col <= max; col++) {
                sb.append("Row ").append(row).append(" Col ").append(col);
                
                if (!(row == max && col == max)) {
                    sb.append("\n");
                }
            }
        }

        return sb.toString();
    }
}