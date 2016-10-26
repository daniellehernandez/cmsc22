package Tutorial;

/**
 * Created by Danielle98 on 10/22/2016.
 */
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player2 {


        private static final int Y = 20;
        private static final int WIDTH = 70;
        private static final int HEIGHT = 10;
        int x = 150;
        int xBounce = 0;
        private Game game;

        public Player2 (Game game) {
            this.game = game;
        }

        public void moveRacquet() {
            if (x + xBounce > 0 && x + xBounce < game.getWidth() - WIDTH)
                x = x + xBounce;
        }

        public void paint(Graphics2D g) {
            g.setColor(Color.gray);
            g.fillRect(x, Y, WIDTH, HEIGHT);
        }

        public void keyReleased(KeyEvent e) {
            xBounce = 0;
        }

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_A)
                xBounce = -game.speed;
            if (e.getKeyCode() == KeyEvent.VK_D)
                xBounce = game.speed;
        }

        public Rectangle getBounds() {
            return new Rectangle(x, Y, WIDTH, HEIGHT);
        }

        public int getBottomY() { return HEIGHT + Y ; } //REVERSE OF GETTOPY

    public int getY(){
        return Y;
    }

    public int getScore() {
        return game.score2;
    }

}

