package androidx.media3.exoplayer.audio;

import X.BV7;
import X.C3cG;

/* loaded from: classes5.dex */
public final class AudioSink$UnexpectedDiscontinuityException extends Exception {
    public final long actualPresentationTimeUs;
    public final long expectedPresentationTimeUs;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$UnexpectedDiscontinuityException(long j, long j2) {
        StringBuilder sbA0g = C3cG.A0g("Unexpected audio track timestamp discontinuity: expected ");
        sbA0g.append(j2);
        super(BV7.A0z(", got ", sbA0g, j));
        this.actualPresentationTimeUs = j;
        this.expectedPresentationTimeUs = j2;
    }
}
