package states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tomas.game.FindArne;

public class WinState extends State{

    private Texture redbackground;
    private BitmapFont font;

    protected WinState(GameStateManager gsm) {
        super(gsm);
        redbackground = new Texture("redbackground.png");
        font = new BitmapFont();

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
        font.draw(sb, "The time you spent was: " + Long.toString(PlayState.TIME_PASSED_IN_SECONDS),
                FindArne.WIDTH/3, FindArne.HEIGHT - FindArne.HEIGHT/7);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
