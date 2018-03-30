package states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tomas.game.FindArne;

public class WinState extends State{

    private Texture redbackground;

    protected WinState(GameStateManager gsm) {
        super(gsm);
        redbackground = new Texture("redbackground.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(redbackground, 0, 0, FindArne.WIDTH, FindArne.HEIGHT);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
