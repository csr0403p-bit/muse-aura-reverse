package com.facebook.aura.partners.voice.viewmodel;

import X.AGH;
import X.AIW;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.CFK;
import X.FGI;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class VoicePreviewDiagnosticsKt {
    public static final String EVENT_NAME = "voice_preview_audio_diagnostic";
    public static final String EVENT_TYPE = "diagnostic";
    public static final double MIN_MEAN_SQUARE = 1.0E-12d;
    public static final double MIN_PEAK = 1.0E-6d;
    public static final double PCM16_FULL_SCALE = 32768.0d;
    public static final long PLAYING_SNAPSHOT_DELAY_MS = 250;
    public static final String TAG = "VoicePreviewAudio";

    public static final void putStreamVolume(Map<String, String> map, AudioManager audioManager, String str, int i) {
        map.put(FGI.A0M(str, "_volume"), String.valueOf(audioManager.getStreamVolume(i)));
        map.put(FGI.A0M(str, "_volume_max"), String.valueOf(audioManager.getStreamMaxVolume(i)));
        map.put(FGI.A0M(str, "_muted"), String.valueOf(audioManager.isStreamMute(i)));
    }

    public static final Map<String, String> audioSystemFields() {
        try {
            AudioManager audioManager = (AudioManager) C3cG.A06().getSystemService(AudioManager.class);
            if (audioManager == null) {
                return AGH.A0E();
            }
            C0924AIa c0924AIaA0u = C3cG.A0u();
            c0924AIaA0u.put("audio_mode", String.valueOf(audioManager.getMode()));
            putStreamVolume(c0924AIaA0u, audioManager, "music", 3);
            putStreamVolume(c0924AIaA0u, audioManager, "voice_call", 0);
            int i = Build.VERSION.SDK_INT;
            if (i < 37) {
                if (i >= 31) {
                }
                return AIW.A0K(c0924AIaA0u);
            }
            putStreamVolume(c0924AIaA0u, audioManager, "assistant", 11);
            AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
            if (communicationDevice != null) {
                c0924AIaA0u.put("communication_device_type", String.valueOf(communicationDevice.getType()));
            }
            return AIW.A0K(c0924AIaA0u);
        } catch (RuntimeException e) {
            CFK.A0A(TAG, "Failed to read audio state", e);
            return AGH.A0E();
        }
    }

    public static final Map<String, String> toFields(VoicePreviewPlayerState voicePreviewPlayerState) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("preview_usage", String.valueOf(voicePreviewPlayerState.usage));
        Integer num = voicePreviewPlayerState.routedDeviceType;
        if (num != null) {
            c0924AIaA0u.put("routed_device_type", String.valueOf(num.intValue()));
        }
        Boolean bool = voicePreviewPlayerState.isPlaying;
        if (bool != null) {
            C3cI.A1K("player_playing", c0924AIaA0u, bool.booleanValue());
        }
        Long l = voicePreviewPlayerState.positionMs;
        if (l != null) {
            C3cH.A1A("position_ms", c0924AIaA0u, l.longValue());
        }
        Long l2 = voicePreviewPlayerState.durationMs;
        if (l2 != null) {
            C3cH.A1A("duration_ms", c0924AIaA0u, l2.longValue());
        }
        return AIW.A0K(c0924AIaA0u);
    }
}
