package X;

import android.hardware.camera2.CameraCaptureSession;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class Bj2 {
    public final InterfaceC2810Bln A00;

    public final boolean equals(Object obj) {
        if (obj instanceof Bj2) {
            return this.A00.equals(((Bj2) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public Bj2(int i, List<C2746Bjn> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.A00 = new C2721Bir(i, list, executor, stateCallback);
    }
}
