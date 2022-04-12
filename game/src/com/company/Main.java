package com.company;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main {
    //class initialise
    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();

    Player player = new Player();
    Pokemon pokemon = new Pokemon();



    VisibilityManager vm = new VisibilityManager(ui);
    Sound sound1 = new Sound(this);

    Story story = new Story(this, ui, vm, player, pokemon, sound1); //passing ui,vm and this "class"



    String name;

    String position, position1, position3, position4, position5;
    //instantiate
    //sending ui to Visibility manager construct so it can access the panels from UI class


    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        new Main(); //instanstiate

    }

    public Main() throws UnsupportedAudioFileException, IOException, LineUnavailableException {



        ui.createUI(cHandler);
        vm.showTitleScreen();// can access the screen
        story.defaultSetUp();


        name = JOptionPane.showInputDialog(null,"Enter your name:", "Player 1", JOptionPane.PLAIN_MESSAGE);

        sound1.startPage();
        sound1.playStartPage();






    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand(); //declares a variable that takes in the Actioncommand or unique id of the buttons e.g c1

            switch (yourChoice) {
                case "start":
                    sound1.stopStartPage();


                    sound1.buttonSound();


                    vm.showGameScreen();


                    try {
                        story.setPokemon();
                    } catch (UnsupportedAudioFileException e) {
                        e.printStackTrace();
                    } catch (LineUnavailableException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    break;
                case "c1":


                    try {
                        story.selectPosition(position1);
                    } catch (UnsupportedAudioFileException e) {
                        e.printStackTrace();
                    } catch (LineUnavailableException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case "c2":

                    //                  sound2.buttonSound();
                    try {
                        story.selectPosition(position3);
                    } catch (UnsupportedAudioFileException e) {
                        e.printStackTrace();
                    } catch (LineUnavailableException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "c3":
                    //                      sound2.buttonSound();
                    try {
                        story.selectPosition(position4);
                    } catch (UnsupportedAudioFileException e) {
                        e.printStackTrace();
                    } catch (LineUnavailableException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "c4":

                    try {
                        story.selectPosition(position5);
                    } catch (UnsupportedAudioFileException e) {
                        e.printStackTrace();
                    } catch (LineUnavailableException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

            }
        }
    }
}
