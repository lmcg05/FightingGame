package com.company;

public class VisibilityManager {
    UI ui; //declare

    public VisibilityManager(UI userInterface) { //renaming construct
        ui = userInterface; //can use variable userinterface in this class now

    }
    public void showTitleScreen() {
        //show title screen

        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);


        //hide game screen
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
        ui.ChoiceButtonPanel2.setVisible(false);
    }
    public void showGameScreen() {
        //show title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);


        //hide game screen

        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
        ui.ChoiceButtonPanel2.setVisible(true);



    }


}
