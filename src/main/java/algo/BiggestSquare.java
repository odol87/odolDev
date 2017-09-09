package algo;

/**
 * Created by Seokho Oh on 2017. 9. 9.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 */


public class BiggestSquare {
    public static void main(String[] args) {
        int[][] board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        System.out.println(solution(board));
    }

    public static int solution(int[][] board) {
        int answer = 0;

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {
                if (i - 1 < 0 || j - 1 < 0 || board[i][j] == 0) {
                    continue;
                }
                board[i][j] = Math.min(board[i][j - 1], Math.min(board[i - 1][j], board[i - 1][j - 1])) + 1;
                answer = Math.max(answer, board[i][j]);
            }
        }

        return (int) Math.pow(answer, 2);
    }


}
