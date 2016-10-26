package Tutorial;

/**
 * Created by Danielle98 on 10/21/2016.
 */

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game extends JPanel {


    Ball ball = new Ball(this);
    Player player = new Player(this);
    Player2 playerr = new Player2(this);
    Arena arena = new Arena(this);

    protected int speed = 2;
    protected int score1 = 0,score2 = 0; //SEPARATE SCORES
    protected static boolean gameOver = false;



    public Game() { //FOLLOWED THE TUTORIAL BUT WILL DEF RESEARCH MORE ON KEYEVENTS AND ACTIONLISTENER STUFF
        //ANONYMOUS THINGGY
        addKeyListener(new KeyListener() { //FOR PLAYER 1 ARROW KEYS <- ->
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                player.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                player.keyPressed(e);
            }
        });

        addKeyListener(new KeyListener() { //FOR PLAYER 2 KEYS A && D
            @Override
            public void keyTyped(KeyEvent z) {
            }

            @Override
            public void keyReleased(KeyEvent z) {
                playerr.keyReleased(z);
            }

            @Override
            public void keyPressed(KeyEvent z) {
                playerr.keyPressed(z);
            }
        });
        setFocusable(true);
    }


    public void move(){
        //MOVEMENTS
        ball.moveBall();
        player.moveRacquet(); //SHOULD HAVE USED A SINGLE CLASS FOR PLAYER AND PLAYERR
        playerr.moveRacquet();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gg = (Graphics2D) g;
        gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON); //BETTER QUALITY OF THE SHAPES
        arena.paint(gg); //PAINTS THE ARENA OBJECTS IN THE FRAME
        ball.paint(gg); //PAINTS BALL
        player.paint(gg); //PLAYER1 RACQUET
        playerr.paint(gg); //PLAYER2 RACQUET

        gg.setFont(new Font("Verdana", Font.BOLD, 30));
        gg.drawString(String.valueOf(player.getScore()), 185, 335); //SHOW SCORE
        gg.drawString(String.valueOf(playerr.getScore()), 185, 250);

    }



    public void restart() {
        Sounds.GAMEOVER.play(); //BLOOP!
        JOptionPane.showMessageDialog(null,"SCORE!"); //SOFT RESTART // RESTART THE GAME AGAIN BUT SAVES THE SCORE SINCE DI PA GAME OVER

    }



    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Pong");
        Game game = new Game();
        frame.add(game);
        frame.setBackground(Color.white);
        frame.setSize(400, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Sounds.GAMEAGAIN.play();
        while (!gameOver){
            game.move(); //CALLS FOR THE MOVEMENT
            game.repaint(); //UPDATES THE FRAME FOR THE MOVEMENTS
            Thread.sleep(10);
        }

        gameOver = false;
        Sounds.RESTART.play(); //APPLAUSE
        String winner = "";
        if(game.score1 > game.score2){ winner = "Player 1";} else { winner = "Player 2"; } 
        int ans = JOptionPane.showConfirmDialog(null, winner + " Wins! " + "\n Would you like to play again?","", JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) { //USER RESTARTS
            Thread.sleep(900);
            frame.dispose(); //EXITS THE FIRST FRAME
            main(args); //ma-gameover na // CREATES NEW FRAME FOR NEW GAME
        }
        else { //USER CHOOSES NOT TO RESTART THE GAME
            System.exit(ABORT); //EXITS FRAME
        }
    }

}
