package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Sound {

    Main game;
    private Clip clip, clipPsychic, clipSupernova, clipSlap, clipInsult, clipKickballs;
    private Clip clipmid,clipTackle,clipThunder,clipThunderbolt, clipWin, clipHyperbeam, clipbat;
    private Clip clipPika, clipEjay,clipGyrados, clipLose, cliptoto, clipmew, clipma, cliptt, clipgy, clipyes, cliprec;


    public Sound(Main g){

        game = g;
    }

    public void startPage() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/1-01 Title Demo 1 (Departure).wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();

        clip.open(audioStream);
        this.clip = clip;

        }
    public void playStartPage() {
        clip.start();
    }
    public void stopStartPage() {
        clip.stop();
        clip.flush();
        clip.close();
    }
    public void midPage() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/1-04 Opening Selection.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipmid = AudioSystem.getClip();

        clipmid.open(audioStream);
        this.clipmid = clipmid;

    }
    public void playMidPage() {
        clipmid.start();
    }
    public void stopMidPage() {
        clipmid.stop();
        clipmid.flush();
        clipmid.close();
    }

    //////////////////////////////////////////
    public void pikachu() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/025 - Kanto - Pikachu.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipPika = AudioSystem.getClip();

        clipPika.open(audioStream);
        this.clipPika = clipPika;

    }
    public void playPikachu() {
        clipPika.start();
    }
    public void stopPikachu() {
        clipPika.stop();
        clipPika.flush();
        clipPika.close();
    }

    public void gyrados() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/130 - Kanto - Gyrados.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipGyrados = AudioSystem.getClip();

        clipGyrados.open(audioStream);
        this.clipGyrados = clipGyrados;


    }
    public void playGyrados() {

        clipGyrados.start();
    }
    public void stopGyrados() {
        clipGyrados.stop();
        clipGyrados.flush();
        clipGyrados.close();
    }
    public void ejaySound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/554 - Unova - Darumaka.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipEjay = AudioSystem.getClip();

        clipEjay.open(audioStream);
        this.clipEjay = clipEjay;

    }
    public void playEjay() {
        clipEjay.start();
    }
    public void stopEjay() {
        clipEjay.stop();
        clipEjay.flush();
        clipEjay.close();
    }

    ///////////////////////////////
    public void thunder() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
            File file = new File("/Users/apple/Downloads/Thunder.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clipThunder = AudioSystem.getClip();

            clipThunder.open(audioStream);
            this.clipThunder = clipThunder;

        }
    public void playThunder() {
            clipThunder.start();
        }
    public void stopThunder() {
            clipThunder.stop();
            clipThunder.flush();
            clipThunder.close();
        }

    public void thunderbolt() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/Thunderbolt2.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipThunderbolt = AudioSystem.getClip();

        clipThunderbolt.open(audioStream);
        this.clipThunderbolt = clipThunderbolt;

    }
    public void playThunderbolt() {
        clipThunderbolt.start();
    }
    public void stopThunderbolt() {
        clipThunderbolt.stop();
        clipThunderbolt.flush();
        clipThunderbolt.close();
    }
    public void tackle() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/Tackle.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipTackle = AudioSystem.getClip();

        clipTackle.open(audioStream);
        this.clipTackle = clipTackle;

    }
    public void playTackle() {
        clipTackle.start();
    }
    public void stopTackle() {
        clipTackle.stop();
        clipTackle.flush();
        clipTackle.close();
    }

    public void winSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/1-52 Get Badge!.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipWin = AudioSystem.getClip();

        clipWin.open(audioStream);
        this.clipWin = clipWin;

    }
    public void playWin() {
        clipWin.start();
    }
    public void stopWin() {
        clipWin.stop();
        clipWin.flush();
        clipWin.close();
    }
    public void loseSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/09 mb game over.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipLose = AudioSystem.getClip();

        clipLose.open(audioStream);
        this.clipLose = clipLose;

    }
    public void playlose() {
        clipLose.start();
    }
    public void stoplose() {
        clipLose.stop();
        clipLose.flush();
        clipLose.close();
    }

    public void psychic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/Psychic.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipPsychic = AudioSystem.getClip();

        clipPsychic.open(audioStream);
        this.clipPsychic = clipPsychic;

    }
    public void playPsychic() {
        clipPsychic.start();

    }

    public void supernova() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/Acid.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipSupernova = AudioSystem.getClip();

        clipSupernova.open(audioStream);
        this.clipSupernova = clipSupernova;

    }
    public void playSupernova() {
        clipSupernova.start();

    }

    public void hyperbeam() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/Psybeam(LOOP).wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipHyperbeam = AudioSystem.getClip();

        clipHyperbeam.open(audioStream);
        this.clipHyperbeam = clipHyperbeam;

    }
    public void playHyperbeam() {
        clipHyperbeam.start();

    }

    public void slapSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/KarateChop.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipSlap = AudioSystem.getClip();

        clipSlap.open(audioStream);
        this.clipSlap = clipSlap;

    }
    public void playSlap() {
        clipSlap.start();

    }

    public void insultSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/CometPunch.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipInsult = AudioSystem.getClip();

        clipInsult.open(audioStream);
        this.clipInsult = clipInsult;

    }
    public void playInsult() {
        clipInsult.start();

    }
    public void kickBallsSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/HornAttack.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipKickballs = AudioSystem.getClip();

        clipKickballs.open(audioStream);
        this.clipKickballs = clipKickballs;

    }
    public void playKickballs() {
        clipKickballs.start();

    }
    public void totodile() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/034 - Kanto - Nidoking.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip cliptoto = AudioSystem.getClip();

        cliptoto.open(audioStream);
        this.cliptoto = cliptoto ;

    }
    public void playToto() {
        cliptoto.start();

    }
    public void mewtwo() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/150 - Kanto - Mewtwo.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipmew = AudioSystem.getClip();

        clipmew.open(audioStream);
        this.clipmew = clipmew ;

    }
    public void playmew() {
        clipmew.start();

    }
    public void gyradosAttack() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/Bubblebeam.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipgy = AudioSystem.getClip();

        clipgy.open(audioStream);
        this.clipgy = clipgy ;

    }
    public void playgy() {
        clipgy.start();

    }
    public void totoAttack() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/Blizzard.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip cliptt = AudioSystem.getClip();

        cliptt.open(audioStream);
        this.cliptt = cliptt ;

    }
    public void playtt() {
        cliptt.start();

    }
    public void mewAttack() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/MegaDrain.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipma = AudioSystem.getClip();

        clipma.open(audioStream);
        this.clipma = clipma ;

    }
    public void playma() {
        clipma.start();

    }
    public void battle() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/1-17 Battle! Trainer.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipbat = AudioSystem.getClip();

        clipbat.open(audioStream);
        this.clipbat = clipbat ;

    }
    public void playbat() {
        clipbat.start();

    }
    public void stopbat() {
        clipbat.stop();
        clipbat.flush();
        clipbat.close();
    }

    public void recovery() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/1-14 Recovery.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip cliprec = AudioSystem.getClip();

        cliprec.open(audioStream);
        this.cliprec = cliprec ;

    }
    public void playrec() {
        cliprec.start();

    }
    public void stoprec() {
        cliprec.stop();
        cliprec.flush();
        cliprec.close();
    }
    public void yes() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("/Users/apple/Downloads/01 When You Wish Upon a Star.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clipyes = AudioSystem.getClip();

        clipyes.open(audioStream);
        this.clipyes = clipyes ;

    }
    public void playYes() {
        clipyes.start();

    }
    public void stopYes() {
        clipyes.stop();
        clipyes.flush();
        clipyes.close();
    }














    public void buttonSound() {
        File file = new File("/Users/apple/Downloads/Chest Drop.wav");
        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Clip clip3 = null;
        try {
            clip3 = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        try {
            clip3.open(audioStream);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        clip3.start();
    }


}
