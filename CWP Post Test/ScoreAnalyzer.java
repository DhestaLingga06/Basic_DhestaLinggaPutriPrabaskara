public class ScoreAnalyzer {

    public String classifyResult(int[] nilaiArray) {
        int totalNilai = 0;

        for (int n : nilaiArray) {
            if ( n < 0 || n > 100) {
                n = 0;
            }
            totalNilai += n;
        }

        double rataRata = (double) totalNilai / nilaiArray.length;

        if (rataRata >= 85) {
            return "Excellent";
        } else if (rataRata >= 70) {
            return "Good";
        } else if (rataRata >= 50) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}    