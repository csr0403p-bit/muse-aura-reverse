package X;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* loaded from: classes5.dex */
public final class Bh8 implements InterfaceC2676BhQ {
    public final int A00;
    public final long A01;
    public final Throwable A02;

    public Bh8(long j, Throwable th) {
        this.A01 = C3cG.A04(j);
        int i = 2;
        if (th instanceof CameraValidator$CameraIdListIncorrectException) {
            this.A00 = 2;
        } else if (th instanceof InitializationException) {
            Throwable cause = th.getCause();
            th = cause != null ? cause : th;
            this.A02 = th;
            if (!(th instanceof CameraUnavailableException)) {
                if (!(th instanceof IllegalArgumentException)) {
                    return;
                } else {
                    i = 1;
                }
            }
            this.A00 = i;
            return;
        }
        this.A02 = th;
    }
}
