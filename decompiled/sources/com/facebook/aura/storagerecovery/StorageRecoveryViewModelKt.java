package com.facebook.aura.storagerecovery;

import X.ATD;

/* loaded from: classes3.dex */
public abstract class StorageRecoveryViewModelKt {
    public static final String TAG = "StorageRecoveryViewModel";

    public static final double clampPercent(double d) {
        return ATD.A00(d, 0.0d, 100.0d);
    }
}
