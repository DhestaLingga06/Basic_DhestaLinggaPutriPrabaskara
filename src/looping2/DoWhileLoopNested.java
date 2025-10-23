package looping2;

public class DoWhileLoopNested {
     
        public String getNumberTriangle(int max) {
            StringBuilder sb = new StringBuilder();
            int i = 1;

            do {
                int j = 1;
                do {
                    sb.append(j);
                    j++;
                } while (j <= i);

                if (i < max) {
                    sb.append("\n");
                }

                i++;
            } while (i <= max);

            return sb.toString();
        }
}