package com.facebook.aura.perf;

import X.HrW;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class HatchNavTTRCClock implements HrW {
    public static final HatchNavTTRCClock INSTANCE = new HatchNavTTRCClock();

    @Override // X.HrW
    public long now() {
        return SystemClock.uptimeMillis();
    }
}
