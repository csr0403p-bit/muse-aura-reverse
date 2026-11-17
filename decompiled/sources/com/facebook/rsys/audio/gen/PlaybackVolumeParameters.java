package com.facebook.rsys.audio.gen;

import X.BV7;
import X.BV8;
import X.C60O;
import X.C8923Ftf;
import X.C8j4;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class PlaybackVolumeParameters {
    public static G50<PlaybackVolumeParameters> CONVERTER = C8923Ftf.A00(48);
    public static long sMcfTypeId;
    public final int streamType;
    public final String userID;
    public final float volume;

    public static native PlaybackVolumeParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlaybackVolumeParameters) {
                PlaybackVolumeParameters playbackVolumeParameters = (PlaybackVolumeParameters) obj;
                if (!this.userID.equals(playbackVolumeParameters.userID) || this.streamType != playbackVolumeParameters.streamType || this.volume != playbackVolumeParameters.volume) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8j4.A06((BV8.A0B(this.userID) + this.streamType) * 31, this.volume);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("PlaybackVolumeParameters{userID=");
        sbA0x.append(this.userID);
        sbA0x.append(",streamType=");
        sbA0x.append(this.streamType);
        sbA0x.append(",volume=");
        sbA0x.append(this.volume);
        return BV7.A11(sbA0x);
    }

    public PlaybackVolumeParameters(String str, int i, float f) {
        str.getClass();
        this.userID = str;
        this.streamType = i;
        this.volume = f;
    }
}
