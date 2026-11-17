package androidx.media3.exoplayer.drm;

/* loaded from: classes5.dex */
public final class UnsupportedDrmException extends Exception {
    public final int reason;

    public UnsupportedDrmException() {
        this.reason = 1;
    }

    public UnsupportedDrmException(Exception exc, int i) {
        super(exc);
        this.reason = i;
    }
}
