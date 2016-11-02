/**
 * Created by Danielle98 on 11/1/2016.
 */



import java.awt.Color;
import java.awt.Container;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import javax.swing.*;

/**
 *
 * @author Danielle98
 */
public class Calculator extends javax.swing.JFrame {


    BigDecimal value11;
    BigDecimal value22;
    BigDecimal result11;
    BigInteger result;
    String operations;
    boolean decinot = false; //Decimal input or not

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        Container c = this.getContentPane();
        c.setBackground(Color.pink);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Display = new javax.swing.JTextField();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button10 = new javax.swing.JButton();
        PlusMinusButton = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        Equals = new javax.swing.JButton();
        Percent = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        deci = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("M I N I C A L C");
        setResizable(false);

        Display.setFont(new java.awt.Font("Debby", 0, 48)); // NOI18N
        Display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Display.setAutoscrolls(false);
        Display.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Button1.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 51, 51));
        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 51, 51));
        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 51, 51));
        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 51, 51));
        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 51, 51));
        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 51, 51));
        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button7.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 51, 51));
        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Button8.setForeground(new java.awt.Color(255, 51, 51));
        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Button9.setForeground(new java.awt.Color(255, 51, 51));
        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button10.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Button10.setForeground(new java.awt.Color(255, 51, 51));
        Button10.setText("0");
        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });

        PlusMinusButton.setFont(new java.awt.Font("Debby", 1, 24)); // NOI18N
        PlusMinusButton.setForeground(new java.awt.Color(255, 51, 51));
        PlusMinusButton.setText("+/-");
        PlusMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusMinusButtonActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 51, 51));
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        Minus.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Minus.setForeground(new java.awt.Color(255, 51, 51));
        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        Divide.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Divide.setForeground(new java.awt.Color(255, 51, 51));
        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        Multiply.setFont(new java.awt.Font("Debby", 0, 36)); // NOI18N
        Multiply.setForeground(new java.awt.Color(255, 51, 51));
        Multiply.setText("x");
        Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyActionPerformed(evt);
            }
        });

        Equals.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        Equals.setForeground(new java.awt.Color(255, 51, 51));
        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        Percent.setFont(new java.awt.Font("Debby", 0, 36)); // NOI18N
        Percent.setForeground(new java.awt.Color(255, 51, 51));
        Percent.setText("%");
        Percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PercentActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Debby", 0, 36)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 51, 51));
        Clear.setText("clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        deci.setFont(new java.awt.Font("Debby", 1, 36)); // NOI18N
        deci.setForeground(new java.awt.Color(255, 51, 51));
        deci.setText(".");
        deci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(deci, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Percent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(Button10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                                .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(Button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(PlusMinusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(Display))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Button10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PlusMinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Percent, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deci, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {
        String numberEntered = Display.getText() + Button1.getText();
        Display.setText(numberEntered);
    }

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {
        String numberEntered = Display.getText() + Button2.getText();
        Display.setText(numberEntered);
    }

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {
        String numberEntered = Display.getText() + Button3.getText();
        Display.setText(numberEntered);
    }

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {
        String numberEntered = Display.getText() + Button4.getText();
        Display.setText(numberEntered);
    }

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {
        String numberEntered = Display.getText() + Button5.getText();
        Display.setText(numberEntered);
    }

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {
        String numberEntered = Display.getText() + Button6.getText();
        Display.setText(numberEntered);
    }

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {
        String numberEntered = Display.getText() + Button7.getText();
        Display.setText(numberEntered);
    }

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {
        String numberEntered = Display.getText() + Button8.getText();
        Display.setText(numberEntered);
    }

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {
        String numberEntered = Display.getText() + Button9.getText();
        Display.setText(numberEntered);
    }

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {
        String numberEntered = Display.getText() + Button10.getText();
        Display.setText(numberEntered);
    }

    private void PlusMinusButtonActionPerformed(java.awt.event.ActionEvent evt) {
        BigDecimal num = new BigDecimal(String.valueOf(Display.getText()));
        Display.setText(String.valueOf(num.negate()));

    }

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {

        value11 = new BigDecimal(Display.getText());
        Display.setText("");
        operations = "+";

    }

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {

        value11 = new BigDecimal(Display.getText());
        Display.setText("");
        operations = "-";

    }

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {

        value11 = new BigDecimal(Display.getText());
        Display.setText("");
        operations = "/";

    }

    private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {

        value11 = new BigDecimal(Display.getText());
        Display.setText("");
        operations = "x";

    }

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {
        String ans = "";


        value22 = new BigDecimal(Display.getText());

        if(operations == "+"){
            result11 = value11.add(value22);
            if(!(decinot)){
                ans = String.format("%.0f",result11);
            } else {
                ans = String.format("%.2f", result11);
            }
            Display.setText(ans);
        } else if (operations == "-"){
            result11 = value11.subtract(value22);
            if(!(decinot)){
                ans = String.format("%.0f",result11);
            } else {
                ans = String.format("%.2f", result11);
            }
            Display.setText(ans);
        } else if(operations == "/"){
            try {
                result11 = value11.divide(value22, 2, RoundingMode.HALF_UP);
                if(!(decinot)){
                    ans = String.format("%.0f",result11);
                } else {
                    ans = String.format("%.2f", result11);
                }
            }catch(ArithmeticException a){
                JOptionPane.showMessageDialog(null,"Math Error");
                Display.setText("");
            }
            Display.setText(ans);
        } else if (operations == "x"){
            result11 = value11.multiply(value22);
            if(!(decinot)){
                ans = String.format("%.0f",result11);
            } else {
                ans = String.format("%.2f", result11);
            }
            Display.setText(ans);
        }

        decinot = false;

    }

    private void PercentActionPerformed(java.awt.event.ActionEvent evt) {
        String equi;

        value11 = new BigDecimal(Display.getText());
        Display.setText("");
        BigDecimal onehundred = new BigDecimal(100);
        result11 = value11.divide(onehundred,  2, RoundingMode.HALF_UP);
        equi = String.format("%.2f", result11);
        Display.setText(equi);



    }

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {
        Display.setText("");
        decinot = false;
    }

    private void deciActionPerformed(java.awt.event.ActionEvent evt) {
        decinot = true;
        String numberEntered = Display.getText() + deci.getText();
        Display.setText(numberEntered);
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField Display;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Equals;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Percent;
    private javax.swing.JButton PlusMinusButton;
    private javax.swing.JButton deci;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton plus;
    // End of variables declaration
}
