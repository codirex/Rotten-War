package org.codirex.rottenwar;

import android.content.SharedPreferences;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import org.codirex.rottenwar.screen.MainScreen;

public class MyGame extends Game {

    public Preferences preference;
    public SpriteBatch batch;
    public BitmapFont font;
    public FitViewport viewport;

    @Override
    public void create() {
        preference = Gdx.app.getPreferences("settings");
        batch = new SpriteBatch();
        font = new BitmapFont();
        viewport = new FitViewport(48, 24);
        font.setUseIntegerPositions(false);
        font.getData().setScale(viewport.getWorldHeight() / Gdx.graphics.getHeight());

        this.setScreen(new MainScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
        font.dispose();
    }

    public void enableSounds(boolean flag) {
		preference.putBoolean("sounds", flag);
	}
	
	public boolean isSoundsEnabled() {
	    return preference.getBoolean("sounds");
	}
	
	public void enableMusic(boolean flag) {
		preference.putBoolean("music", flag);
	}
	
	public boolean isMusicEnabled() {
	    return preference.getBoolean("music");
	}
	
	
	
	
	
	

}
