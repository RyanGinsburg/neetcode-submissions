class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int topRow = 0;
        int bottomRow = matrix.length -1;
        while (topRow <= bottomRow) {
            int midRow = topRow + (bottomRow-topRow)/2;
            int left = 0;
            int right = matrix[0].length-1;
            if (target < matrix[midRow][left]) {
                bottomRow = midRow-1;
            }
            else if (target > matrix[midRow][right]) {
                topRow = midRow+1;
            }
            else {
                while (left <= right) {
                    int mid = left + (right-left)/2;
                    int midNum = matrix[midRow][mid];
                    if (midNum == target) {
                        return true;
                    } else if (midNum < target) {
                        left = mid+1;
                    } else {
                        right = mid-1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
