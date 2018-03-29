package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;
import com.tomas.game.FindArne;

public class BtnUnpressed {

    private Texture btnImg;
    private Vector3 position;

    public BtnUnpressed(){
        btnImg = new Texture("playBtnUnpressed.png");

        float btnCoordinateX = FindArne.WIDTH/2 - btnImg.getWidth()/2;
        float btnCoordinateY = FindArne.HEIGHT/20;

        position = new Vector3(btnCoordinateX, btnCoordinateY, 0);
    }

    public float getPositionX(){
        return position.x;
    }

    public float getPositionY(){
        return position.y;
    }

    public Texture getBtnImg(){
        return btnImg;
    }
}
