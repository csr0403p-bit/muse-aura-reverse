package X;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.BdR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2540BdR implements InterfaceC2536BdN {
    public final CameraManager A00;

    @Override // X.InterfaceC2536BdN
    public Set<Set<String>> ADq() {
        return Collections.EMPTY_SET;
    }

    public AbstractC2540BdR(Context context) {
        this.A00 = (CameraManager) context.getSystemService("camera");
    }
}
