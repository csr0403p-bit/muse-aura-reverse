package androidx.camera.core;

/* loaded from: classes5.dex */
public class CameraUnavailableException extends Exception {
    public final int mReason;

    public CameraUnavailableException(String str) {
        super(str);
        this.mReason = 3;
    }

    public CameraUnavailableException(int i, Throwable th) {
        super(th);
        this.mReason = i;
    }
}
