package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class Person {
    private Vector3 position;
    private Texture personImg;

    public Person(){
        personImg = new Texture("person.png");
        position = new Vector3(20, 20, 0);
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
