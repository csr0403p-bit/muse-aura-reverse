package androidx.media3.exoplayer;

/* loaded from: classes5.dex */
public final class ExoTimeoutException extends RuntimeException {
    public final int timeoutOperation;

    public ExoTimeoutException(int i) {
        super(i != 1 ? "Detaching surface timed out." : "Player release timed out.");
        this.timeoutOperation = i;
    }
}
