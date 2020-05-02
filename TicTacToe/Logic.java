// ============================================================================
//    Taken and adapted from: http://programmingnotes.org/
// ============================================================================
import javax.swing.*;
import java.awt.*;

public class Logic
{
    public static void getMove(int rowMove, int colMove, int move, Font font, JButton square[][], 
    String startingPlayer)
    {   // gets the current move "X" or "O" for the user & displays to screen
        square[rowMove][colMove].setFont(font);
        
        //TODO: create logic to set which player made the move
        square[rowMove][colMove].setText(startingPlayer);
    }

    public static void showGame(JPanel pnlSouth, JPanel pnlPlayingField)
    {   // shows the Playing Field
        pnlSouth.setLayout(new BorderLayout());
        pnlSouth.add(pnlPlayingField, BorderLayout.CENTER);
        pnlPlayingField.requestFocus(); 
    }

    public static void clearPanelSouth(JPanel pnlSouth, JPanel pnlTop, 
    JPanel pnlNewGame, JPanel pnlPlayingField, JPanel pnlBottom, JPanel radioPanel) 
    {   // clears any posible panels on screen
        pnlSouth.remove(pnlTop); 
        pnlSouth.remove(pnlBottom);
        pnlSouth.remove(pnlPlayingField);
        pnlTop.remove(pnlNewGame);
        pnlSouth.remove(radioPanel);
    }
    public static boolean ifWinRows(String letter, String[][] real2, int l, int rows, int column) {
        for (int row = 0; row < l; row++) {
            if (letter != real2[row][column]) {
                return false;
            }
            if (real2[row][column] == "") {
                return false;
            }
        }
        return true;
    }
    public static boolean ifWinCols(String letter, String[][] real2, int l, int rows, int column) {
        for (int col = 0; col < l; col++) {
            if (real2[rows][col] != letter) {
                return false;
            }
            if (real2[rows][col] == "") {
                return false;
            }
        }
        return true;
    }
    public static boolean ifWinDiag(String letter, String[][] real2, int l, int rows, int column) {
        if ((rows == 0 && column == 0) || (rows == l - 1 && column == l - 1)) {
            for (int i = 0; i < l; i++) {
                if(letter != real2[i][i]) {
                    return false;
                }
            }
        }
        else {
            for (int i = 1; i <= l; i++) {
                    if(letter != real2[i - 1][l - i]) {
                        return false;
                    }
            }
        }
        return true;
    }
}
