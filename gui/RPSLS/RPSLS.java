import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Danielle98 on 10/24/2016.
 */
public class RPSLS extends Frame{


    private Button rockPaperScissorsLizardSpockButton;
    private TextArea resultsTextArea;
    private Label mylabel;
    private Label mylabel2;
    private Label mylabel3;
    private TextField formylabel2; //Used textfield instead of testarea (testarea takes up too much space in the frame sir, mawagtang ang order)
    private TextField formylabel3;
    private Button reset;
    CheckboxGroup store = new CheckboxGroup();
    private int score1 = 0, score2 = 0;


    public RPSLS() {
        setLayout(new FlowLayout());

        rockPaperScissorsLizardSpockButton = new Button("RockPaperScissorsLizardsSpock");
        reset = new Button("Reset Game");
        rockPaperScissorsLizardSpockButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int comp = randInt(5,1);

                String compp = ""; //FOR PRINTING IN FRAME

                if(comp == 1){
                    compp = "Rock";
                } else if (comp == 2){
                    compp = "Paper";
                } else if(comp == 3){
                    compp = "Scissors";
                } else if(comp == 4){
                    compp = "Lizard";
                } else if (comp == 5){
                    compp = "Spock";
                }

                if(store.getSelectedCheckbox() == null ){
                    JOptionPane.showMessageDialog(null,"You haven't chosen yet"); //click pero wa pa nagchoose
                }


                if (comp == 1) {
                    if ((store.getSelectedCheckbox().getLabel()).equals("Rock")) {
                        //wala mahitabo
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Paper")) {
                        score1++; //Player
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Scissors")) {
                        score2++; //Computer
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Lizard")) {
                        score2++; //Computer
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Spock")) {
                        score1++; //Player
                    }
                } else if (comp == 2) {
                    if ((store.getSelectedCheckbox().getLabel()).equals("Rock")) {
                        score2++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Paper")) {

                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Scissors")) {
                        score1++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Lizard")) {
                        score1++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Spock")) {
                        score2++;
                    }
                } else if (comp == 3) {
                    if ((store.getSelectedCheckbox().getLabel()).equals("Rock")) {
                        score1++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Paper")) {
                        score2++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Scissors")) {

                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Lizard")) {
                        score2++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Spock")) {
                        score1++;
                    }
                } else if (comp == 4) {
                    if ((store.getSelectedCheckbox().getLabel()).equals("Rock")) {
                        score1++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Paper")) {
                        score2++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Scissors")) {
                        score1++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Lizard")) {

                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Spock")) {
                        score2++;
                    }
                } else if (comp == 5) {
                    if ((store.getSelectedCheckbox().getLabel()).equals("Rock")) {
                        score2++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Paper")) {
                        score1++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Scissors")) {
                        score2++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Lizard")) {
                        score1++;
                    }
                    if ((store.getSelectedCheckbox().getLabel()).equals("Spock")) {

                    }
                }

                resultsTextArea.setText("Results"+"\nPlayer chose: " + store.getSelectedCheckbox().getLabel()+"\nComputer Chose: "+ compp);
                formylabel2.setText(""+score1);
                formylabel3.setText(""+score2);
                if(score1 >= 5){
                    JOptionPane.showMessageDialog(null,"Game Over! You Won");
                } if (score2 >= 5){
                    JOptionPane.showMessageDialog(null,"Game Over! Computer Won");
                }
            }

        });

        reset.addActionListener(new ActionListener(){ //RESTART BUTTON
            public void actionPerformed(ActionEvent z) {
                score1 = 0;
                score2 = 0;
                resultsTextArea.setText("Results");
                formylabel2.setText(""+score1);
                formylabel3.setText(""+score2);
            }
        });



        resultsTextArea = new TextArea("Results");
        mylabel = new Label("Your Choice");
        mylabel2 = new Label("Player's Score");
        mylabel3 = new Label("Computer's Score");
        formylabel2 = new TextField("0");
        formylabel3 = new TextField("0");
        add(mylabel);
        add(new Checkbox("Rock",store,false));
        add(new Checkbox("Paper",store,false));
        add(new Checkbox("Scissors",store,false));
        add(new Checkbox("Lizard",store,false));
        add(new Checkbox("Spock",store,false));
        add(rockPaperScissorsLizardSpockButton);
        add(resultsTextArea);
        add(mylabel2);
        add(formylabel2);
        add(mylabel3);
        add(formylabel3);
        add(reset);


        setBackground(Color.pink);
        setFont(new Font("Verdana", Font.ITALIC, 15));
        setTitle("RPS");
        setSize(550, 500);
        setVisible(true);
    }



    public int randInt(int max, int min) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static void main(String[] args) {
        new RPSLS();

    }

}
