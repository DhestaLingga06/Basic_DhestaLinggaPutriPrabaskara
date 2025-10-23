package looping2;

public class WhileLoopNested {

    public String getTriangle(int max) {
        StringBuilder sb = new StringBuilder();
        int i = 1;

        while (i <= max) {
            int j = 1;
            while (j <= i) {
                sb.append("+");
                j++;   
            }

            if (i < max) {
                sb.append("\n"); 
            }

            i++;
        }

        return sb.toString();
    }      
}