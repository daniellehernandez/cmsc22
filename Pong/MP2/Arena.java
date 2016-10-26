package Tutorial;

import java.awt.*;

/**
 * Created by Danielle98 on 10/25/2016.
 */
public class Arena {
    private Game game;

    public Arena (Game game) { //DESIGN DESIGN
        this.game = game;
    }
    public void paint(Graphics2D g) {


        g.setColor(Color.white);
        g.fillArc(60, 350, 250, 200, 0, 180);
        g.fillArc(60, 10, 250, 200, 0, -180);
        g.setColor(Color.yellow);
        g.setFont(new Font("Verdana", Font.BOLD, 30));
        g.drawString("PONG",145,290);

        g.setColor(Color.blue);
        g.fillRect(10,100,50,10);
        g.fillRect(110,100,50,10);
        g.fillRect(210,100,50,10);
        g.fillRect(310,100,50,10);


        g.setColor(Color.red);
        g.fillRect(10,450,50,10);
        g.fillRect(110,450,50,10);
        g.fillRect(210,450,50,10);
        g.fillRect(310,450,50,10);

        g.setColor(Color.black);
        g.setFont(new Font("Verdana", Font.BOLD, 10));
        g.drawString(String.valueOf("Player 1"), 170, 420);
        g.drawString(String.valueOf("Player 2"), 170, 145);


    }
}
