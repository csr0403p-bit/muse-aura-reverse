package com.facebook.common.dextricks;

import X.AnonymousClass002;
import android.content.Context;
import android.os.Build;

/* loaded from: classes5.dex */
public final class BrokenArtFaultHandler {
    public static final long ART_FAULT_HANDLER_FIXED = 340000000;

    public static boolean affectsThisDevice(Context context) {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 && i <= 33 && DexStoreUtils.getARTVersion(context) < ART_FAULT_HANDLER_FIXED;
    }

    public static boolean armedFaultsAreNotServiced() {
        return AnonymousClass002.A1Q(Build.VERSION.SDK_INT, 30);
    }
}
