package states;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tomas.game.FindArne;

import java.util.Random;

import sprites.Person;

public class PlayState extends State {

    private Texture blueBackground;
    private Person person;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        blueBackground = new Texture("blueBackground.jpg");
        person = new Person(createRandomXCoordinate(), createRandomYCoordinate());


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
        sb.draw(blueBackground, 0, 0, FindArne.WIDTH, FindArne.HEIGHT);
        sb.draw(person.getPersonImg(), person.getXCoordinate(), person.getYCoordinate());
        sb.end();
    }

    @Override
    public void dispose() {

    }

    public float createRandomXCoordinate() {
        Random random = new Random();
        float randomXCoordinate = random.nextFloat() * (FindArne.WIDTH);
        return randomXCoordinate;
    }

    private float createRandomYCoordinate() {
        Random random = new Random();
        float randomYCoordinate = random.nextFloat() * (FindArne.WIDTH);
        return randomYCoordinate;
    }
}
