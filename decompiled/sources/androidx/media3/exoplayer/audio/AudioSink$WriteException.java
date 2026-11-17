package androidx.media3.exoplayer.audio;

import X.C6154Dwx;
import X.FGI;

/* loaded from: classes5.dex */
public final class AudioSink$WriteException extends Exception {
    public final int errorCode;
    public final C6154Dwx format;
    public final boolean isRecoverable;

    public AudioSink$WriteException(C6154Dwx c6154Dwx, int i, boolean z) {
        super(FGI.A0H("AudioTrack write failed: ", i));
        this.isRecoverable = z;
        this.errorCode = i;
        this.format = c6154Dwx;
    }
}
