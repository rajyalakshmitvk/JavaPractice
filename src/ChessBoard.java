import java.applet.*;
import java.awt.*;
/*<applet code="ChessBoard" width=600 height=600>
</applet>*/
// Extends Applet Class
public class ChessBoard extends Applet {

    static int N = 8;

    // Use paint() method
    public void paint(Graphics g)
    {
        int x, y;
        for (int row = 0; row < N; row++) {

        for (int col = 0; col < N; col++) {

            // Set x coordinates of rectangle
            // by 50 times
            x = row * 100;

            // Set y coordinates of rectangle
            // by 50 times
            y = col * 100;

            // Check whether row and column
            // are in even position
            // If it is true set Black color
            if ((row % 2 == 0) == (col % 2 == 0))
                g.setColor(Color.BLACK);
            else
                g.setColor(Color.WHITE);

            // Create a rectangle with
            // length and breadth of 50
            g.fillRect(x, y, 100, 100);
        }
    }
    }
}
