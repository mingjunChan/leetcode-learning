package topics.graph.dfs._733_flood_fill;

public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];//初始色彩
return dfs(image,color,sr,sc,newColor);


    }

    private int[][] dfs(int[][] image, int color, int sr, int sc, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length||image[sr][sc]==newColor||image[sr][sc]!=color) {
            return image;
        }
        if (image[sr][sc] == color) {
            image[sr][sc] = newColor;
        }

        dfs(image, color, sr - 1, sc, newColor);
        dfs(image, color, sr, sc + 1, newColor);
        dfs(image, color, sr + 1, sc, newColor);
        dfs(image, color, sr, sc - 1, newColor);
        return image;
    }
}
