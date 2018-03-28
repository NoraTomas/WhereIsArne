package com.tomas.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tomas.game.FindArne;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = FindArne.TITLE;
		config.width = FindArne.WIDTH;
		config.height = FindArne.HEIGHT;
		new LwjglApplication(new FindArne(), config);
	}
}
