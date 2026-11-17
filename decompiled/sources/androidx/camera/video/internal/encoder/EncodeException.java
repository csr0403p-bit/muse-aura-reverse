package androidx.camera.video.internal.encoder;

/* loaded from: classes5.dex */
public class EncodeException extends Exception {
    public final int mErrorType;

    public EncodeException(int i, String str, Throwable th) {
        super(str, th);
        this.mErrorType = i;
    }
}
