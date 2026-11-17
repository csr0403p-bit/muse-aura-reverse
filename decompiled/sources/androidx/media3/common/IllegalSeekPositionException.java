package androidx.media3.common;

/* loaded from: classes5.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final Timeline timeline;
    public final int windowIndex = -1;
    public final long positionMs = -9223372036854775807L;

    public IllegalSeekPositionException(Timeline timeline) {
        this.timeline = timeline;
    }
}
