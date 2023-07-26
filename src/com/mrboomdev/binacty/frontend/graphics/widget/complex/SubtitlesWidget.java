package com.mrboomdev.binacty.frontend.graphics.widget.complex;

import com.mrboomdev.binacty.frontend.audio.DynamicMusic;
import com.mrboomdev.binacty.frontend.audio.Music;
import com.mrboomdev.binacty.frontend.graphics.widget.Widget;

import java.util.List;

public class SubtitlesWidget extends Widget {
    private SubtitlesWidgetListener startListener, endListener;
    private List<SubtitlesLine> lines;
    private DynamicMusic trackedDynamicMusic;
    private Music trackedMusic;
    private boolean isAuto;

    public SubtitlesWidget setLines(List<SubtitlesLine> lines) {
        this.lines = lines;
        return this;
    }

    public SubtitlesWidget setAuto(boolean isAuto) {
        this.isAuto = isAuto;
        return this;
    }

    public SubtitlesWidget setTrackedAudio(DynamicMusic dynamicMusic) {
        this.trackedDynamicMusic = dynamicMusic;
        return this;
    }

    public SubtitlesWidget setTrackedAudio(Music music) {
        this.trackedMusic = music;
        return this;
    }

    public SubtitlesWidget setOnLineStartListener(SubtitlesWidgetListener listener) {
        this.startListener = listener;
        return this;
    }

    public SubtitlesWidget setOnLineEndListener(SubtitlesWidgetListener listener) {
        this.endListener = listener;
        return this;
    }

    public static class SubtitlesLine {
        public String text, id;
        public float speed, duration;
        private Runnable startListener, endListener;

        public SubtitlesLine(String text, float speed, float duration) {
            this.text = text;
            this.speed = speed;
            this.duration = duration;
        }

        public SubtitlesLine setOnStartListener(Runnable listener) {
            this.startListener = listener;
            return this;
        }

        public SubtitlesLine setOnEndListener(Runnable listener) {
            this.endListener = listener;
            return this;
        }
    }

    public interface SubtitlesWidgetListener {
        void run(SubtitlesLine line);
    }
}