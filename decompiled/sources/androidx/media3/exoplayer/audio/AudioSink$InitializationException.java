package androidx.media3.exoplayer.audio;

import X.AnonymousClass001;
import X.C60O;
import X.C6154Dwx;

/* loaded from: classes5.dex */
public final class AudioSink$InitializationException extends Exception {
    public final int audioTrackState;
    public final C6154Dwx format;
    public final boolean isRecoverable;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(C6154Dwx c6154Dwx, Exception exc, int i, int i2, int i3, int i4, int i5, boolean z) {
        StringBuilder sbA0y = C60O.A0y("AudioTrack init failed ", i);
        sbA0y.append(" Config(");
        sbA0y.append(i2);
        sbA0y.append(", ");
        sbA0y.append(i3);
        sbA0y.append(", ");
        sbA0y.append(i4);
        sbA0y.append(", ");
        sbA0y.append(i5);
        sbA0y.append(") ");
        sbA0y.append(c6154Dwx);
        super(AnonymousClass001.A0v(z ? " (recoverable)" : "", sbA0y), exc);
        this.audioTrackState = i;
        this.isRecoverable = z;
        this.format = c6154Dwx;
    }
}
