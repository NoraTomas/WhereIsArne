package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;
import com.tomas.game.FindArne;
import java.util.Random;

public class Person {

    private Vector3 position;
    private Texture personImg1;
    private Texture personImg2;
    private Texture personImg3;
    private Texture personImg4;
    private Texture personImg5;
    private Texture personImg6;
    private Texture personImg7;
    private Texture personImg8;
    private Texture personImg9;
    private Texture personImg10;

    private Texture currentPersonImg;



    public Person(){
        Random random = new Random();

        personImg1 = new Texture("npc1.png");
        personImg2 = new Texture("npc2.png");
        personImg3 = new Texture("npc3.png");
        personImg4 = new Texture("npc4.png");
        personImg5 = new Texture("npc5.png");
        personImg6 = new Texture("npc6.png");
        personImg7 = new Texture("npc7.png");
        personImg8 = new Texture("npc8.png");
        personImg9 = new Texture("npc9.png");
        personImg10 = new Texture("npc10.png");

        position = new Vector3(createXCoordinates(), createYCoordinate(), 0);

        int randomNumber = Math.round(random.nextInt(9) + 1);

        setCurrentPersonImg(randomNumber);

    }

    private void setCurrentPersonImg(int randomNumber) {
        switch (randomNumber){
            case 1: currentPersonImg = personImg1;
                break;

            case 2: currentPersonImg = personImg2;
                break;

            case 3: currentPersonImg = personImg3;
                break;

            case 4: currentPersonImg = personImg4;
                break;

            case 5: currentPersonImg = personImg5;
                break;

            case 6: currentPersonImg = personImg6;
                break;

            case 7: currentPersonImg = personImg7;
                break;

            case 8: currentPersonImg = personImg8;
                break;

            case 9: currentPersonImg = personImg9;
                break;

            case 10: currentPersonImg = personImg10;
                break;
        }
    }


    public float createXCoordinates(){
        Random random = new Random();
        float randomXCoordinate = random.nextFloat() * (FindArne.WIDTH);

        if(randomXCoordinate < personImg1.getWidth()){
            return personImg1.getWidth();
        }

        else return randomXCoordinate - personImg1.getWidth();
    }

    public float createYCoordinate(){
        Random random = new Random();
        float randomYCoordinate = random.nextFloat() * (FindArne.WIDTH);
        if(randomYCoordinate > FindArne.HEIGHT - personImg1.getHeight()){
            return FindArne.HEIGHT - personImg1.getHeight();
        }

        else return randomYCoordinate;
    }

    public float getXCoordinate(){
        return position.x;
    }

    public float getYCoordinate(){
        return position.y;
    }

    public Texture getCurrentPersonImg(){
        return currentPersonImg;
    }

}
