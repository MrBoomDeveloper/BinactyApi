package com.mrboomdev.binacty.client.backend;

import com.mrboomdev.binacty.frontend.audio.Music;
import com.mrboomdev.binacty.frontend.audio.Sound;

public interface AudioBackend {
    void play(Music music);
    void stop(Music music);
    void seekTo(Music music, float time);
    float getCurrentTime(Music music);
    long play(Sound sound, float volume);
    void setLooping(Sound sound, long id, boolean isLooping);
    void setVolume(Sound sound, long id, float volume);
    void stop(Sound sound, long id);
    void pause(Sound sound, long id);
    void resume(Sound sound, long id);
}