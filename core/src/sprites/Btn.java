package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;
import com.tomas.game.FindArne;

public class Btn {

    private Texture plyBtnUnpressed;
    private Texture playBtnPressed;
    private Vector3 position;

    public Btn(){
        plyBtnUnpressed = new Texture("playBtnUnpressed.png");
        playBtnPressed = new Texture("playBtnPressed.png");

        float btnCoordinateX = FindArne.WIDTH/2 - plyBtnUnpressed.getWidth()/2;
        float btnCoordinateY = FindArne.HEIGHT/20;

        position = new Vector3(btnCoordinateX, btnCoordinateY, 0);
    }

    public float getPositionX(){
        return position.x;
    }

    public float getPositionY(){
        return position.y;
    }

    public Texture getPlyBtnUnpressed(){
        return plyBtnUnpressed;
    }

    public Texture getPlayBtnPressed(){
        return playBtnPressed;
    }
}
