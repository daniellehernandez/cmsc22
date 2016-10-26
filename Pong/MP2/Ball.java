package Tutorial;
import java.awt.*;

/**
 * Created by Danielle98 on 10/22/2016.
 */

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
    private static final int DIAMETER = 30;

    boolean marker = true;
    private int x = 200;
    private int y = 250;
    private int xBounce = 1;
    private int yBounce = 1;
    private Game game;

    public Ball(Game game) {
        this.game = game;
    }

    void moveBall() {
        boolean changeDirection = true;

        if(game.speed >= 7 ){ //SPEED INCREASES AS GAME PROGRESSES BUT UNTIL 7 RA. (Substitute unta para challenging gamay even without power ups)
            game.speed = 5;
        }

        if (x + xBounce < 0)
            xBounce = game.speed;
        else if (x + xBounce > game.getWidth() - DIAMETER)
            xBounce = -game.speed;
        else if (y + yBounce < 0)
            yBounce = game.speed;
        else if (y + yBounce + 10 > game.getHeight() - game.playerr.getY()) { // IF BALL PASSES THROUGH THE DOMAIN OF THE RACKET. PTS TO THE ATTACKER (PLAYER 2)
            game.score2++;
            game.restart();
            yBounce = 1;
            xBounce = 1;
            x = 200;
            y = 250;
            game.speed = 2;
        }
        else if (y + yBounce + 10  < 15 ) { // IF BALL PASSES THROUGH THE DOMAIN OF THE RACKET. PTS TO THE ATTACKER (PLAYER 1)
            game.score1 ++;
            game.restart(); // RESTART BUT NOT NEW GAME
            yBounce = 1;
            xBounce = 1;
            x = 200; // RESTART BALL POSITION
            y = 250; // RESTART BALL POSITION
            game.speed = 2; //RESTART SPEED
        }
        else if (game.score1 >= 3 || game.score2 >= 3) {
            game.gameOver = true; // GAME OVER && RESTART FOR NEW GAME (
        }
        else if (collision()){
            if(!marker){ //MARKER TO DETERMINE IF PLAYER 1 or 2 (CAN BE IMPROVED IF ONE CLASS ANG PLAYER)
                yBounce = -game.speed;
                y = game.player.getTopY() - DIAMETER;
                game.speed++; //AS GAME PROGRESSES SPEED INCREASES (SUBSTITUTE FOR POWER UPS)
            } else {
                yBounce = game.speed;
                y = game.playerr.getBottomY(); //CREATED A NEW METHOD GET BOTTOM Y for PLAYER 2
                game.speed++; //AS GAME PROGRESSES SPEED INCREASES
            }
        } else
            changeDirection = false;

        if (changeDirection)
           Sounds.BALL.play(); //AUDIO

        x += xBounce;
        y += yBounce;
    }

    private boolean collision() {
        if(marker) {
            marker = false;
            return game.player.getBounds().intersects(getBounds()); //When values coincide mubounce back
        }  else {
            marker = true;
            return game.playerr.getBounds().intersects(getBounds());
        }
    }

    public void paint(Graphics2D g){
        if(game.score1 > game.score2){ //CHANGES THE BALL COLOR TO WHOEVER LEADS THE GAME
            g.setColor(Color.red);
        } else if(game.score2 > game.score1){
            g.setColor(Color.blue);
        } else {
            g.setColor(Color.gray);
        }
        g.fillOval(x, y, DIAMETER, DIAMETER); //DRAW THE PONG BALL
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}