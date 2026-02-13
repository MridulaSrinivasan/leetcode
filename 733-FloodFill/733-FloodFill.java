// Last updated: 2/13/2026, 11:32:49 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    
        int originalColor = image[sr][sc];
        if (originalColor == color) {
            return image; // No changes needed if same color
        }
        dfs(image, sr, sc, originalColor, color);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        // Check bounds
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) {
            return;
        }
        // Only change pixels with the original color
        if (image[r][c] != originalColor) {
            return;
        }

        image[r][c] = newColor;

        // Recursively call for up, down, left, right
        dfs(image, r - 1, c, originalColor, newColor); // up
        dfs(image, r + 1, c, originalColor, newColor); // down
        dfs(image, r, c - 1, originalColor, newColor); // left
        dfs(image, r, c + 1, originalColor, newColor); // right
    }
}
    
    