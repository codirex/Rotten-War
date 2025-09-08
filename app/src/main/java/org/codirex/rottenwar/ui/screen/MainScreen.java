package org.codirex.rottenwar.ui.screen;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class MainScreen implements ApplicationListener {
	
    SpriteBatch spriteBatch;
    FitViewport viewport;
	
	
    @Override
    public void create() {
		spriteBatch = new SpriteBatch();
		viewport = new FitViewport(50, 20);
	}

    @Override
    public void resize(int w, int h) {
		viewport.update(w, h, true);
	}

    @Override
    public void render() {
		input();
		logic();
		draw();
	}
	
	private void input() {
		
	}
	
	private void logic() {
		
	}
	
	private void draw() {
		ScreenUtils.clear(Color.BLACK);
		viewport.apply();
		spriteBatch.setProjectionMatrix(viewport.getCamera().combined);
		spriteBatch.begin();
		spriteBatch.end();
	}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void dispose() {}
}
