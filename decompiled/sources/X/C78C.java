package X;

import android.os.PowerManager;

/* renamed from: X.78C, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C78C {
    public static final boolean A00(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }
}
