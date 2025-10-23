package array1;

public class Array1D {

    public String getArrayInfo(int[] codeInput) {
        StringBuilder result = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < codeInput.length; i++) {
            result.append(codeInput[i]);
            if (i < codeInput.length - 1) {
                result.append(" ");
            }
            sum += codeInput[i];
        }

        result.append("\nSum: ").append(sum);

        return result.toString();
    }

    public static void main(String[] args) {
        Array1D array1d = new Array1D();
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println(array1d.getArrayInfo(arr));
    }
}