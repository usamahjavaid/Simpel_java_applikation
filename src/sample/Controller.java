package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.util.Date;
import java.util.Random;

public class Controller {


    @FXML
    ImageView Billede;
    @FXML
    TextArea Board;

    public void printHej() {
        Board.appendText("Hej ");
    }

    public void nuTime(){
        Date date = new Date();

        Board.appendText("Nu er klokken" + date.toString() + "\n");

    }

    public void kastTerning(){
        int random = new Random().nextInt(6)+1;

        Board.appendText(random +"\n");

    }

    public void terningBillede(){

        int random = new Random().nextInt(6)+1;

        if(random == 1){
            Image i2 = new Image("https://www.gratisskole.dk/sdata/minipic/006/00618-600.png");

            Billede.setImage(i2);
        }
        else if (random == 2){
            Image i2 = new Image("https://www.gratisskole.dk/sdata/minipic/006/00619-600.png");

            Billede.setImage(i2);

        }
        else if (random == 3){
            Image i2 = new Image("https://www.gratisskole.dk/sdata/minipic/006/00620-600.jpg");

            Billede.setImage(i2);

        }  else if (random == 4){
            Image i2 = new Image("https://www.gratisskole.dk/sdata/minipic/006/00621-600.png");

            Billede.setImage(i2);

        }  else if (random == 5){
            Image i2 = new Image("https://www.gratisskole.dk/sdata/minipic/006/00622-600.png");

            Billede.setImage(i2);

        }  else if (random == 6){
            Image i2 = new Image("https://www.gratisskole.dk/sdata/minipic/006/00623-300.png");

            Billede.setImage(i2);

        }


        }
        }




