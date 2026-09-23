class Solution {
    public boolean isValidSudoku(char[][] board) {
        int length = board.length;

        HashSet<Character>[] rows = new HashSet[length];
        HashSet<Character>[] cols = new HashSet[length];
        HashSet<Character>[] boxes = new HashSet[length];

        for (int i = 0; i < length; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {

                char num = board[row][col];

                if (num == '.') {
                    continue;
                }

                int boxIndex = (row / 3) * 3 + (col / 3);

                if (rows[row].contains(num) ||
                    cols[col].contains(num) ||
                    boxes[boxIndex].contains(num)) {
                    return false;
                }

                rows[row].add(num);
                cols[col].add(num);
                boxes[boxIndex].add(num);
            }
        }

        return true;
    }
}