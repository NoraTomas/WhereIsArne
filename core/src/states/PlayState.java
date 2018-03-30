package states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tomas.game.FindArne;

import java.util.ArrayList;

import sprites.Arne;
import sprites.Person;

public class PlayState extends State {

    private Texture blueBackground;
    private ArrayList<Person> persons;
    private Arne arne;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        blueBackground = new Texture("blueBackground.jpg");
        persons = new ArrayList<Person>();
        arne = new Arne();

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
        sb.draw(arne.getPersonImg(), arne.getXCoordinate(), arne.getYCoordinate());
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
