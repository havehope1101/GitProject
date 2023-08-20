

public class test {

        public static int minPointsToBuildString(int A, int B, String X) {
            int n = X.length();
            int[][] dp = new int[n + 1][A + 1];

            // Initialize the DP table
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= A; j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
            dp[0][0] = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= A; j++) {
                    // Operation 1: Add a character to the end
                    if (j + 1 <= A) {
                        dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j] + 1);
                    }

                    // Operation 2: Copy a substring
                    int len = 0;
                    for (int k = i; k >= 0; k--) {
                        len++;
                        if (len > B) break;

                        dp[i + 1][j] = Math.min(dp[i + 1][j], dp[k][j] + len);
                    }
                }
            }

            int minPoints = Integer.MAX_VALUE;
            for (int j = 0; j <= A; j++) {
                minPoints = Math.min(minPoints, dp[n][j]);
            }

            return minPoints;
        }

        public static void main(String[] args) {
            int A = 3;
            int B = 2;
            String X = "abcabc";
            int result = minPointsToBuildString(A, B, X);
            System.out.println("Minimum points needed: " + result);
        }
    }