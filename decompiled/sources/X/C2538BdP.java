package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.BdP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2538BdP {
    public final InterfaceC2536BdN A00;
    public final Map<String, C2476Bc3> A01 = new ArrayMap(4);

    public final C2476Bc3 A00(String str) {
        C2476Bc3 c2476Bc3;
        Map<String, C2476Bc3> map = this.A01;
        synchronized (map) {
            c2476Bc3 = map.get(str);
            if (c2476Bc3 == null) {
                try {
                    try {
                        c2476Bc3 = new C2476Bc3(((C2543BdU) this.A00).A00.getCameraCharacteristics(str), str);
                        map.put(str, c2476Bc3);
                    } catch (CameraAccessException e) {
                        throw new CameraAccessExceptionCompat(e);
                    }
                } catch (AssertionError e2) {
                    throw new CameraAccessExceptionCompat(e2.getMessage(), e2);
                }
            }
        }
        return c2476Bc3;
    }

    public final void A01(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        try {
            ((AbstractC2540BdR) this.A00).A00.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public C2538BdP(InterfaceC2536BdN interfaceC2536BdN) {
        this.A00 = interfaceC2536BdN;
    }
}
