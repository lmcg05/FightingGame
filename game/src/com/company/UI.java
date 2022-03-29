package com.company;

import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame window;

    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, backgroundPanel, homePanel; //is a container that can store a group of components
    JLabel titleNameLabel, hpLabel, hpLabelNumber, enemyLabel, enemyHPLabel, background1, background2, background3;
    Font titleFont = new Font("Times New Roman", Font.ITALIC, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startButton, choice1, choice2, choice3;
    JTextArea mainTextArea;


public void createUI(Main.ChoiceHandler cHandler) {

    //Window


    window = new JFrame(); //initialisation
    window.setSize(800, 600); //size of the window, 800 pixel and 600 pixel.
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //gives functions to the window. closes
    window.getContentPane().setBackground(Color.black); //background color
    window.setLayout(null); //disables the default layout

    background1 = new JLabel(new ImageIcon("/Users/apple/Downloads/background.jpg"));
    backgroundPanel = new JPanel();
    backgroundPanel.setBounds(0, 0, 800, 600);

    //TitleName
    titleNamePanel = new JPanel();
    titleNamePanel.setBounds(100, 100, 600, 100); // creates a space for the panel
    // x and y is the position
    titleNamePanel.setBackground(Color.black);
    titleNameLabel = new JLabel("ADVENTUREE");
    titleNameLabel.setForeground(Color.white); //placing it in the TitlePanel
    titleNameLabel.setFont(titleFont);

    startButtonPanel = new JPanel();
    startButtonPanel.setBounds(300, 400, 100, 50);
    startButtonPanel.setBackground(Color.black);

    startButton = new JButton("Start"); //instantiate
    //colour of the text
    startButton.setBackground(Color.white); //background
    startButton.setForeground(Color.black);
    startButton.setFont(normalFont);
    startButton.addActionListener(cHandler);
    startButton.setActionCommand("start");//adding functionality
    // when click, recognise the click and the action can be written in
    //titlescreenhandler

    titleNamePanel.add(titleNameLabel);// window.add(background);
    startButtonPanel.add(startButton);


    window.add(titleNamePanel);
    window.add(startButtonPanel);
//    window.add(backgroundPanel);
//    window.setVisible(true);

    //Game screen

    mainTextPanel = new JPanel();
    mainTextPanel.setBounds(100, 100, 600, 150);
    mainTextPanel.setOpaque(true);
    mainTextPanel.setBackground(Color.white);
    background2 = new JLabel(new ImageIcon("/Users/apple/Downloads/61D9Njm44AL._AC_SL1500_.jpg"));


    window.add(mainTextPanel);


    mainTextArea = new JTextArea("You have encountered a Challenger. Choose a Weapon: ");
    mainTextArea.setBounds(100, 100, 600, 150);
    mainTextArea.setBackground(Color.white);
    mainTextArea.setForeground(Color.black);
    mainTextArea.setFont(normalFont);
    mainTextArea.setLineWrap(true); //spacing
    mainTextPanel.add(mainTextArea);


    choiceButtonPanel = new JPanel();
    choiceButtonPanel.setBounds(250, 350, 300, 150);
    choiceButtonPanel.setBackground(Color.white);
    choiceButtonPanel.setLayout(new GridLayout(3, 1));//layouts to buttons
    window.add(choiceButtonPanel);

    choice1 = new JButton("Option 1");
    // choice1.setBorderPainted(false);
    choice1.setBackground(Color.white);
    choice1.setForeground(Color.black);
    choice1.setFont(normalFont);


    choice1.addActionListener(cHandler);
    choice1.setActionCommand("c1"); //gives uique key to the button

    choice2 = new JButton("Option 2");
    choice2.setBackground(Color.white);
    choice2.setForeground(Color.black);
    choice2.setFont(normalFont);
    choice2.addActionListener(cHandler);
    choice2.setActionCommand("c2");

    choice3 = new JButton("Option 3");
    choice3.setBackground(Color.white);
    choice3.setForeground(Color.black);
    choice3.setFont(normalFont);
    choice3.addActionListener(cHandler);
    choice3.setActionCommand("c3");


    choiceButtonPanel.add(choice1);
    choiceButtonPanel.add(choice2);
    choiceButtonPanel.add(choice3);


    playerPanel = new JPanel();
    playerPanel.setBounds(100, 15, 600, 50);
    playerPanel.setBackground(Color.white);
    playerPanel.setLayout(new GridLayout(1, 4));
    window.add(playerPanel);

    hpLabel = new JLabel("HP:");
    hpLabel.setForeground(Color.black);
    hpLabel.setFont(normalFont);
    playerPanel.add(hpLabel);
    hpLabelNumber = new JLabel();
    hpLabelNumber.setForeground(Color.black);
    hpLabelNumber.setFont(normalFont);
    playerPanel.add(hpLabelNumber);
    enemyLabel = new JLabel("Enemy HP:");
    enemyLabel.setForeground(Color.black);
    enemyLabel.setFont(normalFont);
    playerPanel.add(enemyLabel);
    enemyHPLabel = new JLabel();
    enemyHPLabel.setForeground(Color.black);
    enemyHPLabel.setFont(normalFont);
    playerPanel.add(enemyHPLabel);
    backgroundPanel.add(background1);//add the button to the panel. if you want it behind. it will need to be added after the button
    window.add(backgroundPanel);
    mainTextPanel.add(background2);

    window.setVisible(true);




}
}
