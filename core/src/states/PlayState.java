package states;

import com.badlogic.gdx.Gdx;
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
    private long startTime;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        blueBackground = new Texture("blueBackground.jpg");
        persons = new ArrayList<Person>();
        arne = new Arne();

        for(int i=0; i < 100; i++){
            persons.add(new Person());
        }

        startTime = System.currentTimeMillis();
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        if(Gdx.input.justTouched() && hasClickedOnArne()){
            gsm.push(new WinState(gsm));
        }

        keepTrackOfTime();

        float time = 0;
        time += Gdx.graphics.getDeltaTime();
        long timePassedInSeconds = (System.currentTimeMillis() - startTime);

    }


    private boolean hasClickedOnArne() {
        if(hasClickedBetweenXCoordinates() && hasClickedBetweenYCoordinates()){
            return true;
        }

        return false;
    }



    private boolean hasClickedBetweenXCoordinates() {
        float leftX = arne.getXCoordinate();
        float rightX = arne.getXCoordinate() + arne.getArneImg().getWidth();

        if(Gdx.input.getX() > leftX && Gdx.input.getX() < rightX){
            return true;
        }
        return false;
    }

    private boolean hasClickedBetweenYCoordinates() {
        float lowYInverted = arne.getYCoordinate();
        float highYInverted = arne.getYCoordinate() + arne.getArneImg().getHeight();

        float highY = FindArne.HEIGHT - lowYInverted;
        float lowY = FindArne.HEIGHT - highYInverted;

        if(Gdx.input.getY() > lowY && Gdx.input.getY() < highY){
            return true;
        }
        return false;
    }


    private void keepTrackOfTime() {
        float startTime = System.currentTimeMillis();

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(blueBackground, 0, 0, FindArne.WIDTH, FindArne.HEIGHT);

        for(Person person : persons){
            sb.draw(person.getPersonImg(), person.getXCoordinate(), person.getYCoordinate());
        }
        sb.draw(arne.getArneImg(), arne.getXCoordinate(), arne.getYCoordinate());
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
