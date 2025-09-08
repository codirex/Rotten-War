package com.codirex.rottenwar.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

package org.codirex.rottenwar.utils;


public class Settings {
    private static final String PREFS_NAME = "rottenwar_settings";
    private static final String SOUND_KEY = "sound";
    private static final String MUSIC_KEY = "music";

    private static Preferences prefs = Gdx.app.getPreferences(PREFS_NAME);

    public static boolean isSoundEnabled() {
        return prefs.getBoolean(SOUND_KEY, true);
    }

    public static void setSoundEnabled(boolean enabled) {
        prefs.putBoolean(SOUND_KEY, enabled);
        prefs.flush();
    }

    public static boolean isMusicEnabled() {
        return prefs.getBoolean(MUSIC_KEY, true);
    }

    public static void setMusicEnabled(boolean enabled) {
        prefs.putBoolean(MUSIC_KEY, enabled);
        prefs.flush();
    }
}