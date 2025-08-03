/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return dfs(grid , grid.length , 0 , 0);
    }

    private Node dfs(int[][] grid ,int n , int r , int c){
        boolean isSame = true;
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n ; j++){
                if (grid[r][c] != grid[r+i][c+j]){
                    isSame = false;
                    break;
                }
            }
        }

        if (isSame){
            return new Node(grid[r][c] == 1,true);
        }
        int m = n/2;
        Node topleft = dfs(grid , m , r , c);
        Node bottomleft = dfs(grid , m , m+r , c);
        Node topright = dfs(grid , m , r , c+m);
        Node bottomright = dfs(grid , m , r+m , c+m );

        return new Node(false , false,topleft , topright , bottomleft , bottomright);
    }
}