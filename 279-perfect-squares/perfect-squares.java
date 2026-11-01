 class Solution {
    public int numSquares(int n) {
        while (n % 4 == 0) n /= 4;
        if (n % 8 == 7) return 4;
        int sqrt_n = (int) Math.sqrt(n);
        int[] Squares = new int[sqrt_n];
        Arrays.fill(Squares, 1);
        for (int i = 2; i <= sqrt_n; i++) Squares[i - 1] = i * i;
        if (Arrays.binarySearch(Squares, n) >= 0) return 1;
        for (int x_2 : Squares) {
            if (Arrays.binarySearch(Squares, n - x_2) >= 0) return 2;
        }
        return 3;
    }
}