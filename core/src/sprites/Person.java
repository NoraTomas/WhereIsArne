package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;
import com.tomas.game.FindArne;
import java.util.Random;

public class Person {
    private Vector3 position;
    private Texture personImg;


    public Person(){
        personImg = new Texture("person.png");
        position = new Vector3(createXCoordinates(), createYCoordinate(), 0);

    }


    public float createXCoordinates(){
        Random random = new Random();
        float randomXCoordinate = random.nextFloat() * (FindArne.WIDTH);
        return randomXCoordinate;
    }

    public float createYCoordinate(){
        Random random = new Random();
        float randomYCoordinate = random.nextFloat() * (FindArne.WIDTH);
        return randomYCoordinate;
    }

    public float getXCoordinate(){
        return position.x;
    }

    public float getYCoordinate(){
        return position.y;
    }

    public Texture getPersonImg(){
        return personImg;
    }

}
