package states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tomas.game.FindArne;

import java.util.ArrayList;
import sprites.Person;

public class PlayState extends State {

    private Texture blueBackground;
    private ArrayList<Person> persons;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        blueBackground = new Texture("blueBackground.jpg");
        persons = new ArrayList<Person>();

        for(int i=0; i < 100; i++){
            persons.add(new Person());
        }




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

        for(Person person : persons){
            sb.draw(person.getPersonImg(), person.getXCoordinate(), person.getYCoordinate());
        }
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
