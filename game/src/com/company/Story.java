package com.company;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Story {
    Main game;
    VisibilityManager vm;
    UI ui;
    Player player;
    Pokemon pokemon;
    Sound sound;
    Integer playerDamage = 0;
    Integer monsterDamage = 0;
    Integer answer;
    JLabel background2;




    public Story(Main g, UI userInterface, VisibilityManager vManager, Player plyr, Pokemon pkmn, Sound snd) {   //this comnstruct can use all the stuff in these classes
        game = g;
        vm = vManager;
        player = plyr;
        pokemon = pkmn;
        sound = snd;
        ui = userInterface; //instead of this.ui = userInterface; (decla


    }






    public void defaultSetUp() {

        ui.hpLabelNumber.setText("" + player.Hp);


        ui.enemyHPLabel.setText("" + pokemon.Hp);

    }

    public void selectPosition(String position) throws UnsupportedAudioFileException, LineUnavailableException, IOException { //takes the position and pass it to the switch

        switch (position) {
            case "directionPika":
                sound.pikachu();
                sound.playPikachu();
                sound.buttonSound();
                sound.stopMidPage();
                sound.battle();
                sound.playbat();

                setDirectionPika();
                break;
            case "directionEjay":
                sound.stopMidPage();
                sound.buttonSound();
                sound.battle();
                sound.playbat();
                setDirectionEjay();
                break;
            case "directionMew":
                sound.stopMidPage();
                sound.buttonSound();
                sound.battle();
                sound.playbat();
                setDirectionMew();
                break;

            case "forwardPika":
                sound.gyrados();
                sound.playGyrados();
                sound.buttonSound();
                forwardPika();
                break;
            case "leftPika":
                sound.totodile();
                sound.playToto();
                sound.buttonSound();
                pikachuLeft();
                break;
            case "rightPika":
                sound.mewtwo();
                sound.playmew();

                sound.buttonSound();
                pikachuRight();
                break;
            case "forwardPikaFight":
                sound.buttonSound();
                fightPikachuForward();
                break;
            case "leftPikaFight":
                sound.buttonSound();
                fightPikachuLeft();
                break;
            case "rightPikaFight":
                sound.buttonSound();
                fightPikachuRight();
                break;
            case "fightPikachuForward":
                sound.buttonSound();
                fightPikachuForward();
                break;
            case "thunderForward":
                sound.buttonSound();
                pikachuAttackForward();
                break;
            case "thunderboltForward":
                sound.buttonSound();
                pikachuAttackForward();
                break;
            case "tackleForward":
                sound.buttonSound();
                pikachuAttackForward();
                break;
            case "fightPikachuLeft":
                sound.buttonSound();
                fightPikachuLeft();
                break;
            case "thunderLeft":
                sound.buttonSound();
                pikachuAttackLeft();
                break;
            case "thunderboltLeft":
                sound.buttonSound();
                pikachuAttackLeft();
                break;
            case "tackleLeft":
                sound.buttonSound();
                pikachuAttackLeft();
                break;
            case "gyradosAttackForward":
                sound.buttonSound();
                sound.gyradosAttack();
                sound.playgy();
                gyradosAttackForward();
                break;
            case "totoAttackPika":
                sound.totoAttack();
                sound.playtt();
                sound.buttonSound();
                totodileAttackLeft();
                break;
            case "thunderRight":
                sound.buttonSound();
                pikachuAttackRight();
                break;
            case "thunderboltRight":
                sound.buttonSound();
                pikachuAttackRight();
                break;
            case "tackleRight":
                sound.buttonSound();
                pikachuAttackRight();
                break;
            case "mewtwoAttackPika":
                sound.mewAttack();
                sound.playma();
                sound.buttonSound();
                mewtwoAttackRight();
                break;
            case "fightPikaRight":
                sound.buttonSound();
                fightPikachuRight();
                break;

                ///////////////////
            case "forwardEjay":
                sound.gyrados();
                sound.playGyrados();
                sound.buttonSound();
                forwardEjay();
                break;
            case "forwardEjayFight":

                sound.buttonSound();

                fightEjayForward();
                break;
            case "slapForward":
                sound.buttonSound();
                ejayAttackForward();
                break;
            case "insultForward":
                sound.buttonSound();
                ejayAttackForward();
                break;
            case "kickBallsForward":
                sound.buttonSound();
                ejayAttackForward();
                break;
            case "gyradosejayAttackForward":
                sound.gyradosAttack();
                sound.playgy();
                sound.buttonSound();
                gyradosEjayAttackForward();
                break;

            case "leftEjay":
                sound.totodile();
                sound.playToto();
                sound.buttonSound();
                leftEjay();
            case "leftEjayFight":
                sound.buttonSound();
                leftEjayFight();
            case "slapLeft":
                sound.buttonSound();
                ejayAttackLeft();
                break;
            case "insultLeft":
                sound.buttonSound();
                ejayAttackLeft();
                break;
            case "kickBallsLeft":
                sound.buttonSound();
                ejayAttackLeft();
                break;
            case "TotodileejayAttackLeft":
                sound.totoAttack();
                sound.playtt();
                sound.buttonSound();
                totodileEjayAttackLeft();
                break;
            case "rightEjay":
                sound.buttonSound();
                sound.mewtwo();
                sound.playmew();
                rightEjay();
                break;
            case "rightEjayFight":
                sound.buttonSound();
                rightEjayFight();
                break;
            case "slapRight":
                sound.buttonSound();
                ejayAttackRight();
                break;
            case "insultRight":
                sound.buttonSound();
                ejayAttackRight();
                break;
            case "kickBallsRight":
                sound.buttonSound();
                ejayAttackRight();
                break;
            case "mewtwoEjayAttackRight":
                sound.mewAttack();
                sound.playma();
                sound.buttonSound();
                mewtwoEjayAttackRight();
                break;

               /////////////////////////

            case "forwardMew":
                sound.gyrados();
                sound.playGyrados();
                sound.buttonSound();
                forwardMew();
                break;
            case "forwardMewFight":
                sound.buttonSound();
                forwardMewFight();
                break;
            case "psychicForward":
                sound.buttonSound();
                mewAttackForward();
                break;
            case "supernovaForward":
                sound.buttonSound();
                mewAttackForward();
                break;
            case "hyperbeamForward":
                sound.buttonSound();
                mewAttackForward();
                break;
            case "gyradosMewAttackForward":
                sound.gyradosAttack();
                sound.playgy();
                sound.buttonSound();
                gyradosMewAttackForward();
                break;
            case "psychicLeft":
                sound.buttonSound();
                mewtotoAttackLeft();
                break;
            case "supernovaLeft":
                sound.buttonSound();
                mewtotoAttackLeft();
                break;
            case "hyperbeamLeft":
                sound.buttonSound();
                mewtotoAttackLeft();
                break;
            case "totoMewAttackLeft":
                sound.totoAttack();
                sound.playtt();
                sound.buttonSound();
                totoMewAttackLeft();
            case "leftMew":
                sound.totodile();
                sound.playToto();
                sound.buttonSound();
                leftMew();
                break;
            case "leftMewFight":
                sound.buttonSound();
                leftMewFight();
                break;


            case "rightMew":
                sound.mewtwo();
                sound.playmew();
                sound.buttonSound();
                rightMew();
                break;
            case "rightMewFight":
                sound.buttonSound();
                rightMewFight();
                break;
            case "psychicRight":
                sound.buttonSound();
                mewMewtwoAttackRight();
                break;
            case "supernovaRight":
                sound.buttonSound();
                mewMewtwoAttackRight();
                break;
            case "hyperbeamRight":
                sound.buttonSound();
                mewMewtwoAttackRight();
                break;
            case "mewtwoMewAttackRight":
                sound.mewAttack();
                sound.playma();
                sound.buttonSound();
                mewtwoMewAttackRight();
                break;

            case "run":
                sound.buttonSound();
                run();
                break;


            case "win":
                sound.stopbat();
                sound.winSound();
                sound.playWin();
                win();
                if (answer.equals(0)) {


                    sound.yes();
                    sound.playYes();
                } else if (answer.equals(1)) {
                    no();
                }
                break;
            case "lose":


                sound.stopbat();
                lose();
                if (answer.equals(0)) {
                    tryAgain();
                } else if (answer.equals(1)) {
                    no();
                }


                break;
            case "surrender":
                surrender();
                break;
            case "potion1":
                sound.recovery();
                sound.playrec();
                sound.buttonSound();
                potion();
                fightPikachuForward();
                break;
            case "potion2":
                sound.recovery();
                sound.playrec();
                sound.buttonSound();
                potion();
                fightPikachuLeft();
                break;
            case "potion3":
                sound.recovery();
                sound.playrec();
                sound.buttonSound();
                potion();
                fightPikachuRight();
                break;
            case "potion4":
                sound.recovery();
                sound.playrec();
                sound.buttonSound();
                potion();
                fightEjayForward();
                break;
            case "potion5":
                sound.recovery();
                sound.playrec();
                sound.buttonSound();
                potion();
                leftEjayFight();
                break;
            case "potion6":
                sound.recovery();
                sound.playrec();
                sound.buttonSound();
                potion();
                rightEjayFight();
                break;
            case "potion7":
                sound.recovery();
                sound.playrec();
                sound.buttonSound();
                potion();
                forwardMewFight();
                break;
            case "potion8":
                sound.recovery();
                sound.playrec();
                sound.buttonSound();
                potion();
                leftMewFight();
                break;
            case "potion9":
                sound.recovery();
                sound.playrec();
                sound.buttonSound();
                potion();
                rightMewFight();
                break;




        }


    }
    public void tryAgain() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        sound.loseSound();


        pokemon.Hp = 100;
        player.Hp = 100;

        ui.enemyHPLabel.setText("" + pokemon.Hp);
        ui.hpLabelNumber.setText("" + pokemon.Hp);


        setPokemon();



    }

    public void no() {
        JOptionPane.showMessageDialog(null, "LOSERRRRRRR");

    }
    public void setPokemon() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        ui.choiceButtonPanel.setVisible(true);
        sound.midPage();
        sound.playMidPage();

        ui.mainTextArea.setText("Welcome " + game.name + "!!! (not you again >.<)\n\n"+
                "Enzo: Here, take one of these rare pokemon\n"
                +"          Choose a Starter Pokemon");
        ui.choice1.setText("Pikachu");
        ui.choice2.setText("Ejay");
        ui.choice3.setText("Mew");


        game.position1 = "directionPika";
        game.position3 = "directionEjay";
        game.position4 = "directionMew";
    }

    public void setDirectionPika() throws UnsupportedAudioFileException, LineUnavailableException, IOException {



        ui.mainTextArea.setText("Where would you like to go:");
        ui.choice1.setText("LittleRoot");
        ui.choice2.setText("Petalburg");
        ui.choice3.setText("Rustboro");

//        game.position = "Direction"; //access the variable spring


        game.position1 = "forwardPika";
        game.position3 = "leftPika";
        game.position4 = "rightPika";

    }

    //////////////////////////////////Forward///////////////////////////////
    public void forwardPika() {
        sound.stopPikachu();

        ui.mainTextArea.setText("A Wild Gyrados Appeared\n" +
                "What will you do...");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("Surrender");

        //       game.position = "Direction"; //access the variable spring

        game.position1 = "forwardPikaFight";
        game.position3 = "run";
        game.position4 = "surrender";


    }

    public void fightPikachuForward() {

        ui.mainTextArea.setText("You chose to fight. Choose an ability");
        ui.choice1.setText("Thunder");
        ui.choice2.setText("ThunderBolt");
        ui.choice3.setText("Tackle");
        ui.choice4.setText("Potion");

        game.position1 = "thunderForward";
        game.position3 = "thunderboltForward";
        game.position4 = "tackleForward";
        game.position5 = "potion1";

    }

    public void pikachuAttackForward() throws UnsupportedAudioFileException, LineUnavailableException, IOException { //pikachu


        if (game.position1.equals("thunderForward")) {
            playerDamage = new Random().nextInt(20);
            sound.thunder();
            sound.playThunder();
            ui.mainTextArea.setText("You attacked Gyrados with " + "thunder" + " gave " + playerDamage + " damage");

        } else if (game.position3.equals("thunderboltForward")) {
            sound.thunderbolt();
            sound.playThunderbolt();
            playerDamage = new Random().nextInt(10);
            ui.mainTextArea.setText("You attacked Gyrados with " + "thunderbolt" + " gave " + playerDamage + " damage");

        } else if (game.position4.equals("tackleForward")) {
            sound.tackle();
            sound.playTackle();
            playerDamage = new Random().nextInt(10);
            ui.mainTextArea.setText("You attacked Gyrados with " + "tackle" + " gave " + playerDamage + " damage");
        }

        ui.mainTextArea.setLineWrap(true);
        pokemon.Hp = pokemon.Hp - playerDamage;
        ui.enemyHPLabel.setText("" + pokemon.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (pokemon.Hp > 0) {
            game.position1 = "gyradosAttackForward";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion1";
        } else if (pokemon.Hp < 0) {
            game.position1 = "win";
            game.position3 = "";
            game.position4 = "";
        }


    }

    public void gyradosAttackForward() {


        monsterDamage = new Random().nextInt(25);

        ui.mainTextArea.setText("Gyrados Attack you and gave you " + monsterDamage + " damage");

        player.Hp = player.Hp - monsterDamage;
        ui.hpLabelNumber.setText("" + player.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (player.Hp > 0) {
            game.position1 = "fightPikachuForward";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion1";
        } else if (player.Hp < 0) {
            game.position1 = "lose";
            game.position3 = "";
            game.position4 = "";
        }


    }

    public void pikachuLeft() {
        ui.mainTextArea.setText("A Wild Totodile Appeared\n" +
                "What will you do...");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("Surrender");

        //       game.position = "Direction"; //access the variable spring

        game.position1 = "leftPikaFight";
        game.position3 = "run";
        game.position4 = "surrender";

    }
    public void fightPikachuLeft() {

        ui.mainTextArea.setText("You chose to fight. Choose an ability");
        ui.choice1.setText("Thunder");
        ui.choice2.setText("ThunderBolt");
        ui.choice3.setText(("Tackle"));
        ui.choice4.setText("Potion");

        game.position1 = "thunderLeft";
        game.position3 = "thunderboltLeft";
        game.position4 = "tackleLeft";
        game.position5 = "potion2";


    }
    public void pikachuAttackLeft() throws UnsupportedAudioFileException, LineUnavailableException, IOException { //pikachu


        if (game.position1.equals("thunderLeft")) {
            sound.thunder();
            sound.playThunder();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Totodile with " + "thunder" + " gave " + playerDamage + " damage");

        } else if (game.position3.equals("thunderboltLeft")) {
            sound.thunderbolt();
            sound.playThunderbolt();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Totodile with " + "thunderbolt" + " gave " + playerDamage + " damage");

        } else if (game.position4.equals("tackleLeft")) {
            sound.tackle();
            sound.playTackle();
            playerDamage = new Random().nextInt(10);
            ui.mainTextArea.setText("You attacked Totodile with " + "tackle" + " gave " + playerDamage + " damage");

        }

        ui.mainTextArea.setLineWrap(true);
        pokemon.Hp = pokemon.Hp - playerDamage;
        ui.enemyHPLabel.setText("" + pokemon.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (pokemon.Hp > 0) {
            game.position1 = "totoAttackPika";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion2";
        } else if (pokemon.Hp < 0) {
            game.position1 = "win";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void totodileAttackLeft() {


        monsterDamage = new Random().nextInt(25);

        ui.mainTextArea.setText("Totodile Attack you and gave you " + monsterDamage + " damage");

        player.Hp = player.Hp - monsterDamage;
        ui.hpLabelNumber.setText("" + player.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (player.Hp > 0) {
            game.position1 = "fightPikachuLeft";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion2";
        } else if (player.Hp < 0) {
            game.position1 = "lose";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void pikachuRight() {
        ui.mainTextArea.setText("A Wild MewTwo Appeared\n" +
                "What will you do...");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("Surrender");

        //       game.position = "Direction"; //access the variable spring

        game.position1 = "rightPikaFight";
        game.position3 = "run";
        game.position4 = "surrender";
    }
    public void fightPikachuRight() {

        ui.mainTextArea.setText("You chose to fight. Choose an ability");
        ui.choice1.setText("Thunder");
        ui.choice2.setText("ThunderBolt");
        ui.choice3.setText(("Tackle"));
        ui.choice4.setText("Potion");

        game.position1 = "thunderRight";
        game.position3 = "thunderboltRight";
        game.position4 = "tackleRight";
        game.position5 = "potion3";

    }
    public void pikachuAttackRight() throws UnsupportedAudioFileException, LineUnavailableException, IOException { //pikachu


        if (game.position1.equals("thunderRight")) {
            sound.thunder();
            sound.playThunder();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "thunder" + " gave " + playerDamage + " damage");

        } else if (game.position3.equals("thunderboltRight")) {
            sound.thunderbolt();
            sound.playThunderbolt();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "thunderbolt" + " gave " + playerDamage + " damage");

        } else if (game.position4.equals("tackleRight")) {
            sound.tackle();
            sound.playTackle();
            playerDamage = new Random().nextInt(10);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "tackle" + " gave " + playerDamage + " damage");

        }

        ui.mainTextArea.setLineWrap(true);
        pokemon.Hp = pokemon.Hp - playerDamage;
        ui.enemyHPLabel.setText("" + pokemon.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (pokemon.Hp > 0) {
            game.position1 = "mewtwoAttackPika";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion3";
        } else if (pokemon.Hp < 0) {
            game.position1 = "win";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void mewtwoAttackRight() {


        monsterDamage = new Random().nextInt(25);

        ui.mainTextArea.setText("Mewtwo Attack you and gave you " + monsterDamage + " damage");

        player.Hp = player.Hp - monsterDamage;
        ui.hpLabelNumber.setText("" + player.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (player.Hp > 0) {
            game.position1 = "fightPikaRight";
            game.position3 = "";
            game.position4 = "";
        } else if (player.Hp < 0) {
            game.position1 = "lose";
            game.position3 = "";
            game.position4 = "";
        }


    }



    //////////Left///////////////////////////////////////////////////////////
    //////////////

    public void setDirectionEjay() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        sound.ejaySound();
        sound.playEjay();


        ui.mainTextArea.setText("Where would you like to go:\n" + "your lost!!\n" +
                "not the best pokemon choice so you better RUN!!!" );
        ui.choice1.setText("LittleRoot");
        ui.choice2.setText("Petalburg");
        ui.choice3.setText("Rustboro");

//        game.position = "Direction"; //access the variable spring


        game.position1 = "forwardEjay";
        game.position3 = "leftEjay";
        game.position4 = "rightEjay";


    }
    public void forwardEjay() {
        sound.stopEjay();

        ui.mainTextArea.setText("A Wild Gyrados Appeared\n" +
                "What will you do...\n" );
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("Surrender");

        //       game.position = "Direction"; //access the variable spring

        game.position1 = "forwardEjayFight";
        game.position3 = "run";
        game.position4 = "surrender";


    }

    public void fightEjayForward() {

        ui.mainTextArea.setText("You chose to fight. Choose an ability\n");
        ui.choice1.setText("Slap");
        ui.choice2.setText("Insult");
        ui.choice3.setText("Kick Balls");
        ui.choice4.setText("Potion");

        game.position1 = "slapForward";
        game.position3 = "insultForward";
        game.position4 = "kickBallsForward";
        game.position5 = "potion4";

    }
    public void ejayAttackForward() throws UnsupportedAudioFileException, LineUnavailableException, IOException { //pikachu


        if (game.position4.equals("slapForward")) {
            sound.slapSound();
            sound.playSlap();
            playerDamage = new Random().nextInt(10);
            ui.mainTextArea.setText("You attacked Gyrados with " + "slap" + " gave " + playerDamage + " damage\n" +
                    "told you, his weak");
        } else if (game.position4.equals("insultForward")) {
            sound.insultSound();
            sound.playInsult();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Gyrados with " + "insult" + " gave " + playerDamage + " damage\n" +
                    "told you, his weak");
        } else if (game.position4.equals("kickBallsForward")) {
            sound.kickBallsSound();
            sound.playKickballs();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Gyrados with " + "kick balls" + " gave " + playerDamage + " damage\n" +
                    "told you, his weak");
        }


        ui.mainTextArea.setLineWrap(true);
        pokemon.Hp = pokemon.Hp - playerDamage;
        ui.enemyHPLabel.setText("" + pokemon.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (pokemon.Hp > 0) {
            game.position1 = "gyradosejayAttackForward";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion4";
        } else if (pokemon.Hp < 0) {
            game.position1 = "win";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void gyradosEjayAttackForward() {



        monsterDamage = new Random().nextInt(80);

        ui.mainTextArea.setText("Gyrados Attack you and gave you " + monsterDamage + " damage");

        player.Hp = player.Hp - monsterDamage;
        ui.hpLabelNumber.setText("" + player.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (player.Hp > 0) {
            game.position1 = "forwardEjayFight";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion4";
        } else if (player.Hp < 0) {
            game.position1 = "lose";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void leftEjay(){

        ui.mainTextArea.setText("A Wild Totodile Appeared\n" +
                "What will you do...");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("Surrender");

        //       game.position = "Direction"; //access the variable spring

        game.position1 = "leftEjayFight";
        game.position3 = "run";
        game.position4 = "surrender";
    }
    public void leftEjayFight() {

        ui.mainTextArea.setText("You chose to fight. Choose an ability");
        ui.choice1.setText("Slap");
        ui.choice2.setText("Insult");
        ui.choice3.setText(("Kick Balls"));
        ui.choice4.setText("Potion");

        game.position1 = "slapLeft";
        game.position3 = "insultLeft";
        game.position4 = "kickBallsLeft";
        game.position5 = "potion5";

    }
    public void ejayAttackLeft() throws UnsupportedAudioFileException, LineUnavailableException, IOException { //pikachu


        if (game.position4.equals("slapLeft")) {
            sound.slapSound();
            sound.playSlap();
            playerDamage = new Random().nextInt(10);
            ui.mainTextArea.setText("You attacked Totodile with " + "slap" + " gave " + playerDamage + " damage\n" +
                    "told you, his weak");
        } else if (game.position4.equals("insultLeft")) {
            sound.insultSound();
            sound.playInsult();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Totodile with " + "insult" + " gave " + playerDamage + " damage\n" +
                    "told you, his weak");
        } else if (game.position4.equals("kickBallsLeft")) {
            sound.kickBallsSound();
            sound.playKickballs();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Totodile with " + "kick balls" + " gave " + playerDamage + " damage\n" +
                    "told you, his weak");
        }

        ui.mainTextArea.setLineWrap(true);
        pokemon.Hp = pokemon.Hp - playerDamage;
        ui.enemyHPLabel.setText("" + pokemon.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (pokemon.Hp > 0) {
            game.position1 = "TotodileejayAttackLeft";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion5";
        } else if (pokemon.Hp < 0) {
            game.position1 = "win";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void totodileEjayAttackLeft() {


        monsterDamage = new Random().nextInt(80);

        ui.mainTextArea.setText("Totodile Attack you and gave you " + monsterDamage + " damage");

        player.Hp = player.Hp - monsterDamage;
        ui.hpLabelNumber.setText("" + player.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (player.Hp > 0) {
            game.position1 = "leftEjayFight";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion5";
        } else if (player.Hp < 0) {
            game.position1 = "lose";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void rightEjay(){
        sound.stopEjay();
        ui.mainTextArea.setText("A Wild Mewtwo Appeared\n" +
                "What will you do...");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("Surrender");

        //       game.position = "Direction"; //access the variable spring

        game.position1 = "rightEjayFight";
        game.position3 = "run";
        game.position4 = "surrender";
    }
    public void rightEjayFight() {

        ui.mainTextArea.setText("You chose to fight. Choose an ability");
        ui.choice1.setText("Slap");
        ui.choice2.setText("Insult");
        ui.choice3.setText(("Kick Balls"));
        ui.choice4.setText("Potion");

        game.position1 = "slapRight";
        game.position3 = "insultRight";
        game.position4 = "kickBallsRight";
        game.position5 = "potion6";

    }
    public void ejayAttackRight() throws UnsupportedAudioFileException, LineUnavailableException, IOException { //pikachu



        if (game.position4.equals("slapRight")) {
            sound.slapSound();
            sound.playSlap();
            playerDamage = new Random().nextInt(10);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "slap" + " gave " + playerDamage + " damage");
        } else if (game.position4.equals("insultRight")) {
            sound.insultSound();
            sound.playInsult();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "insult" + " gave " + playerDamage + " damage\n" +
                    "told you, his weak");
        } else if (game.position4.equals("kickBallsRight")) {
            sound.kickBallsSound();
            sound.playKickballs();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "kickballs" + " gave " + playerDamage + " damage\n" +
                    "told you, his weak");
        }

        ui.mainTextArea.setLineWrap(true);
        pokemon.Hp = pokemon.Hp - playerDamage;
        ui.enemyHPLabel.setText("" + pokemon.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (pokemon.Hp > 0) {
            game.position1 = "mewtwoEjayAttackRight";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion6";
        } else if (pokemon.Hp < 0) {
            game.position1 = "win";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void mewtwoEjayAttackRight() {


        monsterDamage = new Random().nextInt(80);

        ui.mainTextArea.setText("Mewtwo Attack you and gave you " + monsterDamage + " damage");

        player.Hp = player.Hp - monsterDamage;
        ui.hpLabelNumber.setText("" + player.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (player.Hp > 0) {
            game.position1 = "rightEjayFight";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion6";
        } else if (player.Hp < 0) {
            game.position1 = "lose";
            game.position3 = "";
            game.position4 = "";
        }


    }

/////////////////////////////////////////////
    public void setDirectionMew() {


    ui.mainTextArea.setText("Where would you like to go:");
    ui.choice1.setText("LittleRoot");
    ui.choice2.setText("Petalburg");
    ui.choice3.setText("Rustboro");

//        game.position = "Direction"; //access the variable spring


    game.position1 = "forwardMew";
    game.position3 = "leftMew";
    game.position4 = "rightMew";

}
    public void forwardMew() {


        ui.mainTextArea.setText("A Wild Gyrados Appeared\n" +
                "What will you do...");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("Surrender");

        //       game.position = "Direction"; //access the variable spring

        game.position1 = "forwardMewFight";
        game.position3 = "run";
        game.position4 = "surrender";
    }
    public void forwardMewFight() {

        ui.mainTextArea.setText("You chose to fight. Choose an ability");
        ui.choice1.setText("psychic");
        ui.choice2.setText("supernova");
        ui.choice3.setText(("hyperbeam"));
        ui.choice4.setText("Potion");

        game.position1 = "psychicForward";
        game.position3 = "supernovaForward";
        game.position4 = "hyperbeamForward";
        game.position5 = "potion7";

    }
    public void mewAttackForward() throws UnsupportedAudioFileException, LineUnavailableException, IOException { //pikachu


        if (game.position4.equals("psychicForward")) {
            sound.psychic();
            sound.playPsychic();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "psychic" + " gave " + playerDamage + " damage");
        } else if (game.position4.equals("supernovaForward")) {
            sound.supernova();
            sound.playSupernova();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "supernova" + " gave " + playerDamage + " damage");
        } else if (game.position4.equals("hyperbeamForward")) {
            sound.hyperbeam();
            sound.playHyperbeam();
            playerDamage = new Random().nextInt(10);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "kick balls" + " gave " + playerDamage + " damage");
        }


        ui.mainTextArea.setLineWrap(true);
        pokemon.Hp = pokemon.Hp - playerDamage;
        ui.enemyHPLabel.setText("" + pokemon.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (pokemon.Hp > 0) {
            game.position1 = "gyradosMewAttackForward";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion7";
        } else if (pokemon.Hp < 0) {
            game.position1 = "win";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void gyradosMewAttackForward() {


        monsterDamage = new Random().nextInt(25);

        ui.mainTextArea.setText("Gyrados Attack you and gave you " + monsterDamage + " damage");

        player.Hp = player.Hp - monsterDamage;
        ui.hpLabelNumber.setText("" + player.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (player.Hp > 0) {
            game.position1 = "forwardMewFight";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion7";
        } else if (player.Hp < 0) {
            game.position1 = "lose";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void leftMew() {

        ui.mainTextArea.setText("A Wild Totodile Appeared\n" +
                "What will you do...");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("Surrender");

        //       game.position = "Direction"; //access the variable spring

        game.position1 = "leftMewFight";
        game.position3 = "run";
        game.position4 = "surrender";
    }
    public void leftMewFight() {

        ui.mainTextArea.setText("You chose to fight. Choose an ability");
        ui.choice1.setText("psychic");
        ui.choice2.setText("supernova");
        ui.choice3.setText(("hyperbeam"));
        ui.choice4.setText("Potion");

        game.position1 = "psychicLeft";
        game.position3 = "supernovaLeft";
        game.position4 = "hyperbeamLeft";
        game.position5 = "potion8";

    }
    public void mewtotoAttackLeft() throws UnsupportedAudioFileException, LineUnavailableException, IOException { //pikachu


        if (game.position4.equals("psychicLeft")) {
            sound.psychic();
            sound.playPsychic();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Totodile with " + "psychic" + " gave " + playerDamage + " damage");
        } else if (game.position4.equals("supernovaLeft")) {
            sound.supernova();
            sound.playSupernova();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Totodile with " + "supernova" + " gave " + playerDamage + " damage");
        } else if (game.position4.equals("hyperbeamLeft")) {
            sound.hyperbeam();
            sound.playHyperbeam();
            playerDamage = new Random().nextInt(10);
            ui.mainTextArea.setText("You attacked Totodile with " + "kick balls" + " gave " + playerDamage + " damage");
        }


        ui.mainTextArea.setLineWrap(true);
        pokemon.Hp = pokemon.Hp - playerDamage;
        ui.enemyHPLabel.setText("" + pokemon.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (pokemon.Hp > 0) {
            game.position1 = "totoMewAttackLeft";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion8";
        } else if (pokemon.Hp < 0) {
            game.position1 = "win";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void totoMewAttackLeft() {


        monsterDamage = new Random().nextInt(30);

        ui.mainTextArea.setText("Totodile Attack you and gave you " + monsterDamage + " damage");

        player.Hp = player.Hp - monsterDamage;
        ui.hpLabelNumber.setText("" + player.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (player.Hp > 0) {
            game.position1 = "leftMewFight";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion8";
        } else if (player.Hp < 0) {
            game.position1 = "lose";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void rightMew() {

        ui.mainTextArea.setText("A Wild Mewtwo Appeared\n" +
                "What will you do...");
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("Surrender");

        //       game.position = "Direction"; //access the variable spring

        game.position1 = "rightMewFight";
        game.position3 = "run";
        game.position4 = "surrender";
    }
    public void rightMewFight() {

        ui.mainTextArea.setText("You chose to fight. Choose an ability");
        ui.choice1.setText("psychic");
        ui.choice2.setText("supernova");
        ui.choice3.setText(("hyperbeam"));
        ui.choice4.setText("Potion");

        game.position1 = "psychicRight";
        game.position3 = "supernovaRight";
        game.position4 = "hyperbeamRight";
        game.position5 = "potion9";

    }
    public void mewMewtwoAttackRight() throws UnsupportedAudioFileException, LineUnavailableException, IOException { //pikachu


        if (game.position4.equals("psychicRight")) {
            sound.psychic();
            sound.playPsychic();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "psychic" + " gave " + playerDamage + " damage");
        } else if (game.position4.equals("supernovaRight")) {
            sound.supernova();
            sound.playSupernova();
            playerDamage = new Random().nextInt(20);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "supernova" + " gave " + playerDamage + " damage");
        } else if (game.position4.equals("hyperbeamRight")) {
            sound.hyperbeam();
            sound.playHyperbeam();
            playerDamage = new Random().nextInt(10);
            ui.mainTextArea.setText("You attacked Mewtwo with " + "kick balls" + " gave " + playerDamage + " damage");
        }


        ui.mainTextArea.setLineWrap(true);
        pokemon.Hp = pokemon.Hp - playerDamage;
        ui.enemyHPLabel.setText("" + pokemon.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (pokemon.Hp > 0) {
            game.position1 = "mewtwoMewAttackRight";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion9";
        } else if (pokemon.Hp < 0) {
            game.position1 = "win";
            game.position3 = "";
            game.position4 = "";
        }


    }
    public void mewtwoMewAttackRight() {


        monsterDamage = new Random().nextInt(25);

        ui.mainTextArea.setText("Mewtwo Attack you and gave you " + monsterDamage + " damage");

        player.Hp = player.Hp - monsterDamage;
        ui.hpLabelNumber.setText("" + player.Hp);


        ui.choice1.setText("Continue...");
        ui.choice2.setText("");
        ui.choice3.setText("");

        if (player.Hp > 0) {
            game.position1 = "rightMewFight";
            game.position3 = "";
            game.position4 = "";
            game.position5 = "potion9";
        } else if (player.Hp < 0) {
            game.position1 = "lose";
            game.position3 = "";
            game.position4 = "";
        }


    }






/////////////////////////////////


    /////////////////////////////////////////////////////////////////////////
    public void win() {
        ui.choiceButtonPanel.setVisible(false);


        answer = JOptionPane.showConfirmDialog(null, "YOUUU WINN!!!!.\n PLEASE COLLECT YOUR REWARD" +
                " UNDER YOUR BED\n" + "CLICK YES/NO ONCE COLLECTED!", "REWARDDDDD", JOptionPane.YES_NO_CANCEL_OPTION);

        ui.mainTextArea.setText("CONGRATULATION!!!!!!!! ");
        ui.choice1.setText("");
        ui.choice2.setText("");
        ui.choice3.setText("");

    }

    public void lose() throws UnsupportedAudioFileException, LineUnavailableException, IOException {

        ui.choiceButtonPanel.setVisible(false);

        sound.loseSound();
        sound.playlose();

        answer = JOptionPane.showConfirmDialog(null, "YOUUU Lost!!!!\n" + "TRY AGAIN?", "TRY AGAIN???", JOptionPane.YES_NO_CANCEL_OPTION); //yes or no panel

        ui.mainTextArea.setText("You are Dead\n\n <Game Over!!!!!>");

        ui.choice1.setText("");
        ui.choice2.setText("");
        ui.choice3.setText("");
    }


    public void run() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        sound.stopbat();
        setPokemon();

    }

    public void surrender() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        sound.stopbat();
        sound.loseSound();
        sound.playlose();
        lose();

    }
    public void potion() {
        player.Hp = player.Hp + 10;

        ui.hpLabelNumber.setText("" + player.Hp);

    }


}


