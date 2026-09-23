class Solution {
    public boolean isValidSudoku(char[][] board) {
        int length = board.length;
        
        HashSet<Integer>[] rows = new HashSet[length];
        HashSet<Integer>[] cols = new HashSet[length];
        HashSet<Integer>[] boxes = new HashSet[length];
        for (int i = 0; i < length; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {
                if (board[row][col] == '.') {
                    continue;
                }
                int num = board[row][col] - '0';

                if (rows[row].contains(num)) {
                    return false;
                }
                if (cols[col].contains(num)) {
                    return false;
                }

                int rb = row/3;
                int cb = col/3;
                int boxIndex = rb*3+ cb;
            
                if (boxes[boxIndex].contains(num)) {
                    return false;
                }

                boxes[boxIndex].add(num);
                rows[row].add(num);
                cols[col].add(num);
            }
        }
        return true;
    }
}
