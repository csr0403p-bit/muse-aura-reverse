package X;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* renamed from: X.BdQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2539BdQ extends C2543BdU {
    @Override // X.AbstractC2540BdR, X.InterfaceC2536BdN
    public final Set<Set<String>> ADq() throws CameraAccessExceptionCompat {
        try {
            return this.A00.getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public C2539BdQ(Context context) {
        super(context);
    }
}
