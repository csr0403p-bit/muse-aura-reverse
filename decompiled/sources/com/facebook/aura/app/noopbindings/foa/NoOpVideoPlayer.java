package com.facebook.aura.app.noopbindings.foa;

import android.net.Uri;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class NoOpVideoPlayer {
    public static final NoOpVideoPlayer INSTANCE = new NoOpVideoPlayer();

    public void attachPlayerView(ViewGroup viewGroup) {
    }

    public void detachPlayerView(ViewGroup viewGroup) {
    }

    public int getCurrentPositionMs() {
        return 0;
    }

    public boolean getLooping() {
        return false;
    }

    public float getPlaybackSpeed() {
        return 1.0f;
    }

    public float getVolume() {
        return 0.0f;
    }

    public boolean isPlaying() {
        return false;
    }

    public void pause(String str) {
    }

    public void play() {
    }

    public void release() {
    }

    public void seekTo(int i) {
    }

    public void setLooping(boolean z) {
    }

    public void setPlaybackSpeed(float f) {
    }

    public void setVolume(float f, String str) {
    }

    public void init(Uri uri, String str, String str2, String str3, String str4, Uri uri2, int i, int i2) {
    }
}
