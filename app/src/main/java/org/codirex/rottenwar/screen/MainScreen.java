package org.codirex.rottenwar.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import org.codirex.rottenwar.MyGame;

public class MainScreen implements Screen {
    private MyGame game;
	private Texture background;
	private Music music;

    public MainScreen(MyGame game) {
        this.game = game;
		background = new Texture("background.jpg");
		music = Gdx.audio.newMusic(Gdx.files.internal("sounds/background.m4a"));
		music.setLooping(true);
		music.setVolume(0.8f);
    }

    @Override
    public void show() {
		music.play();
	}

    @Override
    public void render(float arg0) {
		ScreenUtils.clear(Color.BLACK);
		game.viewport.apply();
		game.batch.setProjectionMatrix(game.viewport.getCamera().combined);

		game.batch.begin();
		game.batch.draw(background, 0, 0, game.viewport.getWorldWidth(), game.viewport.getWorldHeight());
		game.font.draw(game.batch, "Welcome to Drop!!! ", 1, 1.5f);
		game.font.draw(game.batch, "Tap anywhere to begin!", 1, 1);
		game.batch.end();
	}

    @Override
    public void resize(int arg0, int arg1) {
		game.viewport.update(arg0, arg1, true);
	}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {}
}
