class Solution {
    //  using matrix exponentiation
    public int climbStairs(int n) {
        if (n==1) return 1;
        int[][] m = {{1,1},{1,0}};
        int[][] result = matrixPow(m,n);
        return result[0][0];
    }

    private int[][] matrixPow(int[][] m , int n){
        int[][] result = {{1,0},{0,1}};
        int[][] base =m;

        while (n>0){
            if (n%2  ==  1){
                result = matrixmul(result , base);
            }
            base = matrixmul(base , base);
            n /= 2;
        }
        return result;
    }
    private int[][] matrixmul(int[][] a , int[][] b){
        return new int[][] {
            {a[0][0]*b[0][0]+a[0][1]*b[1][0] , a[0][0]*b[0][1]+a[0][1]*b[1][1]},
            {a[1][0]*b[0][0]+a[1][1]*b[1][0] , a[1][0]*b[0][1]+a[1][1]*b[1][1]}
        };
    }
}