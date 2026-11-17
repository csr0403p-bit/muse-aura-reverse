package X;

import android.hardware.biometrics.BiometricManager;

/* loaded from: classes5.dex */
public abstract class EXF {
    public static int A00(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
