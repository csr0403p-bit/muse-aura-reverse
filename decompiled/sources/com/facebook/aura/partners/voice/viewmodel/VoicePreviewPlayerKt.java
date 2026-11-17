package com.facebook.aura.partners.voice.viewmodel;

import android.media.AudioDeviceInfo;
import android.media.MediaPlayer;

/* loaded from: classes4.dex */
public abstract class VoicePreviewPlayerKt {
    public static final int MAX_PENDING_PREVIEW_PCM_BYTES = 2880000;
    public static final int PREVIEW_PCM_BUFFER_SECONDS = 60;
    public static final int PREVIEW_PCM_BYTES_PER_SAMPLE = 2;
    public static final String TAG = "VoicePreviewPlayer";

    public static final VoicePreviewPlayerState diagnosticState(MediaPlayer mediaPlayer, int i) {
        try {
            AudioDeviceInfo routedDevice = mediaPlayer.getRoutedDevice();
            return new VoicePreviewPlayerState(i, routedDevice != null ? Integer.valueOf(routedDevice.getType()) : null, Boolean.valueOf(mediaPlayer.isPlaying()), Long.valueOf(mediaPlayer.getCurrentPosition()), Long.valueOf(mediaPlayer.getDuration()));
        } catch (IllegalStateException unused) {
            return new VoicePreviewPlayerState(i, null, null, null, null);
        }
    }
}
