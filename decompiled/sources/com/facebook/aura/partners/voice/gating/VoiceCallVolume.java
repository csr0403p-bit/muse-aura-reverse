package com.facebook.aura.partners.voice.gating;

import X.Ab3;
import X.AnonymousClass002;
import X.C22I;
import X.C3Em;
import X.C3cG;
import X.C3pd;
import X.C79;
import X.C9290GCr;
import android.media.AudioManager;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceCallVolume {
    public static final VoiceCallVolume INSTANCE = new VoiceCallVolume();
    public static final C22I<Unit> adjustments;
    public static final C3Em<Unit> mutableAdjustments;

    public final class Lease {
        public final int raisedTo;
        public final int stream;

        public final void restore() {
            AudioManager audioManager = VoiceCallVolume.INSTANCE.audioManager();
            if (audioManager == null || audioManager.getStreamVolume(this.stream) != this.raisedTo) {
                return;
            }
            audioManager.setStreamVolume(this.stream, 0, 1);
        }

        public Lease(int i, int i2) {
            this.stream = i;
            this.raisedTo = i2;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceCallAudioStream.values().length];
            try {
                AnonymousClass002.A13(VoiceCallAudioStream.VOICE_CALL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceCallAudioStream.MEDIA, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceCallAudioStream.ASSISTANT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 1);
        mutableAdjustments = c9290GCrA12;
        adjustments = C3pd.A00(c9290GCrA12);
    }

    public static final /* synthetic */ int access$getUiFlags(VoiceCallVolume voiceCallVolume) {
        return 1;
    }

    private final boolean getShowsOwnCallVolume() {
        return false;
    }

    private final int getUiFlags() {
        return 1;
    }

    public final Integer callStream() {
        int iOrdinal = VoiceGating.INSTANCE.getCallAudioStream().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal == 1) {
            return null;
        }
        throw C3cG.A0q();
    }

    public final C22I<Unit> getAdjustments() {
        return adjustments;
    }

    public final AudioManager audioManager() {
        return (AudioManager) C3cG.A06().getSystemService(AudioManager.class);
    }

    public final Lease raiseFromZero() {
        Integer numCallStream = callStream();
        if (numCallStream == null) {
            return null;
        }
        int iIntValue = numCallStream.intValue();
        AudioManager audioManager = audioManager();
        if (audioManager == null || audioManager.getStreamVolume(iIntValue) != 0) {
            return null;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(iIntValue) / 3;
        if (streamMaxVolume < 1) {
            streamMaxVolume = 1;
        }
        audioManager.setStreamVolume(iIntValue, streamMaxVolume, 1);
        return new Lease(iIntValue, audioManager.getStreamVolume(iIntValue));
    }

    public final boolean setPercent(int i) {
        Integer numCallStream = callStream();
        if (numCallStream == null) {
            return false;
        }
        int iIntValue = numCallStream.intValue();
        AudioManager audioManager = audioManager();
        if (audioManager == null) {
            return false;
        }
        audioManager.setStreamVolume(iIntValue, audioManager.getStreamMinVolume(iIntValue) + Ab3.A01(((audioManager.getStreamMaxVolume(iIntValue) - r2) * i) / 100.0f), 1);
        C3cG.A1I(mutableAdjustments);
        return true;
    }

    public final boolean step(boolean z) {
        Integer numCallStream = callStream();
        boolean z2 = false;
        if (numCallStream != null) {
            int iIntValue = numCallStream.intValue();
            AudioManager audioManager = audioManager();
            if (audioManager != null) {
                z2 = true;
                audioManager.adjustStreamVolume(iIntValue, z ? 1 : -1, 1);
                C3cG.A1I(mutableAdjustments);
            }
        }
        return z2;
    }
}
