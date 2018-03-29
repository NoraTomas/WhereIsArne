package states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.tomas.game.FindArne;

import sprites.Btn;

public class MenuState extends State {

    private Texture background;
    private Btn btn;
    private Texture currentBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("menuBG.png");
        btn = new Btn();

        currentBtn = btn.getPlyBtnUnpressed();
    }

    @Override
    public void handleInput() {
        if(Gdx.input.isTouched() && touchWithinButtonBordersX() &&
                touchWithinButtonBordersY()){
            gsm.set(new PlayState(gsm));
        }

        if(touchWithinButtonBordersX() && touchWithinButtonBordersY()){
            currentBtn = btn.getPlayBtnPressed();
        }

        else{
            currentBtn = btn.getPlyBtnUnpressed();
        }
    }

    private boolean touchWithinButtonBordersX() {
        float leftX = btn.getPositionX();
        float rightX = btn.getPositionX() + btn.getPlyBtnUnpressed().getWidth();

        if (Gdx.input.getX() > leftX && Gdx.input.getX() < rightX){
            return true;
        }
        return false;
    }

    private boolean touchWithinButtonBordersY(){
        //Y-coordinate of textures are high low in the image, and low high in the image
        float lowYInverted = btn.getPositionY();
        float highYInverted = btn.getPositionY() + btn.getPlyBtnUnpressed().getHeight();

        float highY = FindArne.HEIGHT - lowYInverted;
        float lowY = FindArne.HEIGHT - highYInverted;

        if(Gdx.input.getY() > lowY && Gdx.input.getY() < highY){
            return true;
        }
        return false;
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FindArne.WIDTH, FindArne.HEIGHT);
        sb.draw(currentBtn, btn.getPositionX(),
                btn.getPositionY());
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        btn.getPlyBtnUnpressed().dispose();
    }
}

