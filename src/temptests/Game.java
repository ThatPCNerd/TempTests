package temptests;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.*;
import java.awt.event.*;

/**
 *
 * @author Karen-Jr
 */
public class Game extends JFrame {

    public static String answerString = "0";
    public static JLabel answer = new JLabel(answerString);
    public static String[] numStr = new String[100]; //1st num conv to string
    public static Double[] numDub = new Double[100];  //second number
    public static int currentNum = 0; //used to know how many numbers have been entered
    public static String[] functionStr = new String[100];//array of all of the functions that the user wants
    public static JButton b0 = new JButton("0");
    //Creates all necessary buttons for a calculator.
    public static JButton b1 = new JButton("1");
    public static JButton b2 = new JButton("2");
    public static JButton b3 = new JButton("3");
    public static JButton b4 = new JButton("4");
    public static JButton b5 = new JButton("5");
    public static JButton b6 = new JButton("6");
    public static JButton b7 = new JButton("7");
    public static JButton b8 = new JButton("8");
    public static JButton b9 = new JButton("9");
    public static JButton bPlus = new JButton("+");
    public static JButton bMinus = new JButton("-");
    public static JButton bTimes = new JButton("*");
    public static JButton bDivide = new JButton("/");
    public static JButton bEquals = new JButton("=");
    public static JButton bClear = new JButton("clr");
    public static String total = "";
    public static Double totalDub = 0.0;

    public Game() {
        setLayout(new BorderLayout(1, 5));
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout(1, 5));
        p1.setLayout(new GridLayout(5, 3, 0, 0));
        //adds buttons to the layout/panel
        p1.add(b0);
        b0.addActionListener(new calcButton());
        p1.add(b1);
        b1.addActionListener(new calcButton());
        p1.add(b2);
        b2.addActionListener(new calcButton());
        p1.add(b3);
        b3.addActionListener(new calcButton());
        p1.add(b4);
        b4.addActionListener(new calcButton());
        p1.add(b5);
        b5.addActionListener(new calcButton());
        p1.add(b6);
        b6.addActionListener(new calcButton());
        p1.add(b7);
        b7.addActionListener(new calcButton());
        p1.add(b8);
        b8.addActionListener(new calcButton());
        p1.add(b9);
        b9.addActionListener(new calcButton());
        p1.add(bPlus);
        bPlus.addActionListener(new calcButton());
        p1.add(bMinus);
        bMinus.addActionListener(new calcButton());
        p1.add(bTimes);
        bTimes.addActionListener(new calcButton());
        p1.add(bDivide);
        bDivide.addActionListener(new calcButton());
        p1.add(bEquals);
        bEquals.addActionListener(new calcButton());
        p1.add(bClear);
        bClear.addActionListener(new calcButton());

        p2.add(p1, BorderLayout.SOUTH);
        p2.add(answer, BorderLayout.CENTER);
        add(p2);
    }

    static class calcButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b0) {
                if (answerString != "0") {
                    numStr[currentNum] += "0";
                }
                answer.setText(numStr[currentNum]);
            }
            if (e.getSource() == b1) {
                numStr[currentNum] += "1";
                answer.setText(numStr[currentNum]);
            }
            if (e.getSource() == b2) {
                numStr[currentNum] += "2";
                answer.setText(numStr[currentNum]);
            }
            if (e.getSource() == b3) {
                numStr[currentNum] += "3";
                answer.setText(numStr[currentNum]);
            }
            if (e.getSource() == b4) {
                numStr[currentNum] += "4";
                answer.setText(numStr[currentNum]);
            }
            if (e.getSource() == b5) {
                numStr[currentNum] += "5";
                answer.setText(numStr[currentNum]);
            }
            if (e.getSource() == b6) {
                numStr[currentNum] += "6";
                answer.setText(numStr[currentNum]);
            }
            if (e.getSource() == b7) {
                numStr[currentNum] += "7";
                answer.setText(numStr[currentNum]);
            }
            if (e.getSource() == b8) {
                numStr[currentNum] += "8";
                answer.setText(numStr[currentNum]);
            }
            if (e.getSource() == b9) {
                numStr[currentNum] += "9";
                answer.setText(numStr[currentNum]);
            }
                if (e.getSource() == bPlus) {
                    if (numStr[currentNum] != "") {
                        functionStr[currentNum] = "+";
                        answer.setText(functionStr[currentNum]);
                    } else {
                        functionStr[currentNum] = "+";
                        currentNum += 1;
                    }
                }
                if (e.getSource() == bMinus) {
                    answerString = "-";
                    System.out.println(answerString);
                }
                if (e.getSource() == bDivide) {
                    answerString = "/";
                    System.out.println(answerString);
                }
                if (e.getSource() == bTimes) {
                }
                if (e.getSource() == bEquals) {
                    int n = 1;
                    while (n <= (numStr.length)) {
                        numDub[n] = Double.parseDouble(numStr[n]);
                        n++;
                    }
                    n = 0;
                    while (n <= numStr.length) {
                        if (functionStr[n].equals("+")) {
                            totalDub += numDub[n - 1];
                        }
                        if (functionStr[n].equals("-")) {
                            totalDub -= numDub[n - 1];
                        }
                        if (functionStr[n].equals("/")) {
                            totalDub /= numDub[n - 1];
                        }
                        if (functionStr[n].equals("*")) {
                            totalDub *= numDub[n - 1];
                        }
                    }
                    total = Double.toString(totalDub);
                    answer.setText(total);
                    currentNum = 0;


                }

                if (e.getSource() == bClear) {

                    currentNum = 1;
                    answer.setText("0");

                }
            }
        }

        public static void game() {

            Game frame = new Game();
            frame.setTitle("Calculator!");
            frame.setSize(300, 220);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
    }

