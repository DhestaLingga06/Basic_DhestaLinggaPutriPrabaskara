package array2;
public class Array2D {

    public String getMatrixInfo(int[][] codeInput) {
        StringBuilder output = new StringBuilder();
        int total = 0;
        int count = 0;

        for (int i = 0; i < codeInput.length; i++) {
            output.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < codeInput[i].length; j++) {
                int value = codeInput[i][j];
                total += value;
                count++;
                if (value % 2 == 0) {
                    output.append(value).append("E ");
                } else {
                    output.append(value).append("O ");
                }
            }
            output.append("\n");
        }

        double average = (double) total / count;
        output.append("Total: ").append(total).append("\n");
        output.append("Average: ").append(average);
        return output.toString();
    }

    public static void main(String[] args) {
        Array2D array2d = new Array2D();
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        System.out.println(array2d.getMatrixInfo(matrix));
    }
}