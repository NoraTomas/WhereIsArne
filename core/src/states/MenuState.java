package states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.tomas.game.FindArne;

public class MenuState extends State {

    private Texture background;
    private Texture playbtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playbtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.isTouched() && touchWithinButtonBordersX() &&
                touchWithinButtonBordersY()){
            gsm.set(new PlayState(gsm));
        }
    }

    private boolean touchWithinButtonBordersX() {
        int playbtnStarXtCoordinate = FindArne.WIDTH/2 - playbtn.getWidth()/2;
        int playbtnEndXCoordinate = (FindArne.WIDTH/2 - playbtn.getWidth()/2)
                + playbtn.getWidth();

        if (Gdx.input.getX() > playbtnStarXtCoordinate &&
                Gdx.input.getX() < playbtnEndXCoordinate){
            return true;
        }
        return false;
    }

    private boolean touchWithinButtonBordersY(){
        int playbtnStarYtCoordinate = 288;
        int playbtnEndYtCoordinate = 234;

        if(Gdx.input.getY() < playbtnStarYtCoordinate &&
                Gdx.input.getY() > playbtnEndYtCoordinate){
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
        sb.draw(playbtn, FindArne.WIDTH/2 - playbtn.getWidth()/2, FindArne.HEIGHT/2);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playbtn.dispose();
    }
}

